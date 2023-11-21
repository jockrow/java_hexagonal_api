package com.test.api_rest.business.facade.impl;

import com.test.api_rest.business.facade.IUserFacade;
import com.test.api_rest.business.mapper.UserDtoMapper;
import com.test.api_rest.business.mapper.UserRequestMapper;
import com.test.api_rest.business.service.IUserService;
import com.test.api_rest.business.service.UserSetValuesToUpdateService;
import com.test.api_rest.domain.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserFacade implements IUserFacade {

	private final IUserService iUserService;
	private final UserRequestMapper userRequestMapper;
	private final UserDtoMapper userDtoMapper;
	private final UserSetValuesToUpdateService userSetValuesToUpdateService;

	public UserFacade(IUserService iUserService,
			UserRequestMapper userRequestMapper,
			UserDtoMapper userDtoMapper,
			UserSetValuesToUpdateService userSetValuesToUpdateService) {
		this.iUserService = iUserService;
		this.userRequestMapper = userRequestMapper;
		this.userDtoMapper = userDtoMapper;
		this.userSetValuesToUpdateService = userSetValuesToUpdateService;
	}

	// public UserFacade(
	// UserRequestMapper userRequestMapper,
	// UserDtoMapper userDtoMapper,
	// UserSetValuesToUpdateService userSetValuesToUpdateService) {
	// this.userRequestMapper = userRequestMapper;
	// this.userDtoMapper = userDtoMapper;
	// this.userSetValuesToUpdateService = userSetValuesToUpdateService;
	// }

	// public UserDto createNew(UserRequest request) {
	// var userRequest = userRequestMapper.toDomain(request);
	// var userCreated = iUserService.create(userRequest);
	// return userDtoMapper.toDto(userCreated);
	// }

	// public UserDto getById(Long id) {
	//
	// var user = iUserService.getById(id);
	//
	// return userDtoMapper.toDto(user);
	// }

	public List<UserDto> getAll() {
		var users = iUserService.getAll();

		return users
				.stream()
				.map(userDtoMapper::toDto)
				.collect(Collectors.toList());
	}

	// public void deleteById(Long id) {
	//
	// var user = iUserService.getById(id);
	//
	// // userValidateAvailabilityToDeleteService.execute(user);
	//
	// iUserService.deleteById(id);
	// }
	//
	// public UserDto update(UserRequest request, Long id) {
	//
	// var userToUpdate = userRequestMapper.toDomain(request);
	//
	// userSetValuesToUpdateService.execute(request, userToUpdate);
	//
	// var userUpdated = iUserService.update(userToUpdate);
	//
	// return userDtoMapper.toDto(userUpdated);
	// }

}
