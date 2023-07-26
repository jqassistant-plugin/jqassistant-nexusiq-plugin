package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.TriggerDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorMapper;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.PolicyFact;
import org.mapstruct.Mapper;

@Mapper(uses = {ComponentFactMapper.class})
public interface TriggerMapper extends DescriptorMapper<PolicyFact, TriggerDescriptor> {

}
