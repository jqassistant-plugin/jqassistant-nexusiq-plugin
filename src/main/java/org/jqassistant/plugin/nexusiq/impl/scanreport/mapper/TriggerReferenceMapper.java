package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ConditionFactDescriptor;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.TriggerDescriptor;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.TriggerReferenceDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorMapper;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ConditionFact;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.PolicyFact;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.TriggerReference;
import org.mapstruct.BeanMapping;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TriggerReferenceMapper extends DescriptorMapper<TriggerReference, TriggerReferenceDescriptor> {

    @Override
    @Mapping(source = "type.value", target = "type")
    TriggerReferenceDescriptor toDescriptor(TriggerReference type, @Context Scanner scanner);

}
