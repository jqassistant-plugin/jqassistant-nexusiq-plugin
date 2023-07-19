package org.jqassistant.plugin.nexusiq.api.model.scanreport;

import com.buschmais.xo.neo4j.api.annotation.Label;

import org.jqassistant.plugin.nexusiq.api.model.NexusIQDescriptor;

@Label("Reoirt")
public interface ScanReportDescriptor extends NexusIQDescriptor {

    String getApplicationId();

    void setApplicationId(String applicationId);

}
