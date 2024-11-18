package com.test.api_rest.business.service;

import com.test.api_rest.domain.dto.request.UserRequest;
import com.test.api_rest.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserSetValuesToUpdateService {

	public void execute(UserRequest request, User currentUser) {
		currentUser.setName(request.getName());
		currentUser.setEmail(request.getEmail());
		currentUser.setCountry(request.getCountry());
	}

}
