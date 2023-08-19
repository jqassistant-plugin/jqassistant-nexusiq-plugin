package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentIdentifierDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentIdentifier;
import org.mapstruct.Mapper;

@Mapper(uses = {ComponentCoordinateMapper.class})
public interface ComponentIdentifierMapper extends DescriptorMapper<ComponentIdentifier, ComponentIdentifierDescriptor> {
}
