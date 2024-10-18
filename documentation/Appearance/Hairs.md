### Hairs

- **Variable Explanation:**

  - **id:** The unique identifier of the hair.
  - **name:** The name of the hair.
  - **description:**  A description of the hair.

- **GET /Hairs**

  **Description:** Retrieves all hair styles

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

- **GET /Hairs/search/name/{name}**

  **Description:** Retrieves a hair by its name

  **Response:**
  ```json
    {
      "id": "long",          
      "name": "string",        
      "description": "string" 
    }
  ```

- **GET /Hairs/search/id/{id}}**

  **Description:** Retrieves a hair by its id

  **Response:**
  ```json
    {
      "id": "long",           
      "name": "string",       
      "description": "string"  
    }
  ```

- **POST /Hairs/create**

  **Description:** Creates a new hair

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

- **DELETE /Hairs/delete/{id}**

  **Description:** Deletes a hair by its id

  **Response:**
    - **Status Code:** `204 No Content`
  