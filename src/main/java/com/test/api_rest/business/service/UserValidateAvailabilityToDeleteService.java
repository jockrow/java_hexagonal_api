package com.test.api_rest.business.service;

import com.test.api_rest.common.exception.UserException;
import com.test.api_rest.common.util.constant.TaskConstant;
import com.test.api_rest.common.util.constant.UserConstant;
import com.test.api_rest.domain.entity.Task;
import com.test.api_rest.domain.entity.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserValidateAvailabilityToDeleteService {

	public void execute(User user) {

		if (!user.getTasks().isEmpty()) {
			throw new UserException(HttpStatus.BAD_REQUEST,
					String.format(UserConstant.CURRENT_USER_NOT_ALLOW_TO_DELETE, user.getName()));
		}
	}

}
