# Stellar Blade API (Unofficial)

Welcome to this unofficial RESTful API created by a fan game **Stellar Blade**. This API provides data about the game, including information about Characters, Naytiba, Nano Suit, and more.

**Warning:** The API is still in development!

## Endpoints

- **[Character](documentation/Character/Character.md)** - Retrieves character information.
- **[Naytiba](documentation/Naytiba/Naytiba.md)** - Information about Naytiba species.
   - **[Naytiba Type](documentation/Naytiba/NaytibaType.md)** - Different types of Naytiba.
- **[Skills](documentation/Skills/Skills.md)** - Details about skills available in the game.
   - **[Skills Type](documentation/Skills/SkillsType.md)** - Categories of skills.
- **Weapon**
   - **[Exospine](documentation/Weapon/Exospine.md)** - Information on Exospines.
      - **[Status Exospine](documentation/Weapon/StatusExospine.md)** - Current status of Exospines.
   - **[Gear](documentation/Weapon/Gear.md)** - Gear information.
- **Appearance**
   - **[Nano Suit](documentation/Appearance/NanoSuit.md)** - Details about Nano Suits.
   - **[Hairs](documentation/Appearance/Hairs.md)** - Information about available hairstyles.
   - **[Face Decoration](documentation/Appearance/FaceDecoration.md)** - Details about face decorations.
   - **[Earrings](documentation/Appearance/Earrings.md)** - Information on earrings.
   - **[Drone Appearance](documentation/Appearance/DroneAppearance.md)** - Details on drone appearances.

- **[Fish](documentation/Fish/Fish.md)** - Information about fish in the game.
   - **[Favorite Bait](documentation/Fish/FavoriteBait.md)** - Details on bait types.
   - **[Size](documentation/Fish/Size.md)** - Size categories for fish.

## Requirements
- **Docker**
- **Docker Compose**

## How to Use

1. **Clone the repository**  
   ```sh
   git clone https://github.com/GabrielViellCastilho/API-Stellar-Blade.git
   cd API-Stellar-Blade
   ```

2. **Start the application**  
   ```sh
   docker-compose up -d
   ```

3. **Access the API**  
   - **API Endpoints**: [http://localhost:8080/{api-endpoint}](http://localhost:8080/{api-endpoint})  
   - **Swagger Documentation**: [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) 

### Contact

If you have any questions, feedback, or need support, please feel free to reach out:

- **Email:** gabrielviell@hotmail.com
- **GitHub:** [My GitHub Profile](https://github.com/GabrielViellCastilho)
- **LinkedIn:** [My LinkedIn Profile](https://www.linkedin.com/in/gabriel-viell-castilho-220438317/)

You can also open an issue in the [GitHub repository](https://github.com/GabrielViellCastilho/API-Stellar-Blade/issues) for bug reports or feature requests.
