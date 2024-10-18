### Naytiba

- **Variable Explanation:**
  - **id:** Unique identifier for the naytiba.
  - **name:** The name of the naytiba.
  - **type:** The type or category of the naytiba.
  - **descriptionEcologicalInformation:** Ecological description providing information about the environment and behavior of the naytiba.
  - **descriptionCombatInformation:** Description of the combat abilities and characteristics of the naytiba.


- **GET /Naytiba**

  **Description:** Retrieves all naytibas

  **Response:**
  ```json
  [
   {
      "id": "long",                            
      "name": "string",                          
      "type": "string",                         
      "descriptionEcologicalInformation": "string",
      "descriptionCombatInformation": "string" 
   },
   {
     "id": "long",                              
      "name": "string",                          
      "type": "string",                          
      "descriptionEcologicalInformation": "string", 
      "descriptionCombatInformation": "string"  
   }
  ]

  ```

- **GET /Naytiba/names-and-ids**

  **Description:** Retrieves all ids and names of naytibas

  **Response:**
  ``` json
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

- **GET /Naytiba/search/name/{name}**

  **Description:** Retrieves a naytiba by its name

  **Response:**
  ```json
  {
    "id": "long",                      
    "name": "string",                  
    "type": "string",                  
    "descriptionEcologicalInformation": "string", 
    "descriptionCombatInformation": "string"  
  }
  ```

- **GET /Naytiba/search/id/{id}**

  **Description:** Retrieves a naytiba by its id

  **Response:**
  ```json
  {
    "id": "long",                      
    "name": "string",                 
    "type": "string",               
    "descriptionEcologicalInformation": "string", 
    "descriptionCombatInformation": "string"  
  }
  ```
- **POST /Naytiba/create**

  **Description:** Creates a new naytiba

  **Request Body:**
  ```json
  {
    "name": "string",                       
    "idType": "long",                    
    "descriptionEcologicalInformation": "string", 
    "descriptionCombatInformation": "string" 
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",                         
    "name": "string",                      
    "type": "string",                     
    "descriptionEcologicalInformation": "string", 
    "descriptionCombatInformation": "string"  
  }
  ```

  **Status Code:** `201 Created`


- **DELETE /Naytiba/delete/{id}**

  **Description:** Deletes a naytiba by its id

  **Response:**
    - **Status Code:** `204 No Content`