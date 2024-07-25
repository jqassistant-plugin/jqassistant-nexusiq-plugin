package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.TriggerDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.PolicyFact;
import org.mapstruct.Mapper;

@Mapper(uses = {ComponentFactMapper.class})
public interface TriggerMapper extends DescriptorMapper<PolicyFact, TriggerDescriptor> {

}
