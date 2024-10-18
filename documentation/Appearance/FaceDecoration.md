### Face Decoration

- **Variable Explanation:**

  - **id:** The unique identifier of the face decoration.
  - **name:** The name of the face decoration.
  - **description:**  A description of the face decoration.
  - **numberOfStars:** The rating of the face decoration, represented as an integer.

- **GET /FaceDecoration**

  **Description:** Retrieves all face decorations

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

- **GET  /FaceDecoration/search/name/{name}**

  **Description:** Retrieves a face decoration by its name

  **Response:**
  ```json
    {
      "id": "long",               
      "name": "string",           
      "description": "string",    
      "numberOfStars": "int"       
    }
  ```

- **GET /FaceDecoration/search/id/{id}**

  **Description:** Retrieves a face decoration by its id

  **Response:**
  ```json
    {
      "id": "long",                
      "name": "string",           
      "description": "string",     
      "numberOfStars": "int"       
    }
  ```

- **POST  /FaceDecoration/create**

  **Description:** Creates a new face decoration

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

- **DELETE /FaceDecoration/delete/{id}**

  **Description:** Deletes a face decoration by its id

  **Response:**
    - **Status Code:** `204 No Content`
  