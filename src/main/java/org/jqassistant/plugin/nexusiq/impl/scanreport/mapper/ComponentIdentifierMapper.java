package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentIdentifierDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorMapper;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentIdentifier;
import org.mapstruct.Mapper;

@Mapper(uses = {ComponentCoordinateMapper.class})
public interface ComponentIdentifierMapper extends DescriptorMapper<ComponentIdentifier, ComponentIdentifierDescriptor> {
}
