# Spring Angular Project

This is a Spring Boot project with Angular frontend.

## Introduction

This project demonstrates how to build a full-stack web application using Spring Boot for the backend and Angular for the frontend.

## Technologies Used

- Java
- Spring Boot
- Angular
- MySQL (or any other database of your choice)

## Prerequisites

Before running this project, make sure you have the following installed:

- Java Development Kit (JDK)
- Node.js and npm (for Angular)
- MySQL (or any other database)

## Setup Instructions

1. Clone the repository:

    ```bash
    git clone <repository-url>
    ```

2. Backend Setup:
   
   - Navigate to the `springAngularProject` directory.
   - Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
   - Make sure your MySQL server is running.
   - Update the database configurations in `application.properties` file (located in `src/main/resources`) as per your MySQL setup.
   - Run the Spring Boot application by executing the `SpringAngularApplication` class.

3. Frontend Setup:

   - Navigate to the `angularProject` directory.
   - Install dependencies using npm:

     ```bash
     npm install
     ```

   - Run the Angular application:

     ```bash
     ng serve
     ```

   - The Angular application will be served on `http://localhost:4200/`.

## API Endpoints

The backend provides the following RESTful API endpoints:

- `GET /api/v1/employees`: Get all employees.
- `GET /api/v1/employees/{id}`: Get employee by ID.
- `POST /api/v1/employees`: Create a new employee.
- `PUT /api/v1/employees/{id}`: Update an existing employee.
- `DELETE /api/v1/employees/{id}`: Delete an employee by ID.

## Execution Flow

1. **Backend Setup**:
   - The Spring Boot application starts an embedded Tomcat server and listens for incoming HTTP requests.

2. **Frontend Setup**:
   - The Angular CLI serves the Angular application on `http://localhost:4200/`.
   
3. **Client-Server Interaction**:
    - The Angular frontend sends HTTP requests to the Spring Boot backend through RESTful API endpoints.
    - These requests are handled by controller classes (EmployeeController), which contain methods annotated with @GetMapping, @PostMapping, @PutMapping, and @DeleteMapping.
    - Each method in the controller performs specific CRUD operations on the database by interacting with the EmployeeRepository.
    - The repository (EmployeeRepository) extends JpaRepository, which provides CRUD operations out of the box.
    - When a request is received, Spring Boot maps the URL to the appropriate controller method based on the request method and URL pattern.
   
4. **Database Operations**:
   - Data is retrieved from or stored into the database using the `EmployeeRepository`.

5. **Response Handling**:
   - Angular frontend receives HTTP responses from the backend and updates the UI accordingly.
   - UI displays the list of employees fetched from the backend or shows error messages in case of failures.
   
6. **Error Handling**:
   - Both backend and frontend handle errors gracefully by sending appropriate error messages as part of HTTP responses.

## Folder Structure

- `springAngularProject`: Contains the Spring Boot backend code.
- `angular_spring`: Contains the Angular frontend code.

