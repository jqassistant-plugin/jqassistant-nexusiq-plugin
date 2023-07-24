package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;
import com.buschmais.xo.neo4j.api.annotation.Relation;
import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

import java.util.List;

@Label("ComponentIdentifier")
public interface ComponentIdentifierDescriptor extends NexusIQDescriptor {

    String getFormat();
    void setFormat(String format);

    @Relation("HAS_COORDINATE")
    List<ComponentCoordinateDescriptor> getCoordinates();

}
