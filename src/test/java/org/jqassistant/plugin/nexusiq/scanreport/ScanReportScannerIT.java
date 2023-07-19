package org.jqassistant.plugin.nexusiq.scanreport;

import java.io.File;

import com.buschmais.jqassistant.core.shared.io.ClasspathResource;
import com.buschmais.jqassistant.core.store.api.model.Descriptor;
import com.buschmais.jqassistant.core.test.plugin.AbstractPluginIT;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ScanReportFileDescriptor;
import org.jqassistant.plugin.nexusiq.api.NexusIQScope;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScanReportScannerIT extends AbstractPluginIT {

    @Test
    //@TestStore(type = TestStore.Type.REMOTE)
    void report() {
        File file = ClasspathResource.getFile(ScanReportScannerIT.class, "/scan-report/report.json");
        Descriptor descriptor = getScanner().scan(file, file.getAbsolutePath(), NexusIQScope.SCAN_REPORT);
        store.beginTransaction();
        assertThat(descriptor).isInstanceOf(ScanReportFileDescriptor.class);
        ScanReportFileDescriptor scanReportFileDescriptor = (ScanReportFileDescriptor) descriptor;
        store.commitTransaction();
    }
}
