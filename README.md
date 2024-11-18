# TODO: Poner habilidad linux

# Java Spring with Hexagonal architecture
This is a project Java Spring for api rest with Hexagonal architecture

# For testing

# Requisites:
Feature	Tool
Package Management	Gradle 7.6
Compiler	jdk 17.0.9
Database	PostgreSQL 14.9
Testing	mockito

# Instruction to create persistence data
```sql
CREATE TABLE users (ID INT PRIMARY KEY , NAME TEXT, EMAIL VARCHAR(50),
COUNTRY VARCHAR(50))


INSERT INTO users
(name, email, country) VALUES
('Richard', 'r.martinezdk@gmail.com', 'Colombia');


--select * from users;
```


# Execute
```sh
gradle bootRun
```
---

# USING

Each endpoint will demonstrate the typical operations: `GET`, `POST`, `PUT`, and `DELETE`.

### 1. **Users Endpoint**

#### 1.1 **GET**: Retrieve All Users
```bash
curl -X GET http://localhost:8080/users
```
**Example Response**:
```json
[
  {
    "id": 1,
    "name": "john_doe",
    "email": "john@example.com"
  },
  {
    "id": 2,
    "name": "jane_doe",
    "email": "jane@example.com"
  }
]
```

#### 1.2 **GET**: Retrieve a Specific User by ID
```bash
curl -X GET http://localhost:8080/users/1
```
**Example Response**:
```json
{
  "id": 1,
  "name": "john_doe",
  "email": "john@example.com"
}
```

#### 1.3 **POST**: Create a New User
```bash
curl -X POST http://localhost:8080/users \
  -H "Content-Type: application/json" \
  -d '{"name":"new_user", "email":"new_user@example.com"}'
```
**Example Response**:
```json
{
  "id": 3,
  "name": "new_user",
  "email": "new_user@example.com"
}
```

#### 1.4 **PUT**: Update an Existing User
```bash
curl -X PUT http://localhost:8080/users/3 \
  -H "Content-Type: application/json" \
  -d '{"name":"updated_user", "email":"updated_user@example.com"}'
```
**Example Response**:
```json
{
	// TODO: Validar que no cree un nuevo usuario cuando no exista por id
  "id": 3,
  "name": "updated_user",
  "email": "updated_user@example.com"
}
```

#### 1.5 **DELETE**: Remove a User by ID
```bash
curl -X DELETE http://localhost:8080/users/3
```

---

### 2. **Tasks Endpoint**

#### 2.1 **GET**: Retrieve All Tasks
```bash
curl -X GET http://localhost:8080/tasks
```
**Example Response**:
```json
[
  {
    "id": 101,
    "name": "Complete API docs",
    "description": "Document all endpoints",
    "timeRequiredToComplete": 9
  },
  {
    "id": 102,
    "name": "Deploy to production",
    "description": "Deploy the API to Azure",
    "timeRequiredToComplete": 10
  }
]
```

#### 2.2 **GET**: Retrieve a Specific Task by ID
```bash
curl -X GET http://localhost:8080/tasks/101
```
**Example Response**:
```json
{
  "id": 101,
  "name": "Complete API docs",
  "description": "Document all endpoints",
  "timeRequiredToComplete": 8
}
```

#### 2.3 **POST**: Create a New Task
```bash
curl -X POST http://localhost:8080/tasks \
  -H "Content-Type: application/json" \
  -d '{"name":"New Task", "description":"Details of new task", "timeRequiredToComplete":7}'
```
**Example Response**:
```json
{
  "id": 103,
  "name": "New Task",
  "description": "Details of new task",
  "timeRequiredToComplete": 9
}
```

#### 2.4 **PUT**: Update an Existing Task
```bash
curl -X PUT http://localhost:8080/tasks/103 \
  -H "Content-Type: application/json" \
  -d '{"name":"Updated Task", "description":"Updated details", "timeRequiredToComplete":8}'
```
**Example Response**:
```json
{
	// TODO: Validar que no cree un nueva tarea cuando no exista por id
  "id": 103,
  "name": "Updated Task",
  "description": "Updated details",
  "timeRequiredToComplete": 10
}
```

#### 2.5 **DELETE**: Remove a Task by ID
```bash
curl -X DELETE http://localhost:8080/tasks/103
```
---

