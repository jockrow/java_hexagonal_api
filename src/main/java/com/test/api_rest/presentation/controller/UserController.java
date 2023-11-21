package com.test.api_rest.presentation.controller;

import com.test.api_rest.business.facade.IUserFacade;
import com.test.api_rest.domain.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	private final IUserFacade iUserFacade;

	public UserController(IUserFacade iUserFacade) {
		this.iUserFacade = iUserFacade;
	}

	// @GetMapping("/{id}")
	// public UserDto getById(@PathVariable long id) {
	// return iUserFacade.getById(id);
	// }

	@GetMapping
	public List<UserDto> getAll() {
		return iUserFacade.getAll();
	}

	// @DeleteMapping("/{id}")
	// public void deleteUserById(@PathVariable Long id) {
	// iUserFacade.deleteById(id);
	// }

}
