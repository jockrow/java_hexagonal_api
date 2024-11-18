package com.test.api_rest.business.service;

import com.test.api_rest.common.exception.UserException;
import com.test.api_rest.common.util.constant.TaskConstant;
import com.test.api_rest.domain.entity.Task;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class TaskValidateAvailabilityToDeleteService {
	public void execute(Task task) {
        if(!task.getUsers().isEmpty()){
            throw new UserException(HttpStatus.BAD_REQUEST,
                    String.format(TaskConstant.CURRENT_TASK_NOT_ALLOW_TO_DELETE, task.getId()));
        }
    }
}
