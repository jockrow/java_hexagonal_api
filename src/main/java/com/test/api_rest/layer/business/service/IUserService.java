package com.test.api_rest.layer.business.service;

import com.test.api_rest.layer.domain.entity.User;

import java.util.List;

public interface IUserService {

	// User create(User user);
	// User getById(Long id);
	List<User> getAll();
	// void deleteById(Long id);
	// User update(User user);
}
