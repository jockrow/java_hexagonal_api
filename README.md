org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userFacadeImpl' defined in file [/Users/richard/devs/java/api_rest/build/classes/java/main/com/test/api_rest/facade/impl/UserFacadeImpl.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'userServiceImpl' defined in file [/Users/richard/devs/java/api_rest/build/classes/java/main/com/test/api_rest/service/impl/UserServiceImpl.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'userRepository' defined in com.test.api_rest.repository.UserRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Not a managed type: class com.test.api_rest.domain.entity.User




Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userServiceImpl' defined in file [/Users/richard/devs/java/api_rest/build/classes/java/main/com/test/api_rest/service/impl/UserServiceImpl.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'userRepository' defined in com.test.api_rest.repository.UserRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Not a managed type: class com.test.api_rest.domain.entity.User



////////////
Users/richard/devs/java/api_rest/src/main/java/com.test.api_rest.mapper/UserRequestMapper.java:15: warning: Unmapped target property: "id".
        User toDomain(UserRequest request);
             ^
1 warning

//////////
/Users/richard/devs/java/api_rest/src/main/java/com.test.api_rest.mapper/UserRequestMapper.java:15: warning: Unmapped target property: "id".
        User toDomain(UserRequest request);
             ^
/Users/richard/devs/java/api_rest/src/main/java/com.test.api_rest.controller/UserController.java:37: error: incompatible types: List<UserDto> cannot be converted to List<User>
                return iUserFacade.getAll();

