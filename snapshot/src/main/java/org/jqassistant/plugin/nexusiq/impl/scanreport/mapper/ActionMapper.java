package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ActionDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.Action;
import org.mapstruct.Mapper;

@Mapper
public interface ActionMapper extends DescriptorMapper<Action, ActionDescriptor> {
}
