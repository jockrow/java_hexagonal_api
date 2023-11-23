package com.test.api_rest.business.facade.impl;

import com.test.api_rest.business.facade.ITaskFacade;
import com.test.api_rest.business.mapper.TaskDtoMapper;
import com.test.api_rest.business.mapper.TaskRequestMapper;
import com.test.api_rest.business.service.ITaskService;
import com.test.api_rest.business.service.TaskSetValuesToUpdateService;
import com.test.api_rest.business.service.TaskValidateAvailabilityToDeleteService;
import com.test.api_rest.domain.dto.TaskDto;
import com.test.api_rest.domain.dto.request.TaskRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskFacade implements ITaskFacade {

    private final ITaskService iTaskService;
    private final TaskRequestMapper taskRequestMapper;
    private final TaskDtoMapper taskDtoMapper;
    private final TaskValidateAvailabilityToDeleteService taskValidateAvailabilityToDeleteService;
    private final TaskSetValuesToUpdateService taskSetValuesToUpdateService;
    public TaskFacade(ITaskService iTaskService,
                      TaskRequestMapper taskRequestMapper,
                      TaskDtoMapper taskDtoMapper,
                      TaskValidateAvailabilityToDeleteService taskValidateAvailabilityToDeleteService, TaskSetValuesToUpdateService taskSetValuesToUpdateService) {
        this.iTaskService = iTaskService;
        this.taskRequestMapper = taskRequestMapper;
        this.taskDtoMapper = taskDtoMapper;
        this.taskValidateAvailabilityToDeleteService = taskValidateAvailabilityToDeleteService;
        this.taskSetValuesToUpdateService = taskSetValuesToUpdateService;
    }

    public TaskDto createNew(TaskRequest request){

        var taskToCreate = taskRequestMapper.toDomain(request);

        var taskCreated = iTaskService.create(taskToCreate);

        return taskDtoMapper.toDto(taskCreated);
    }

    public TaskDto getById(Long id){

        var task = iTaskService.getById(id);

        return taskDtoMapper.toDto(task);
    }

    public List<TaskDto> getAll(){
        var tasks = iTaskService.getAll();
        return tasks
                .stream()
                .map(taskDtoMapper::toDto)
                .collect(Collectors.toList());
    }

    public void deleteById(Long id){

        var task = iTaskService.getById(id);

        taskValidateAvailabilityToDeleteService.execute(task);

        iTaskService.deleteById(id);
    }

    public TaskDto update(TaskRequest request, Long id){

        var taskToUpdate = taskRequestMapper.toDomain(request);

        taskSetValuesToUpdateService.execute(request, taskToUpdate);

        var taskUpdated = iTaskService.update(taskToUpdate);

        return taskDtoMapper.toDto(taskUpdated);
    }

}
