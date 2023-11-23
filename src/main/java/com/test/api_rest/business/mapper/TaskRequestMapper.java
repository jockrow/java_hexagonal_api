package com.test.api_rest.business.mapper;

import com.test.api_rest.domain.dto.request.TaskRequest;
import com.test.api_rest.domain.entity.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring") 
public interface TaskRequestMapper {


    @Mapping(source = "name", target = "name")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "timeRequiredToComplete", target = "timeRequiredToComplete")
    Task toDomain(TaskRequest request);

}
