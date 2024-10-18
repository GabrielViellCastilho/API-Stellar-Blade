### Naytiba Type

- **Variable Explanation:**
  - **id:** Unique identifier for the naytiba type.
  - **name:** The name of the naytiba type.


- **GET /Naytiba/Type**

  **Description:** Retrieves all naytiba types

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

- **GET /Naytiba/Type/search/id/{id}**

  **Description:** Retrieves a naytiba type by its id

  **Response:**
  ```json
  {
    "id": "long",                    
    "name": "string"            
  }
  ```

- **GET /Naytiba/Type/search/name/{name}**

  **Description:** Retrieves a naytiba type by its name.

  **Response:**
  ```json
  {
    "id": "long",                     
    "name": "string"                  
  }
  ```
  
- **POST /Naytiba/Type/create**

  **Description:** Creates a new naytiba type

  **Request Body:**
  ```json
  {
    "type": "string"   
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",     
    "type": "string"  
  }
  ```

  **Status Code:** `201 Created`


- **DELETE /Naytiba/Type/delete/{id}**

  **Description:** Deletes a naytiba type by its id

  **Response:**
    - **Status Code:** `204 No Content`
