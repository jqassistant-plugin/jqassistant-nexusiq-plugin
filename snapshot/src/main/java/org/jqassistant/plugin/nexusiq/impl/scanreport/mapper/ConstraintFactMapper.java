package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ConstraintFactDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ConstraintFact;
import org.mapstruct.Mapper;

@Mapper(uses = {ConditionFactMapper.class})
public interface ConstraintFactMapper extends DescriptorMapper<ConstraintFact, ConstraintFactDescriptor> {

}
