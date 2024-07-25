package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

@Label("TriggerReference")
public interface TriggerReferenceDescriptor extends NexusIQDescriptor {
    String getType();
    void setType(String type);

    String getValue();
    void setValue(String value);

}
