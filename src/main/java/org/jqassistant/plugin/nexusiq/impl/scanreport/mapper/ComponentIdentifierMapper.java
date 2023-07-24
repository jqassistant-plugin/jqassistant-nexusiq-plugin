package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentCoordinateDescriptor;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentFactDescriptor;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentIdentifierDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorMapper;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentFact;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentIdentifier;
import org.mapstruct.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper(uses = {ComponentCoordinateMapper.class})
public interface ComponentIdentifierMapper extends DescriptorMapper<ComponentIdentifier, ComponentIdentifierDescriptor> {
}
