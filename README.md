# Student CRUD API

This is a simple Spring Boot RESTful API for managing student information. It provides basic CRUD operations and additional features like filtering students by age range and sorting by GPA.

## API Endpoints

### 1. Get a Single Student
- **Endpoint:** `/app/student`
- **Method:** `GET`
- **Description:** Returns one student.
- **Output**:
 ```json
{
    "regNo": "Ict01",
    "name": "John",
    "age": 23,
    "course": "ICT",
    "gpa": 3.7
}
  ```
### 2. Get All Students
- **Endpoint:** `/app/students`
- **Method:** `GET`
- **Description:** Returns a list of all students.
- **Output**:
  ```json
  [
    {
        "regNo": "Ict01",
        "name": "John",
        "age": 23,
        "course": "ICT",
        "gpa": 3.7
    },
    {
        "regNo": "Ict02",
        "name": "Alice",
        "age": 22,
        "course": "ICT",
        "gpa": 3.2
    },
    {
        "regNo": "Ict03",
        "name": "Bob",
        "age": 24,
        "course": "CS",
        "gpa": 2.9
    },
    {
        "regNo": "Ict04",
        "name": "Johnny",
        "age": 23,
        "course": "ICT",
        "gpa": 3.5
    }
]

  
### 3. Get a Student by ID
- **Endpoint:** `/app/student/{id}`
- **Method:** `GET`
- **Path Variable:** `id` (Student Registration Number)
- **Description:** Fetch a student by their registration number.
- **Output:**
  ```json
  {
    "regNo": "Ict01",
    "name": "John",
    "age": 23,
    "course": "ICT",
    "gpa": 3.7
}

### 4. Get Students Within a Specific Age Range
- **Endpoint:** `/app/age-range`
- **Method:** `GET`
- **Description:** Returns students whose age is between 20 and 23.
- **Output:**:
  ```json
  [
    {
        "regNo": "Ict01",
        "name": "John",
        "age": 23,
        "course": "ICT",
        "gpa": 3.7
    },
    {
        "regNo": "Ict02",
        "name": "Alice",
        "age": 22,
        "course": "ICT",
        "gpa": 3.2
    },
    {
        "regNo": "Ict04",
        "name": "Johnny",
        "age": 23,
        "course": "ICT",
        "gpa": 3.5
    }
]
### 5. Get Students Sorted by GPA
- **Endpoint:** `/app/sorted-gpa`
- **Method:** `GET`
- **Description:** Returns the list of students sorted in descending order by their GPA.
- **Output:**
  ```json
  [
    {
        "regNo": "Ict01",
        "name": "John",
        "age": 23,
        "course": "ICT",
        "gpa": 3.7
    },
    {
        "regNo": "Ict04",
        "name": "Johnny",
        "age": 23,
        "course": "ICT",
        "gpa": 3.5
    },
    {
        "regNo": "Ict02",
        "name": "Alice",
        "age": 22,
        "course": "ICT",
        "gpa": 3.2
    },
    {
        "regNo": "Ict03",
        "name": "Bob",
        "age": 24,
        "course": "CS",
        "gpa": 2.9
    }
]

### 6. Add a New Student
- **Endpoint:** `/app/add`
- **Method:** `POST`
- **Request Body:** A `Student` object with the following fields:
  - `regNo`: Ict05
  - `name`: Shakya
  - `age`: 23
  - `course`: CS
  - `gpa`: 3.2
- **Description:** Adds a new student to the list and returns the added student.
- **Output:**
  ```json
  {
    "regNo": "Ict05",
    "name": "Shakya",
    "age": 23,
    "course": "CS",
    "gpa": 3.2
}

### 7. Update a Student
- **Endpoint:** `/app/update/Ict05`
- **Method:** `PUT`
- **Path Variable:** `id` (Student Registration Number)
- **Request Body:** A `Student` object to update the existing student's details.
- **Description:** Updates the student with the specified `id` and returns the updated student.
- **Output:**
  ```json
  {
    "regNo": "Ict05",
    "name": "Shakyaaaa",
    "age": 23,
    "course": "CS",
    "gpa": 3.2
}

### 8. Delete a Student
- **Endpoint:** `/app/delete/{id}`
- **Method:** `DELETE`
- **Path Variable:** `id` (Student Registration Number)
- **Description:** Deletes the student with the specified `id` and returns a confirmation message.
- **Output:**
  ```json
  Student with ID Ict05 deleted successfully.

## Example Student Object
A `Student` object contains the following fields:
```json
{
  "regNo": "Ict01",
  "name": "John",
  "age": 23,
  "department": "ICT",
  "gpa": 3.7
}

