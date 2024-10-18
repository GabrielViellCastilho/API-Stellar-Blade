### Nano Suit

- **Variable Explanation:**

    - **id:** The unique identifier of the Nano Suit.
    - **name:** The name of the Nano Suit.
    - **description:** A description of the Nano Suit.
    - **numberOfStars:** Number of stars rating of the Nano Suit.


- **GET /NanoSuit**

  **Description:** Retrieves all Nano Suits

  **Response:**
  ```json
    [
      {
        "id": "long",
        "name": "string",
        "description": "string",
        "numberOfStars": "int"
      },
      {
        "id": "long",
        "name": "string",
        "description": "string",
        "numberOfStars": "int"
      }
    ]
  ```

- **GET /NanoSuit/search/name/{name}**

  **Description:** Retrieves a Nano Suit by its name

  **Response:**
  ```json
    {
      "id": "long",
      "name": "string",
      "description": "string",
      "numberOfStars": "int"
    }
  ```

- **GET /NanoSuit/search/id/{id}**

  **Description:** Retrieves a Nano Suit by its id

  **Response:**
  ```json
    {
      "id": "long",
      "name": "string",
      "description": "string",
      "numberOfStars": "int"
    }
  ```

- **POST  /NanoSuit/create**

  **Description:** Creates a new Nano Suit

  **Request Body:**
  ```json
  {
    "name": "string",
    "description": "string",
    "numberOfStars": "int"
  }
  ```

  **Response:**
  ```json
    {
      "id": "long",
      "name": "string",
      "description": "string",
      "numberOfStars": "int"
    }
  ```

  **Status Code:** `201 Created`

- **DELETE /NanoSuit/delete/{id}**

  **Description:** Deletes a Nano Suit by its id

  **Response:**
    - **Status Code:** `204 No Content`
  