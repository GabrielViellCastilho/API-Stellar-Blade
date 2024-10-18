### Drone Appearance

- **Variable Explanation:**

  - **id:** The unique identifier of the drone appearance.
  - **name:** The name of the drone appearance.
  - **description:** A description of the drone appearance.
  - **numberOfStars:** The rating of the drone appearance, represented as an integer.

- **GET /Droneappearance**

  **Description:** Retrieves all drone appearances

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

- **GET  /DroneAppearance/search/name/{name}**

  **Description:** Retrieves a drone appearance by its name

  **Response:**
  ```json
    {
      "id": "long",                
      "name": "string",            
      "description": "string",     
      "numberOfStars": "int"      
    }
  ```

- **GET /DroneAppearance/search/id/{id}**

  **Description:** Retrieves a drone appearance by its id

  **Response:**
  ```json
    {
      "id": "long",                
      "name": "string",           
      "description": "string",     
      "numberOfStars": "int"       
    }
  ```

- **POST  /DroneAppearance/create**

  **Description:** Creates a new drone appearance

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

- **DELETE /DroneAppearance/delete/{id}**

  **Description:** Deletes a drone appearance by its id

  **Response:**
    - **Status Code:** `204 No Content`
  