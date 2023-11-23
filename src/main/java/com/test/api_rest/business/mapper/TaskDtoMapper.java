package com.test.api_rest.business.mapper;

import com.test.api_rest.domain.dto.TaskDto;
import com.test.api_rest.domain.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") 
public interface TaskDtoMapper {


    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "timeRequiredToComplete", target = "timeRequiredToComplete")
    TaskDto toDto(Task domain);

}
