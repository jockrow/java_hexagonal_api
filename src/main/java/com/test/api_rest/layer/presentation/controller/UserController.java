package com.test.api_rest.layer.presentation.controller;

import com.test.api_rest.layer.business.facade.IUserFacade;
import com.test.api_rest.layer.domain.dto.UserDto;
import com.test.api_rest.layer.domain.dto.request.UserRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

	private final IUserFacade iUserFacade;

	public UserController(IUserFacade iUserFacade) {
		this.iUserFacade = iUserFacade;
	}

	@GetMapping("/{id}")
	public UserDto getById(@PathVariable long id) {
		return iUserFacade.getById(id);
	}

	@GetMapping
	public List<UserDto> getAll() {
		return iUserFacade.getAll();
	}

	@DeleteMapping("/{id}")
	public void deleteUserById(@PathVariable Long id) {
		iUserFacade.deleteById(id);
	}

}
