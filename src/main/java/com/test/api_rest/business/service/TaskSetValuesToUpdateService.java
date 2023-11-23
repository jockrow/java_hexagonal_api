package com.test.api_rest.business.service;

import com.test.api_rest.domain.dto.request.TaskRequest;
import com.test.api_rest.domain.dto.request.UserRequest;
import com.test.api_rest.domain.entity.Task;
import com.test.api_rest.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class TaskSetValuesToUpdateService {

    public void execute(TaskRequest request, Task currentTask){
        currentTask.setName(request.getName());
        currentTask.setDescription(request.getDescription());
        currentTask.setTimeRequiredToComplete(request.getTimeRequiredToComplete());
    }

}
