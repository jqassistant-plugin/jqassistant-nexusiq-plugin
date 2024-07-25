package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorEnricher;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ScanReportDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ApiReportResultsDTO;
import org.mapstruct.*;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(uses = {PolicyEvaluationResultMapper.class})
public interface ScanReportMapper extends DescriptorEnricher<ApiReportResultsDTO, ScanReportDescriptor> {

    ScanReportMapper INSTANCE = getMapper(ScanReportMapper.class);

    @Override
    @Mapping(source = "applicationId", target = "applicationId")
    @BeanMapping(ignoreUnmappedSourceProperties = {"commitHash", "embeddableReportHtmlUrl", "evaluationDate", "isForMonitoring", "isReevaluation",
        "latestReportHtmlUrl", "policyEvaluationId", "reportDataUrl", "reportHtmlUrl", "reportPdfUrl", "stage"})
    ScanReportDescriptor toDescriptor(ApiReportResultsDTO type, @MappingTarget ScanReportDescriptor target, @Context Scanner scanner);
}

