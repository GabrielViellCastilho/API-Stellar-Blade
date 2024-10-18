### Character

- **Variable Explanation:**

  - **id:** The unique identifier of the character.
  - **name:** The name of the character.
  - **description:** A description of the character.

- **GET /Character**

  **Description:** Retrieves all characters

  **Response:**
  ```json
   [
    {
        "id": "long",            
        "name": "string",       
        "description": "string"  
    },
    {
        "id": "long",       
        "name": "string",        
        "description": "string"  
    }
  ]
  ```

- **GET /Character/search/name/{name}**

  **Description:** Retrieves a character by its name

  **Response:**
  ```json
  {
      "id": "long",            
      "name": "string",       
      "description": "string"  
  }
  ```

- **GET /Character/search/id/{id}**

  **Description:** Retrieves a character by its id

  **Response:**
  ```json
  {
      "id": "long",          
      "name": "string",       
      "description": "string" 
  }
  ```

- **POST /Character/create**

  **Description:** Creates a new character

  **Request Body:**
  ```json
  {
      "name": "string",        
      "description": "string"  
  }
  ```

  **Response:**
  ```json
  {
      "id": "long",            
      "name": "string",        
      "description": "string"  
  }
  ```

  **Status Code:** `201 Created`

- **DELETE /Character/delete/{id}**

  **Description:** Deletes a character by its id

  **Response:**
    - **Status Code:** `204 No Content`
  