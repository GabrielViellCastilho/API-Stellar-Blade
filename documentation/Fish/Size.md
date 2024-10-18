### Size

- **Variable Explanation:**

    - **id:** The unique identifier of the size.
    - **name:** The size description.



- **GET /Fish/Size**

  **Description:** Retrieves all sizes.

  **Response:**
  ```json
  [
    {
      "id": "long",
      "size": "string"
    },
    {
      "id": "long",
      "size": "string"
    }
  ]
  ```

- **GET /Fish/Size/search/id/{id}**

  **Description:** Retrieves a size by its id.

  **Response:**
  ```json
  {
    "id": "long",
    "size": "string"
  }
  ```

- **GET /Fish/Size/search/name/{name}**

  **Description:** Retrieves a size by its name.

  **Response:**
  ```json
  {
    "id": "long",
    "size": "string"
  }
  ```

- **POST /Fish/Size/create**

  **Description:** Creates a new size.

  **Request Body:**
  ```json
    {
     "size": "string"
    }
  ```

  **Response:**
  ```json
  {
    "id": "long",
    "size": "string"
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Fish/Size/delete/{id}**

  **Description:** Deletes a size by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  