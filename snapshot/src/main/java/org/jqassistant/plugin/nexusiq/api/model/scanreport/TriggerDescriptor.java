package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

import java.util.List;

@Label("Trigger")
public interface TriggerDescriptor extends NexusIQDescriptor {

    String getPolicyId();
    void setPolicyId(String policyId);

    String getPolicyName();
    void setPolicyName(String policyName);

    String getPolicyViolationId();
    void setPolicyViolationId(String policyViolationId);

    Integer getThreatLevel();
    void setThreatLevel(Integer threatLevel);

    @Relation("HAS_COMPONENT_FACT")
    List<ComponentFactDescriptor> getComponentFacts();

}
