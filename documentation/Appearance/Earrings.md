### Earrings

- **Variable Explanation:**

  - **id:** The unique identifier of the earring.
  - **name:** The name of the earring.
  - **description:** A description of the earring.
  
- **GET /earrings**

  **Description:** Retrieves all earrings

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
- **GET /earrings/search/id/{id}**

  **Description:** Retrieves an earring by its id

  **Response:**
  ```json
  {
  "id": "long",            
  "name": "string",        
  "description": "string"  
  }
  ```  

- **GET /earrings/search/name/{name}**

  **Description:** Retrieves an earring by its name

  **Response:**
  ```json
  {
    "id": "long",            
    "name": "string",        
    "description": "string"  
  }
  ```
- **POST  /earrings/create**

  **Description:** Creates a new earring

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


- **DELETE /character/delete/{id}**

  **Description:** Deletes an earring by its id

  **Response:**
    - **Status Code:** `204 No Content`
