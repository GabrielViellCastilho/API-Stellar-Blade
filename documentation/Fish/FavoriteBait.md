### Favorite Bait

- **Variable Explanation:**

    - **id:** The unique identifier of the favorite bait.
    - **name:** The name of the favorite bait.



- **GET /Fish/FavoriteBait**

  **Description:** Retrieves all favorite baits.

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

- **GET /Fish/FavoriteBait/search/id/{id}**

  **Description:** Retrieves a favorite bait by its id.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string"
  }
  ```

- **GET /Fish/FavoriteBait/search/name/{name}**

  **Description:** Retrieves a favorite bait by its name.

  **Response:**
  ```json
  {
    "id": "long",
    "name": "string"
  }
  ```

- **POST /Fish/FavoriteBait/create**

  **Description:** Creates a new favorite bait.

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

- **DELETE /Fish/FavoriteBait/delete/{id}**

  **Description:** Deletes a favorite bait by its id.

  **Response:**
    - **Status Code:** `204 No Content`
  