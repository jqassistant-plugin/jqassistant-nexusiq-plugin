package org.jqassistant.plugin.nexusiq.scanreport;

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
    @TestStore(type = TestStore.Type.REMOTE)
    public void testScanReportFileDescriptor() {
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

        testPolicyEvaluationResult(scanReport.getPolicyEvaluationResult());

        store.commitTransaction();
    }

    private void testPolicyEvaluationResult(PolicyEvaluationResultDescriptor policyEvaluationResult) {
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
        testPolicyAlert(policyEvaluationResult.getAlerts().get(0));
    }

    private void testPolicyAlert(PolicyAlertDescriptor policyAlert) {
        assertThat(policyAlert).isNotNull();

        assertThat(policyAlert.getActions()).hasSize(1);
        testAction(policyAlert.getActions().get(0));

        testTrigger(policyAlert.getTrigger());
    }

    private void testAction(ActionDescriptor action) {
        assertThat(action).isNotNull();
        assertThat(action.getActionTypeId()).isEqualTo("warn");
        assertThat(action.getTarget()).isNull();
        assertThat(action.getTargetType()).isNull();
    }

    private void testTrigger(TriggerDescriptor trigger) {
        assertThat(trigger).isNotNull();
        assertThat(trigger.getPolicyId()).isEqualTo("p1");
        assertThat(trigger.getPolicyName()).isEqualTo("Architecture-Policy-X");
        assertThat(trigger.getPolicyViolationId()).isEqualTo("pv1");
        assertThat(trigger.getThreatLevel()).isEqualTo(7);

        assertThat(trigger.getComponentFacts()).hasSize(1);
        testComponentFact(trigger.getComponentFacts().get(0));
    }

    private void testComponentFact(ComponentFactDescriptor componentFact) {
        assertThat(componentFact).isNotNull();
        assertThat(componentFact.getHash()).isEqualTo("xyz789");

        assertThat(componentFact.getConstraintFacts()).hasSize(1);
        testConstraintFact(componentFact.getConstraintFacts().get(0));

        testComponentIdentifier(componentFact.getComponentIdentifier());
    }

    private void testConstraintFact(ConstraintFactDescriptor constraintFact) {
        assertThat(constraintFact).isNotNull();
        assertThat(constraintFact.getConstraintId()).isEqualTo("c1");
        assertThat(constraintFact.getConstraintName()).isEqualTo("My Architecture Constraint");
        assertThat(constraintFact.getOperatorName()).isEqualTo("OR");

        assertThat(constraintFact.getConditionFacts()).hasSize(1);
        testConditionFact(constraintFact.getConditionFacts().get(0));
    }

    private void testConditionFact(ConditionFactDescriptor conditionFact) {
        assertThat(conditionFact).isNotNull();
        assertThat(conditionFact.getConditionTypeId()).isEqualTo("SomeTypeId");
        assertThat(conditionFact.getConditionIndex()).isEqualTo(0);
        assertThat(conditionFact.getSummary()).isEqualTo("Summary");
        assertThat(conditionFact.getReason()).isEqualTo("Reason");

        testTriggerReference(conditionFact.getReference());
    }

    private void testTriggerReference(TriggerReferenceDescriptor reference) {
        assertThat(reference).isNotNull();
        assertThat(reference.getType()).isEqualTo("SECURITY_VULNERABILITY_REFID");
        assertThat(reference.getValue()).isEqualTo("REFERENCE-VALUE");
    }

    private void testComponentIdentifier(ComponentIdentifierDescriptor componentIdentifier) {
        assertThat(componentIdentifier).isNotNull();
        assertThat(componentIdentifier.getFormat()).isEqualTo("maven");

        assertThat(componentIdentifier.getCoordinates()).hasSize(5);
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("artifactId") && c.getValue().equals("my-artifact"));
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("classifier") && c.getValue().equals(""));
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("extension") && c.getValue().equals("jar"));
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("groupId") && c.getValue().equals("com.example"));
        assertThat(componentIdentifier.getCoordinates()).anyMatch(c -> c.getName().equals("version") && c.getValue().equals("1.0.0"));
    }
}
