package com.test.api_rest.layer.business.mapper;

import com.test.api_rest.layer.domain.dto.request.UserRequest;
import com.test.api_rest.layer.domain.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserRequestMapper {

	@Mapping(source = "name", target = "name")
	@Mapping(source = "email", target = "email")
	@Mapping(source = "country", target = "country")
	@Mapping(source = "password", target = "password")
	User toDomain(UserRequest request);
}
