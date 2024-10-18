### Skills

- **Variable Explanation:**

    - **id:** The unique identifier of the skill.
    - **name:** The name of the skill.
    - **type:** The type of the skill (represented as a SkillsType object).

- **GET /Skills**

  **Description:** Retrieves all skills.

  **Response:**
  ```json
  [
    {
      "id": "long",
      "name": "string",
      "type": {
        "id": "long",
        "name": "string"
      }
    },
    {
      "id": "long",
      "name": "string",
      "type": {
        "id": "long",
        "name": "string"
      }
    }
  ]
  ```

- **GET /Skills/search/id/{id}**

  **Description:**  Retrieves a skill by its id.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "type": {
      "id": "long",
      "name": "string"
    }
  }

  ```

- **GET /Skills/search/name/{name}**

  **Description:** Retrieves a skill by its name.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "type": {
      "id": "long",
      "name": "string"
    }
  }
  ```

- **POST /Skills/create**

  **Description:** Creates a new skill.

  **Request Body:**
  ```json
  {
    "name": "string",
    "type": "string"
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "type": {
      "id": "long",
      "name": "string"
    }
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Skills/delete/{id}**

  **Description:** Deletes a skill by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  