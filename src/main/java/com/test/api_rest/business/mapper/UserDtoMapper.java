package com.test.api_rest.business.mapper;

import com.test.api_rest.domain.dto.UserDto;
import com.test.api_rest.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserDtoMapper {

	@Mapping(source = "id", target = "id")
	@Mapping(source = "name", target = "name")
	@Mapping(source = "email", target = "email")
	@Mapping(source = "country", target = "country")
	@Mapping(source = "password", target = "password")
	UserDto toDto(User domain);

}
