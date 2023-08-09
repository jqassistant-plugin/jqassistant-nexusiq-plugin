package org.jqassistant.plugin.nexusiq.scanreport;

import com.buschmais.jqassistant.core.report.api.model.Result;
import com.buschmais.jqassistant.core.rule.api.model.Constraint;
import com.buschmais.jqassistant.core.shared.io.ClasspathResource;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.core.test.plugin.AbstractPluginIT;
import org.jqassistant.plugin.nexusiq.api.NexusIQScope;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.*;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ScanReportScannerIT extends AbstractPluginIT {

    @Test
    public void constraintWarningResult() throws Exception {
        File file = ClasspathResource.getFile(ScanReportScannerIT.class, "/scan-report/report.json");
        getScanner().scan(file, file.getAbsolutePath(), NexusIQScope.SCAN_REPORT);

        Result<Constraint> result = validateConstraint("nexusiq:Warning");
        assertThat(result.getStatus()).isEqualTo(Result.Status.WARNING);
        assertThat(result.getRows()).hasSize(1);
    }

    @Test
    public void constraintFailureResult() throws Exception {
        File file = ClasspathResource.getFile(ScanReportScannerIT.class, "/scan-report/report-fail.json");
        getScanner().scan(file, file.getAbsolutePath(), NexusIQScope.SCAN_REPORT);

        Result<Constraint> result = validateConstraint("nexusiq:Failure");
        assertThat(result.getStatus()).isEqualTo(Result.Status.FAILURE);
        assertThat(result.getRows()).hasSize(1);
    }

    @Test
    public void groupDefaultResult() throws Exception {
        File file = ClasspathResource.getFile(ScanReportScannerIT.class, "/scan-report/report.json");
        getScanner().scan(file, file.getAbsolutePath(), NexusIQScope.SCAN_REPORT);

        executeGroup("nexusiq:Default");
    }

    @Test
    public void scanReportFileDescriptor() {
        File file = ClasspathResource.getFile(ScanReportScannerIT.class, "/scan-report/report.json");
        Descriptor descriptor = getScanner().scan(file, file.getAbsolutePath(), NexusIQScope.SCAN_REPORT);

        store.beginTransaction();

        assertThat(descriptor).isInstanceOf(ScanReportFileDescriptor.class);

        TestResult testResult = query("MATCH (report:Json:File:NexusIQ:ScanReport) RETURN report");
        List<ScanReportFileDescriptor> scanReports = testResult.getColumn("report");
        assertThat(scanReports).hasSize(1);

        ScanReportFileDescriptor scanReport = scanReports.get(0);
        assertThat(scanReport.getApplicationId()).isEqualTo("test-application");
        assertThat(scanReport.getScanId()).isEqualTo("123abc456def");
        assertThat(scanReport.getPolicyAction()).isEqualTo("Failure");

        verifyPolicyEvaluationResult(scanReport.getPolicyEvaluationResult());

        store.commitTransaction();
    }

    private void verifyPolicyEvaluationResult(PolicyEvaluationResultDescriptor policyEvaluationResult) {
        assertThat(policyEvaluationResult).isNotNull();
        assertThat(policyEvaluationResult.getAffectedComponentCount()).isEqualTo(10);
        assertThat(policyEvaluationResult.getCriticalComponentCount()).isEqualTo(11);
        assertThat(policyEvaluationResult.getSevereComponentCount()).isEqualTo(12);
        assertThat(policyEvaluationResult.getModerateComponentCount()).isEqualTo(13);
        assertThat(policyEvaluationResult.getCriticalPolicyViolationCount()).isEqualTo(14);
        assertThat(policyEvaluationResult.getSeverePolicyViolationCount()).isEqualTo(15);
        assertThat(policyEvaluationResult.getModeratePolicyViolationCount()).isEqualTo(16);
        assertThat(policyEvaluationResult.getGrandfatheredPolicyViolationCount()).isEqualTo(17);
        assertThat(policyEvaluationResult.getTotalComponentCount()).isEqualTo(1000);

        assertThat(policyEvaluationResult.getAlerts()).hasSize(1);
        verifyPolicyAlert(policyEvaluationResult.getAlerts().get(0));
    }

    private void verifyPolicyAlert(PolicyAlertDescriptor policyAlert) {
        assertThat(policyAlert).isNotNull();

        assertThat(policyAlert.getActions()).hasSize(1);
        verifyAction(policyAlert.getActions().get(0));

        verifyTrigger(policyAlert.getTrigger());
    }

    private void verifyAction(ActionDescriptor action) {
        assertThat(action).isNotNull();
        assertThat(action.getActionTypeId()).isEqualTo("warn");
        assertThat(action.getTarget()).isNull();
        assertThat(action.getTargetType()).isNull();
    }

    private void verifyTrigger(TriggerDescriptor trigger) {
        assertThat(trigger).isNotNull();
        assertThat(trigger.getPolicyId()).isEqualTo("p1");
        assertThat(trigger.getPolicyName()).isEqualTo("Architecture-Policy-X");
        assertThat(trigger.getPolicyViolationId()).isEqualTo("pv1");
        assertThat(trigger.getThreatLevel()).isEqualTo(7);

        assertThat(trigger.getComponentFacts()).hasSize(1);
        verifyComponentFact(trigger.getComponentFacts().get(0));
    }

    private void verifyComponentFact(ComponentFactDescriptor componentFact) {
        assertThat(componentFact).isNotNull();
        assertThat(componentFact.getHash()).isEqualTo("xyz789");
        assertThat(componentFact.getDisplayName()).isEqualTo("com.example : my-artifact : 1.0.0");

        assertThat(componentFact.getConstraintFacts()).hasSize(1);
        verifyConstraintFact(componentFact.getConstraintFacts().get(0));

        verifyComponentIdentifier(componentFact.getComponentIdentifier());
    }

    private void verifyConstraintFact(ConstraintFactDescriptor constraintFact) {
        assertThat(constraintFact).isNotNull();
        assertThat(constraintFact.getConstraintId()).isEqualTo("c1");
        assertThat(constraintFact.getConstraintName()).isEqualTo("My Architecture Constraint");
        assertThat(constraintFact.getOperatorName()).isEqualTo("OR");

        assertThat(constraintFact.getConditionFacts()).hasSize(1);
        verifyConditionFact(constraintFact.getConditionFacts().get(0));
    }

    private void verifyConditionFact(ConditionFactDescriptor conditionFact) {
        assertThat(conditionFact).isNotNull();
        assertThat(conditionFact.getConditionTypeId()).isEqualTo("SomeTypeId");
        assertThat(conditionFact.getConditionIndex()).isEqualTo(0);
        assertThat(conditionFact.getSummary()).isEqualTo("Summary");
        assertThat(conditionFact.getReason()).isEqualTo("Reason");

        verifyTriggerReference(conditionFact.getReference());
    }

    private void verifyTriggerReference(TriggerReferenceDescriptor reference) {
        assertThat(reference).isNotNull();
        assertThat(reference.getType()).isEqualTo("SECURITY_VULNERABILITY_REFID");
        assertThat(reference.getValue()).isEqualTo("REFERENCE-VALUE");
    }

    private void verifyComponentIdentifier(ComponentIdentifierDescriptor componentIdentifier) {
        assertThat(componentIdentifier).isNotNull();
        assertThat(componentIdentifier.getFormat()).isEqualTo("maven");

        assertThat(componentIdentifier.getCoordinates()).hasSize(5);
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("artifactId") && c.getValue().equals("my-artifact"));
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("classifier") && c.getValue().isEmpty());
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("extension") && c.getValue().equals("jar"));
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("groupId") && c.getValue().equals("com.example"));
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("version") && c.getValue().equals("1.0.0"));
    }
}
