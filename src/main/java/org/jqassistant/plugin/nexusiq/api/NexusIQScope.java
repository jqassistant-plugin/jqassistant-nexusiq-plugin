package org.jqassistant.plugin.nexusiq.api;

import com.buschmais.jqassistant.core.scanner.api.Scope;

public enum NexusIQScope implements Scope {

    SCAN_REPORT;

    @Override
    public String getPrefix() {
        return "nexus-iq";
    }

    @Override
    public String getName() {
        return name();
    }
}
