package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.PolicyAlertDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.PolicyAlert;
import org.mapstruct.Mapper;

@Mapper(uses = {TriggerMapper.class, ActionMapper.class})
public interface PolicyAlertMapper extends DescriptorMapper<PolicyAlert, PolicyAlertDescriptor> {
}
