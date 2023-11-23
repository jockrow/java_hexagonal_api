package com.test.api_rest.business.facade;

import com.test.api_rest.domain.dto.TaskDto;
import com.test.api_rest.domain.dto.request.TaskRequest;

import java.util.List;

public interface ITaskFacade {

    TaskDto createNew(TaskRequest request);
    TaskDto getById(Long id);
    List<TaskDto> getAll();
    void deleteById(Long id);
    TaskDto update(TaskRequest request, Long id);

}
