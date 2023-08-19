package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentFactDescriptor;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentDisplayName;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentDisplayNamePart;
import org.jqassistant.plugin.nexusiq.impl.scanreport.generated.model.ComponentFact;
import org.mapstruct.*;

@Mapper(uses = {ComponentIdentifierMapper.class, ConstraintFactMapper.class})
public interface ComponentFactMapper extends DescriptorMapper<ComponentFact, ComponentFactDescriptor> {

    @Override
    @BeanMapping(ignoreUnmappedSourceProperties = {"pathnames"})
    @Mapping(source = "displayName", target = "displayName", qualifiedByName = "convertDisplayName")
    ComponentFactDescriptor toDescriptor(ComponentFact type, @Context Scanner scanner);

    @Named("convertDisplayName")
    default String convertDisplayName(ComponentDisplayName displayName) {
        if(displayName == null || displayName.getParts() == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder();
        for(ComponentDisplayNamePart part : displayName.getParts()) {
            builder.append(part.getValue());
        }
        return builder.toString();
    }
}
