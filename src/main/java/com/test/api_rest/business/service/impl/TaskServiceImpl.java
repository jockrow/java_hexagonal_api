package com.test.api_rest.business.service.impl;

import com.test.api_rest.business.service.ITaskService;
import com.test.api_rest.common.exception.TaskException;
import com.test.api_rest.common.util.constant.TaskConstant;
import com.test.api_rest.domain.entity.Task;
import com.test.api_rest.persistence.TaskRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class TaskServiceImpl implements ITaskService {

    private final TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task create(Task request) {
        request.setInitialValues();
        return taskRepository.save(request);
    }

    @Override
    public Task getById(Long id) {

        return getTask(id);

    }

    private Task getTask(Long id) {

        var optionalTask = taskRepository.findById(id);

        if (optionalTask.isEmpty()){
            throw new TaskException(HttpStatus.NOT_FOUND, String.format(TaskConstant.TASK_NOT_FOUND_MESSAGE_ERROR, id));
        }

        return optionalTask.get();
    }

    @Override
    public List<Task> getAll() {
       return taskRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {

        taskRepository.deleteById(id);
    }

    @Override
    public Task update(Task task) {

        return taskRepository.save(task);

    }

    @Override
    public List<Task> getByIds(List<Long> tasksIds) {

       return taskRepository.findByIdIn(tasksIds);

    }

}
