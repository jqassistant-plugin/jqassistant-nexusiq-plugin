package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

import java.util.List;

@Label("PolicyEvaluationResult")
public interface PolicyEvaluationResultDescriptor extends NexusIQDescriptor {

    @Relation("HAS_ALERT")
    List<PolicyAlertDescriptor> getAlerts();

    Integer getAffectedComponentCount();
    void setAffectedComponentCount(Integer affectedComponentCount);

    Integer getCriticalComponentCount();
    void setCriticalComponentCount(Integer criticalComponentCount);

    Integer getCriticalPolicyViolationCount();
    void setCriticalPolicyViolationCount(Integer criticalPolicyViolationCount);

    Integer getGrandfatheredPolicyViolationCount();
    void setGrandfatheredPolicyViolationCount(Integer grandfatheredPolicyViolationCount);

    Integer getModerateComponentCount();
    void setModerateComponentCount(Integer moderateComponentCount);

    Integer getModeratePolicyViolationCount();
    void setModeratePolicyViolationCount(Integer moderatePolicyViolationCount);

    Integer getSevereComponentCount();
    void setSevereComponentCount(Integer severeComponentCount);

    Integer getSeverePolicyViolationCount();
    void setSeverePolicyViolationCount(Integer severePolicyViolationCount);

    Integer getTotalComponentCount();
    void setTotalComponentCount(Integer totalComponentCount);
}
