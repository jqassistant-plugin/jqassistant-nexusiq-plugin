package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

@Label("ConditionFact")
public interface ConditionFactDescriptor extends NexusIQDescriptor {

    Integer getConditionIndex();
    void setConditionIndex(Integer conditionIndex);

    String getConditionTypeId();
    void setConditionTypeId(String conditionTypeId);

    String getReason();
    void setReason(String reason);

    String getSummary();
    void setSummary(String summary);

    @Relation("REFERENCES")
    TriggerReferenceDescriptor getReference();
    void setReference(TriggerReferenceDescriptor reference);

}
