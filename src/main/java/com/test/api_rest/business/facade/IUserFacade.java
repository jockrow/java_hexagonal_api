package com.test.api_rest.business.facade;

import com.test.api_rest.domain.dto.UserDto;

import java.util.List;

public interface IUserFacade {

	// UserDto createNew(UserRequest request);
	// UserDto getById(Long id);
	List<UserDto> getAll();
	// void deleteById(Long id);
	// UserDto update(UserRequest request, Long id);
}