
# Stellar Blade API (Unofficial)

Welcome to this unofficial RESTful API created by a fan game **Stellar Blade**. This API provides data about the game, including information about Characters, Naytiba, Nano Suit, and more.

**Warning:** The API is still in development!

## Index
- [Requirements](#requirements)
- [How to use](#how-to-use)
- [Endpoints](#endpoints)
  - [Naytiba](#naytiba)
    - [Naytiba Type ](#naytiba-type)
  - [Character](#character)
- [Contact](#contact)

## In development
- [Endpoints]()
  - [Skills](#skills)
    - [Skills Type](#skills-type)
  - [Weapon](#weapon)
    - [Exospine](#exospine)
      - [Status Exospine](#status-exospine)
    - [Gear](#gear)
  - [Appearance](#appearance)
    - [Nano Suit](#nano-suit)
    - [Earring](#earring)
    - [Face Decoration](#face-decoration)
    - [Hairs](#hairs)
    - [Drone Appearance](#drone-appearance)
   - [Fish](#fish)
     - [Size](#size)
     - [Favorite Bait](#favorita-bait)

## Requirements
- JAVA 21
- MySQL

## How to use

1. **Cloning the project**
   ```sh
   git clone https://github.com/GabrielViellCastilho/API-Stellar-Blade.git
   ```

2. **Download Maven dependencies in the APIStellarBlade package**
   ```sh
   mvn clean install
   ```

3. **Configure the MySQL database in the `application.properties` file**

   Open the `src/main/resources/application.properties` file and configure the database connection:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your-database
   spring.datasource.username=your-username
   spring.datasource.password=your-password
   ```

  - Replace `your-database` with the name of your MySQL database.
  - Replace `your-username` and `your-password` with your MySQL username and password.

4. **Run the `ApiStellarBladeApplication` file**

5. **Access the API at `http://localhost:8080`**



## Endpoints

### Naytiba

- **GET /naytiba**

  **Description:** Retrieves all naytibas

  **Response:**
  ```json
  [
   {
      "id": "long",                               // Unique identifier for the naytiba
      "name": "string",                          // Name of the naytiba
      "type": "string",                          // Type of the naytiba
      "descriptionEcologicalInformation": "string", // Ecological description of the naytiba
      "descriptionCombatInformation": "string"  // Combat description of the naytiba 
   },
   {
     "id": "long",                               // Unique identifier for the naytiba
      "name": "string",                          // Name of the naytiba
      "type": "string",                          // Type of the naytiba
      "descriptionEcologicalInformation": "string", // Ecological description of the naytiba
      "descriptionCombatInformation": "string"  // Combat description of the naytiba
   }
  ]

  ```

- **GET /naytiba/names-and-ids**
  
  **Description:** Retrieves all ids and names of naytibas 

  **Response:**
  ``` json
  [
   {
      "id": "long",          // Unique identifier for the naytiba
      "name": "string"      // Name of the naytiba
   },
   {
      "id": "long",          // Unique identifier for the naytiba
      "name": "string"      // Name of the naytiba
   }
  ]

  ```

- **GET /search/name/{name}**

  **Description:** Retrieves a naytiba by its name

  **Response:**
  ```json
  {
    "id": "long",                      // Unique identifier for the naytiba
    "name": "string",                  // Name of the naytiba
    "type": "string",                  // Type of the naytiba
    "descriptionEcologicalInformation": "string", // Ecological description of the naytiba
    "descriptionCombatInformation": "string"  // Combat description of the naytiba
  }
  ```

- **GET /search/id/{id}**

  **Description:** Retrieves a naytiba by its id

  **Response:**
  ```json
  {
    "id": "long",                      // Unique identifier for the naytiba
    "name": "string",                  // Name of the naytiba
    "type": "string",                  // Type of the naytiba
    "descriptionEcologicalInformation": "string", // Ecological description of the naytiba
    "descriptionCombatInformation": "string"  // Combat description of the naytiba
  }
  ```
- **POST /create**

  **Description:** Creates a new naytiba

  **Request Body:**
  ```json
  {
    "name": "string",                        // Name of the naytiba
    "idType": "long",                       // Type ID of the naytiba
    "descriptionEcologicalInformation": "string", // Ecological description of the naytiba
    "descriptionCombatInformation": "string"  // Combat description of the naytiba
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",                          // Unique identifier for the naytiba
    "name": "string",                      // Name of the naytiba
    "type": "string",                      // Type of the naytiba
    "descriptionEcologicalInformation": "string", // Ecological description of the naytiba
    "descriptionCombatInformation": "string"  // Combat description of the naytiba
  }
  ```

  **Status Code:** `201 Created`


- **DELETE /delete/{id}**

  **Description:** Deletes a naytiba by its id

  **Response:**
  - **Status Code:** `204 No Content`
### Naytiba Type

- **GET /naytiba_type**

  **Description:** Retrieves all naytiba types

  **Response:**
  ```json
  [
    {
      "id": "long",                      // Unique identifier for the naytiba type
      "name": "string"                  // Name of the naytiba type
    },
    {
      "id": "long",                      // Unique identifier for the naytiba type
      "name": "string"                  // Name of the naytiba type
    }
  ]
  ```

- **GET /naytiba_type/search/id/{id}**

  **Description:** Retrieves a naytiba type by its id

  **Response:**
  ```json
  {
    "id": "long",                      // Unique identifier for the naytiba type
    "name": "string"                  // Name of the naytiba type
  }
  ```
- **POST /naytiba_type/create**

  **Description:** Creates a new naytiba type

  **Request Body:**
  ```json
  {
    "type": "string"   // Type of the naytiba type
  }
  ```

  **Response:**
  ```json
  {
    "id": "long",      // Unique identifier for the naytiba type
    "type": "string"  // Type of the naytiba type
  }
  ```

  **Status Code:** `201 Created`


- **DELETE /naytiba_type/delete/{id}**

  **Description:** Deletes a naytiba type by its id

  **Response:**
  - **Status Code:** `204 No Content`

### Character

- **GET /character**

  **Description:** Retrieves all characters

  **Response:**
  ```json
   [
    {
        "id": "long",            // The unique identifier of the character
        "name": "string",        // The name of the character
        "description": "string"  // A description of the character
    },
    {
        "id": "long",            // The unique identifier of the character
        "name": "string",        // The name of the character
        "description": "string"  // A description of the character
    }
  ]
  ```

- **GET /character/search/name/{name}**

  **Description:** Retrieves a character by its name

  **Response:**
  ```json
  {
      "id": "long",            // The unique identifier of the character
      "name": "string",        // The name of the character
      "description": "string"  // A description of the character
  }
  ```

- **GET /character/search/id/{id}**

  **Description:** Retrieves a character by its id

  **Response:**
  ```json
  {
      "id": "long",            // The unique identifier of the character
      "name": "string",        // The name of the character
      "description": "string"  // A description of the character
  }
  ```

- **POST /character/create**

  **Description:** Creates a new character

  **Request Body:**
  ```json
  {
      "name": "string",        // The name of the character
      "description": "string"  // A description of the character
  }
  ```

  **Response:**
  ```json
  {
      "id": "long",            // The unique identifier of the character
      "name": "string",        // The name of the character
      "description": "string"  // A description of the character
  }
  ```

- **DELETE /character/delete/{id}**

  **Description:** Deletes a character by its id

  **Response:**
  - **Status Code:** `204 No Content`
  

### Contact

If you have any questions, feedback, or need support, please feel free to reach out:

- **Email:** gabrielviell@hotmail.com
- **GitHub:** [My GitHub Profile](https://github.com/GabrielViellCastilho)
- **LinkedIn:** [My LinkedIn Profile](https://www.linkedin.com/in/gabriel-viell-castilho-220438317/)

You can also open an issue in the [GitHub repository](https://github.com/GabrielViellCastilho/API-Stellar-Blade/issues) for bug reports or feature requests.
