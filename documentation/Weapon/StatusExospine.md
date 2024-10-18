### Status Exospine

- **Variable Explanation:**

    - **id:** TThe unique identifier of the exospine status.
    - **status:** The status description of the Exospine.


- **GET /Exospine/Status**

  **Description:** Retrieves all Exospine statuses.

  **Response:**
  ```json
  [
    {
      "id": "long",
      "status": "string"
    },
    {
      "id": "long",
      "status": "string"
    }
  ]
  ```

- **GET /Exospine/Status/search/id/{id}**

  **Description:** Retrieves an Exospine status by its id.

  **Response:**
  ```json
  {
    "id": "long",
    "status": "string"
  }
  ```

- **GET /Exospine/Status/search/status/{status}**

  **Description:** Retrieves an Exospine status by its status description.

  **Response:**
  ```json
  {
    "id": "long",
    "status": "string"
  }
  ```

- **POST /Exospine/Status/create**

  **Description:** Creates a new Exospine status.

  **Request Body:**
  ```json
  {
    "status": "string"
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",
    "status": "string"
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Exospine/Status/delete/{id}**

  **Description:** Deletes an Exospine status by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  