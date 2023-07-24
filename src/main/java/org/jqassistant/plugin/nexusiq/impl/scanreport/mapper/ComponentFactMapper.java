package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentFactDescriptor;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ScanReportDescriptor;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.TriggerDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorMapper;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ApiReportResultsDTO;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentFact;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.PolicyFact;
import org.mapstruct.BeanMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper(uses = {ComponentIdentifierMapper.class, ConstraintFactMapper.class})
public interface ComponentFactMapper extends DescriptorMapper<ComponentFact, ComponentFactDescriptor> {

    @Override
    @BeanMapping(ignoreUnmappedSourceProperties = {"pathnames", "displayName"})
    ComponentFactDescriptor toDescriptor(ComponentFact type, @Context Scanner scanner);

}
