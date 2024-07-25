package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

import java.util.List;

@Label("PolicyAlert")
public interface PolicyAlertDescriptor extends NexusIQDescriptor {

    @Relation("HAS_TRIGGER")
    TriggerDescriptor getTrigger();
    void setTrigger(TriggerDescriptor trigger);

    @Relation("DEFINES_ACTION")
    List<ActionDescriptor> getActions();

}
