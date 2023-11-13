package com.test.api_rest.layer.business.facade;

import com.test.api_rest.layer.domain.dto.UserDto;
import com.test.api_rest.layer.domain.dto.request.UserRequest;

import java.util.List;

public interface IUserFacade {

	// UserDto createNew(UserRequest request);
	// UserDto getById(Long id);
	List<UserDto> getAll();
	// void deleteById(Long id);
	// UserDto update(UserRequest request, Long id);
}
