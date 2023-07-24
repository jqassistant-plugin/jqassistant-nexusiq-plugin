package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentFactDescriptor;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ConstraintFactDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorMapper;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentFact;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ConstraintFact;
import org.mapstruct.BeanMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;

@Mapper(uses = {ConditionFactMapper.class})
public interface ConstraintFactMapper extends DescriptorMapper<ConstraintFact, ConstraintFactDescriptor> {

}
