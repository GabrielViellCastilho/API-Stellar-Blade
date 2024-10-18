### Exospine

- **Variable Explanation:**

    - **id:** The unique identifier of the exospine status.
    - **name:** The name of the Exospine.
    - **numberOfStars:** The rating of the Exospine, represented as an integer.
    - **statusExospines:** A list of status descriptions associated with the Exospine.
    - **description:** A description of the Exospine.


- **GET /Exospine**

  **Description:** Retrieves all Exospines.

  **Response:**
  ```json
  [
    {
      "id": "long",
      "name": "string",
      "numberOfStars": "int",
      "statusExospines": [
        {
        "id": "long",
        "status": "string"
        }
      ],
      "description": "string"
    },
    {
      "id": "long",
      "name": "string",
      "numberOfStars": "int",
      "statusExospines": [
        {
        "id": "long",
        "status": "string"
        }
      ],
      "description": "string"
    }
  ]
  ```

- **GET /Exospine/search/id/{id}**

  **Description:** Retrieves an Exospine by its id.


  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "numberOfStars": "int",
    "statusExospines": [
      {
        "id": "long",
        "status": "string"
      }
    ],
    "description": "string"
  }
  ```

- **GET /Exospine/search/name/{name}**

  **Description:** Retrieves an Exospine by its name.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "numberOfStars": "int",
    "statusExospines": [
      {
      "id": "long",
      "status": "string"
      }
    ],
    "description": "string"
  }
  ```

- **POST /Exospine/create**

  **Description:** Creates a new Exospine.

  **Request Body:**
  ```json
  {
    "name": "string",
    "numberOfStars": "int",
    "statusExospines": [
    {
      "status": "string"
    }
  ],
    "description": "string"
  }
  ```

  **Response:**
  ```json
  {
  "id": "long",
  "name": "string",
  "numberOfStars": "int",
  "statusExospines": [
  {
    "id": "long",
    "status": "string"
  }
  ],
  "description": "string"
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Exospine/delete/{id}**

  **Description:** Deletes an Exospine by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  