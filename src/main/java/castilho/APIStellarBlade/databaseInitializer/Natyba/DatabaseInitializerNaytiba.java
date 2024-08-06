package castilho.APIStellarBlade.databaseInitializer.Natyba;

import castilho.APIStellarBlade.domain.model.entity.Naytiba.Naytiba;
import castilho.APIStellarBlade.domain.model.entity.Naytiba.NaytibaType;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaRepository;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializerNaytiba implements CommandLineRunner {

    @Autowired
    private NaytibaRepository naytibaRepository;

    @Autowired
    private NaytibaTypeRepository naytibaTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        createNaytiba(
                "Raven",
                1L,
                "When faced with the truth, Raven went mad with feelings of betrayal. Her descent was easy; all that the Elder Naytiba had to do was push her a little bit, and she fell into unimaginable ecstasy, blowing away the doubt and pain of her climb. The only things she has left are revenge and worship.",
                "*Raven likes to toy with the enemy with deceptive movements. Do not fall for her tricks.\n" +
                        "*Raven is able to get close and disable enemy defences with ease. Think fast and figure out some countermeasures\n" +
                        "*Raven is able to use the icy Cryo Blade at will and send out a wave of chill from a distance."
        );
    }

    private void createNaytiba(String name, Long idType , String descriptionEcologicalInformation, String descriptionCombatInformation) {
        NaytibaType type = naytibaTypeRepository.findById(idType)
                .orElseThrow(() -> new IllegalArgumentException("Invalid type ID: " + idType));


        Naytiba naytiba = new Naytiba();
        naytiba.setName(name);
        naytiba.setType(type);
        naytiba.setDescriptionEcologicalInformation(descriptionEcologicalInformation);
        naytiba.setDescriptionCombatInformation(descriptionCombatInformation);

        if (!naytibaRepository.existsByName(name)) {
            naytibaRepository.save(naytiba);
            System.out.println("Naytiba " + name + " has been saved to the database.");
        }
        else {
            System.out.println("Naytiba " + name + " already exists.");
        }

    }

}
