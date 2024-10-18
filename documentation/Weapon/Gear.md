### Gear

- **Variable Explanation:**

    - **id:** The unique identifier of the gear.
    - **name:** The name of the gear.
    - **numberOfStars:** Number of stars rating of the gear.
    - **status:** The status of the gear.
    - **description:** A description of the gear.

  
- **GET /Gear**

  **Description:** Retrieves all gears.

  **Response:**
  ```json
  [
    {
      "id": "long",
      "name": "string",
      "numberOfStars": "int",
      "status": "string",
      "description": "string"
    },
    {
      "id": "long",
      "name": "string",
      "numberOfStars": "int",
      "status": "string",
      "description": "string"
    }
  ]
  ```

- **GET /Gear/search/id/{id}**

  **Description:**  Retrieves a gear by its id.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "numberOfStars": "int",
    "status": "string",
    "description": "string"
  }
  ```

- **GET /Gear/search/name/{name}**

  **Description:** Retrieves a gear by its name.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "numberOfStars": "int",
    "status": "string",
    "description": "string"
  }
  ```

- **POST /Gear/create**

  **Description:** Creates a new gear.

  **Request Body:**
  ```json
  {
    "name": "string",
    "numberOfStars": "int",
    "status": "string",
    "description": "string"
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "numberOfStars": "int",
    "status": "string",
    "description": "string"
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Gear/delete/{id}**

  **Description:** Deletes a gear by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  