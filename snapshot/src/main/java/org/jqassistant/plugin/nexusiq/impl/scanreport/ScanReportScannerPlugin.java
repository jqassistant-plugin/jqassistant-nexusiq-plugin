package org.jqassistant.plugin.nexusiq.impl.scanreport;

import java.io.IOException;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.core.scanner.api.ScannerContext;
import com.buschmais.jqassistant.core.scanner.api.ScannerPlugin.Requires;
import com.buschmais.jqassistant.core.scanner.api.Scope;
import com.buschmais.jqassistant.plugin.common.api.scanner.AbstractScannerPlugin;
import com.buschmais.jqassistant.plugin.common.api.scanner.filesystem.FileResource;
import com.buschmais.jqassistant.plugin.json.api.model.JSONFileDescriptor;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jqassistant.plugin.nexusiq.api.NexusIQScope;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ScanReportFileDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ApiReportResultsDTO;
import org.jqassistant.plugin.nexusiq.impl.scanreport.mapper.ScanReportMapper;

@Requires(JSONFileDescriptor.class)
public class ScanReportScannerPlugin extends AbstractScannerPlugin<FileResource, ScanReportFileDescriptor> {

    private ObjectMapper objectMapper;

    @Override
    public void initialize() {
        this.objectMapper = new ObjectMapper();
        this.objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    @Override
    public boolean accepts(FileResource fileResource, String path, Scope scope) {
        return NexusIQScope.SCAN_REPORT.equals(scope) && path.endsWith(".json");
    }

    @Override
    public ScanReportFileDescriptor scan(FileResource fileResource, String s, Scope scope, Scanner scanner) throws IOException {
        ScannerContext scannerContext = scanner.getContext();
        JSONFileDescriptor jsonFileDescriptor = scannerContext.getCurrentDescriptor();
        ScanReportFileDescriptor scanReportFileDescriptor = scannerContext.getStore()
            .addDescriptorType(jsonFileDescriptor, ScanReportFileDescriptor.class);

        ApiReportResultsDTO scanReport = objectMapper.readValue(fileResource.createStream(), ApiReportResultsDTO.class);

        ScanReportMapper.INSTANCE.toDescriptor(scanReport, scanReportFileDescriptor, scanner);
        return scanReportFileDescriptor;
    }

}
