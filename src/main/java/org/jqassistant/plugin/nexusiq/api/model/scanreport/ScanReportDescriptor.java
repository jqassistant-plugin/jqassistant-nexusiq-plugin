package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;

import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

@Label("ScanReport")
public interface ScanReportDescriptor extends NexusIQDescriptor {

    String getApplicationId();
    void setApplicationId(String applicationId);

    String getScanId();
    void setScanId(String scanId);

    // TODO: generate correct OpenAPI specification
//    String getPolicyAction();
//    void setPolicyAction(String policyAction);

    @Relation("HAS_RESULT")
    PolicyEvaluationResultDescriptor getPolicyEvaluationResult();
    void setPolicyEvaluationResult(PolicyEvaluationResultDescriptor policyEvaluationResultDescriptor);
}
