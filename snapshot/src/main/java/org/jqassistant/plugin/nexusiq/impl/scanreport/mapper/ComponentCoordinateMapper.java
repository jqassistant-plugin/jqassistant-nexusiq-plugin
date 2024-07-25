package org.jqassistant.plugin.nexusiq.impl.scanreport.mapper;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.buschmais.jqassistant.core.scanner.api.Scanner;
import com.buschmais.jqassistant.plugin.common.api.mapper.DescriptorMapper;

import org.jqassistant.plugin.nexusiq.api.model.scanreport.ComponentCoordinateDescriptor;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

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
