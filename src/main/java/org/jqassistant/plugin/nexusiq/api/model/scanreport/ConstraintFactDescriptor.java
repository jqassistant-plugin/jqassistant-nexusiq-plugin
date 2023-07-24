package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

import java.util.List;

@Label("ConstraintFact")
public interface ConstraintFactDescriptor extends NexusIQDescriptor {

    @Relation("HAS_CONDITION_FACT")
    List<ConditionFactDescriptor> getConditionFacts();

    String getConstraintId();
    void setConstraintId(String constraintId);

    String getConstraintName();
    void setConstraintName(String constraintName);

    String getOperatorName();
    void setOperatorName(String operatorName);
}
