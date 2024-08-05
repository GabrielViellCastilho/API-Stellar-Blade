package castilho.APIStellarBlade.databaseInitializer.Character;

import castilho.APIStellarBlade.domain.model.entity.Character.Character;
import castilho.APIStellarBlade.domain.model.repository.Character.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.ArrayList;

@Component
public class DatabaseInitializerCharacter implements CommandLineRunner {

    @Autowired
    private CharacterRepository characterRepository;

    @Override
    public void run(String... args) throws Exception {

        createCharacter(
                "Tachy",
                "Tachy is the commanding officer of the 7th Airborne Squad. They say that in the Colony's combat simulations, her speed was unmatched. Her name is Tachy for a good reason.\n" +
                        "The 7th Airborne Squad gets obliterated by Naytibas while entering the Earth's atmosphere. However, the mission is still a go. Tachy finds EVE and intends to regroup with their squad.\n" +
                        "Yet the Naytibas' onslaught practically wipes out Tachy's squad. To make matters worse, an Unidentified Naytiba strikes without warning, leaving both Tachy and EVE at death's door. In this desperate moment, Tachy sacrifices herself to save EVE. There is still life in the Flames of Hope.\n" +
                        "Tachy, thought to be dead, somehow appears from the abyss of the matrix alive yet contaminated by an Alpha Core. She dies once again in EVE's arms, leaving EVE with her Memorystick, wanting more than anything to return to the stars."
        );

       createCharacter(
                "Adam",
                "Adam is a Scavenger from Xion. He saved EVE's life from an Unidentified Naytiba. Though EVE did not trust him at first, Adam suggests that he and EVE work together, and so they arrive at Eidos 7.\n" +
                        "After their business at Eidos 7 is over, Adam tells EVE about Xion, the Last Remaining City, and suggests that he and EVE work together even further.\n" +
                        "Adam is unlike any Scavengers, and his safehouse features advanced facilities like an Aerodrome and a Tetrapod. He even has a silver tongue, which persuaded Orcal to support EVE. He is definitely not an ordinary person.\n" +
                        "Before EVE enters the orbit elevator, Adam leaves the group, saying he got an urgent message from Xion. What could have possibly happened?\n" +
                        "Raven's onslaught had destroyed Xion and innocent lives were lost. However, Adam is nowhere to be seen.\n" +
                        "At the centre of the Nest, Adam tells EVE the truth, that he is both Raphael Marks, the creator of Mother Sphere, and the Elder Naytiba, the creator of Naytibas. He has been watching EVE in order to continue humanity and build a new humankind. He reaches his hand out to EVE, saying that the two of them should work together for the sake of humanity's salvation."
        );

    }



    private void createCharacter(String name, String description) {
        Character character = new Character();
        character.setName(name);
        character.setDescription(description);

        if (!characterRepository.existsByName(name)) {
            characterRepository.save(character);
            System.out.println("Character " + name + " has been saved to the database.");
        } else {
            System.out.println("Character " + name + " already exists in the database.");
        }
    }
}
