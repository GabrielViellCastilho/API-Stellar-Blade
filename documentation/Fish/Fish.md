### Fish

- **Variable Explanation:**

    - **id:** The unique identifier of the fish.
    - **name:** The name of the fish.
    - **favoriteBait:** The fish's favorite bait.
    - **description:** A description of the fish.
    - **size:** The size of the fish.
    - **numberOfStars:** The star rating for the fish.



- **GET /Fish**

  **Description:** Retrieves all fish.

  **Response:**
  ```json
  [
    {
      "id": "long",
      "name": "string",
      "favoriteBait": {
        "id": "long",
        "name": "string"
      },
      "description": "string",
      "size": {
        "id": "long",
        "size": "string"
      },
      "numberOfStars": "int"
    },
    {
      "id": "long",
      "name": "string",
      "favoriteBait": {
        "id": "long",
        "name": "string"
      },
      "description": "string",
      "size": {
        "id": "long",
        "size": "string"
      },
      "numberOfStars": "int"
    }
  ]

  ```

- ** /Fish/search/id/{id}**

  **Description:** Retrieves a fish by its id.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "favoriteBait": {
      "id": "long",
      "name": "string"
    },
    "description": "string",
    "size": {
      "id": "long",
      "size": "string"
    },
    "numberOfStars": "int"
  }
  ```

- **GET /Fish/search/name/{name}**

  **Description:** Retrieves a fish by its name.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "favoriteBait": {
      "id": "long",
      "name": "string"
    },
    "description": "string",
    "size": {
      "id": "long",
      "size": "string"
    },
    "numberOfStars": "int"
  }
  ```

- **POST /Fish/create**

  **Description:** Creates a new size.

  **Request Body:**
  ```json
  {
    "name": "string",
    "favoriteBait": "string",
    "description": "string",
    "size": "string",
    "numberOfStars": "int"
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string",
    "favoriteBait": {
      "id": "long",
      "name": "string"
    },
    "description": "string",
    "size": {
      "id": "long",
      "size": "string"
    },
    "numberOfStars": "int"
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Fish/delete/{id}**

  **Description:** Deletes a fish by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  