
# 📘 Student Management System

* Spring Boot project to manage student data using REST APIs
* Uses H2 in-memory database with JPA
* Layered architecture: Controller → Service → Repository → Model
* Supports basic CRUD operations

---

# 📌 API Details

## ➕ Add Student

**Request:**

```json
{
  "name": "Anjali",
  "age": 22
}
```

**Response:**

```json
{
  "id": 1,
  "name": "Anjali",
  "age": 22
}
```

---

## 📄 Get All Students

**Request:**

```
GET /students
```

**Response:**

```json
[
  {
    "id": 1,
    "name": "Anjali",
    "age": 22
  }
]
```
http://localhost:8080/students

![img.png](img.png)

<img width="1097" height="924" alt="image" src="https://github.com/user-attachments/assets/486bad1f-c42f-4143-8719-2cb7b60743a9" />
