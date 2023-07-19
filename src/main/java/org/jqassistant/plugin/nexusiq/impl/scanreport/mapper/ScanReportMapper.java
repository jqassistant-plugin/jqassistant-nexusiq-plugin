package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ScanReportDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorEnricher;
import org.jqassistant.plugin.nexusiq.impl.scanreport.model.ScanReport;
import org.mapstruct.Mapper;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper
public interface ScanReportMapper extends DescriptorEnricher<ScanReport, ScanReportDescriptor> {

    ScanReportMapper INSTANCE = getMapper(ScanReportMapper.class);

}

