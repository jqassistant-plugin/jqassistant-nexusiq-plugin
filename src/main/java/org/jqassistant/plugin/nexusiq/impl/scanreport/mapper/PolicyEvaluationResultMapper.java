package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.PolicyEvaluationResultDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.PolicyEvaluationResult;
import org.mapstruct.Mapper;

@Mapper(uses = {PolicyAlertMapper.class})
public interface PolicyEvaluationResultMapper extends DescriptorMapper<PolicyEvaluationResult, PolicyEvaluationResultDescriptor> {
}
