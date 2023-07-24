package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentCoordinateDescriptor;
import org.jqassistant.plugin.nexusiq.impl.mapper.DescriptorMapper;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.mapstruct.factory.Mappers.getMapper;

@Mapper
public interface ComponentCoordinateMapper extends DescriptorMapper<Map.Entry<String, String>, ComponentCoordinateDescriptor>{

    @Override
    @Mapping(source = "key", target = "name")
    ComponentCoordinateDescriptor toDescriptor(Map.Entry<String, String> type, @Context Scanner scanner);

    default List<ComponentCoordinateDescriptor> map(Map<String,String> value, @Context Scanner scanner) {
        return value.entrySet().stream().map(stringStringEntry ->
           toDescriptor(stringStringEntry, scanner)
        ).collect(Collectors.toList());
    }
}
