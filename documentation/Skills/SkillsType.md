### Skills Type

- **Variable Explanation:**

    - **id:** The unique identifier of the skills type.
    - **name:** The name of the skills type.



- **GET /Skills/Type**

  **Description:** Retrieves all skills types.

  **Response:**
  ```json
  [
    {
      "id": "long",
      "name": "string"
    },
    {
      "id": "long",
      "name": "string"
    }
  ]
  ```

- **GET /Skills/Type/search/name/{name}**

  **Description:**  Retrieves a skills type by its name.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string"
  }
  ```

- **GET /Skills/Type/search/id/{id}**

  **Description:** Retrieves a skills type by its id.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string"
  }
  ```

- **POST /Skills/Type/create**

  **Description:** Creates a new skills type.

  **Request Body:**
  ```json
  {
    "name": "string"
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string"
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Skills/Type/delete/{id}**

  **Description:** Deletes a skills type by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  