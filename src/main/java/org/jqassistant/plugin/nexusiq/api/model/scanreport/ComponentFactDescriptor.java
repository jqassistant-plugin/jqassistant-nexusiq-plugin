package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

import java.util.List;

@Label("ComponentFact")
public interface ComponentFactDescriptor extends NexusIQDescriptor {

    @Relation("IDENTIFIED_BY")
    ComponentIdentifierDescriptor getComponentIdentifier();
    void setComponentIdentifier(ComponentIdentifierDescriptor componentIdentifier);

    @Relation("HAS_CONSTRAINT_FACT")
    List<ConstraintFactDescriptor> getConstraintFacts();

    String getHash();
    void setHash(String hash);
}
