package org.jqassistant.plugin.nexusiq.api.model.scanreport;


import com.buschmais.xo.neo4j.api.annotation.Label;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

@Label("Coordinate")
public interface ComponentCoordinateDescriptor extends NexusIQDescriptor {

    String getName();
    void setName(String name);

    String getValue();
    void setValue(String value);

}
