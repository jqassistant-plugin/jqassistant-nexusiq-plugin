package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

@Label("Action")
public interface ActionDescriptor extends NexusIQDescriptor {

    String getActionTypeId();
    void setActionTypeId(String actionTypeId);

    String getTarget();
    void setTarget(String target);

    String getTargetType();
    void setTargetType(String targetType);

}
