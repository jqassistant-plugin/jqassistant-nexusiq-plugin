package org.jqassistant.plugin.nexusiq.api;

import com.buschmais.jqassistant.core.scanner.api.Scope;

import static com.google.common.base.CaseFormat.LOWER_HYPHEN;
import static com.google.common.base.CaseFormat.UPPER_UNDERSCORE;

public enum NexusIQScope implements Scope {

    SCAN_REPORT;

    @Override
    public String getPrefix() {
        return "nexus-iq";
    }

    @Override
    public String getName() {
        return UPPER_UNDERSCORE.to(LOWER_HYPHEN, name());
    }
}
