package com.test.api_rest.business.service;

import com.test.api_rest.domain.entity.Task;

import java.util.List;

public interface ITaskService {

    Task create(Task request);
    Task getById(Long id);
    List<Task> getAll();
    void deleteById(Long id);
    Task update(Task request);
    List<Task> getByIds(List<Long> tasksIds);
}
