# Java Spring with Hexagonal architecture
This is a project Java Spring with Hexagonal architecture

# Requisites:
Gradle 7.6
jdk 17.0.9
PostgreSQL 14.9


# PROBLEMS
Next are the problems in that I was stucking

## ERROR 1:
Correct the classpath of your application so that it contains compatible versions of the classes org.hibernate.jpa.boot.internal.PersistenceUnitInfoDescriptor and javax.persistence.spi.PersistenceUnitInfo
How do I can correct the classpath?

## ERROR 2:
An attempt was made to call a method that does not exist. The attempt was made from the following location:

    org.hibernate.jpa.boot.internal.PersistenceUnitInfoDescriptor.getValidationMode(PersistenceUnitInfoDescriptor.java:88)

## SOLUTION: 
I removed this dependency from build.gradle:
```gradle
dependencies {
	implementation 'org.glassfish:javax.persistence:10.0-b28'
}
```
---
## ERROR 1:
org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userFacadeImpl' defined in file [/Users/richard/devs/java/api_rest/build/classes/java/main/com/test/api_rest/facade/impl/UserFacadeImpl.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'userServiceImpl' defined in file [/Users/richard/devs/java/api_rest/build/classes/java/main/com/test/api_rest/service/impl/UserServiceImpl.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'userRepository' defined in com.test.api_rest.repository.UserRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Not a managed type: class com.test.api_rest.domain.entity.User

Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userServiceImpl' defined in file [/Users/richard/devs/java/api_rest/build/classes/java/main/com/test/api_rest/service/impl/UserServiceImpl.class]: Unsatisfied dependency expressed through constructor parameter 0: Error creating bean with name 'userRepository' defined in com.test.api_rest.repository.UserRepository defined in @EnableJpaRepositories declared on JpaRepositoriesRegistrar.EnableJpaRepositoriesConfiguration: Not a managed type: class com.test.api_rest.domain.entity.User

## ERROR 2:
Parameter 0 of constructor in com.test.api_rest.layer.business.service.impl.UserServiceImpl required a bean of type 'com.test.api_rest.layer.persistence.UserRepository' that could not be found.


## SOLUTION:
I have this versions respectly for gradle and java:
Gradle 8.4
openjdk 20.0.2

1. **Install SDKMAN!:**
   Open your terminal and run the following command to install SDKMAN!:

   ```sh
   curl -s "https://get.sdkman.io" | bash
   ```

2. **Restart Your Terminal:**
   After the installation is complete, restart your terminal or run:

   ```sh
   source "$HOME/.sdkman/bin/sdkman-init.sh"
   ```

3. **Install Java:**
   To see the available Java versions, you can use:

   ```sh
   sdk list java
   ```

   To install a specific version (for example, Java 17), use:

   ```sh
   sdk install java 17.0.1-open
