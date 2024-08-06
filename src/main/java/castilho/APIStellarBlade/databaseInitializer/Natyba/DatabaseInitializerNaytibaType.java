package castilho.APIStellarBlade.databaseInitializer.Natyba;

import castilho.APIStellarBlade.domain.model.entity.Naytiba.NaytibaType;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseInitializerNaytibaType implements CommandLineRunner {

    @Autowired
    private NaytibaTypeRepository naytibaTypeRepository;

    @Override
    public void run(String... args) throws Exception {
        createNaytibaType("Alpha Naytiba");
    }


    private void createNaytibaType(String type) {
        NaytibaType naytibaType = new NaytibaType();
        naytibaType.setType(type);

        if (!naytibaTypeRepository.existsByType(type)){
            naytibaTypeRepository.save(naytibaType);
            System.out.println("Naytiba Type " + type + " has been saved to the database.");
        }
        else {
            System.out.println("Naytiba Type " + type + " already exists in the database.");
        }

    }
}
