package castilho.APIStellarBlade.service.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.Exospine;
import castilho.APIStellarBlade.domain.model.entity.Weapon.StatusExospine;
import castilho.APIStellarBlade.domain.model.repository.Weapon.ExospineRepository;
import castilho.APIStellarBlade.domain.model.repository.Weapon.StatusExospineRepository;
import castilho.APIStellarBlade.dto.Weapon.ExospineRequestDTO;
import castilho.APIStellarBlade.exception.Weapon.Exospine.ExospineAlreadyExistException;
import castilho.APIStellarBlade.exception.Weapon.Exospine.ExospineNotFoundException;
import castilho.APIStellarBlade.exception.Weapon.StatusExospine.StatusExospineNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ExospineService {

    @Autowired
    ExospineRepository exospineRepository;

    @Autowired
    StatusExospineRepository statusExospineRepository;

    public List<Exospine> getAllExospine(){return exospineRepository.findAll();
    }

    public Exospine getExospineById(long id){
        if (!exospineRepository.existsById(id)){
          throw new ExospineNotFoundException(id);
        }
        return exospineRepository.findById(id).get();
    }

    public Exospine getExospineByName(String name) {
        if (!exospineRepository.existsByName(name)){
            throw new ExospineNotFoundException(name);
        }
        return exospineRepository.findByName(name);
    }

    public Exospine createExospine(ExospineRequestDTO exospineRequestDTO){
        if (exospineRepository.existsByName(exospineRequestDTO.getName())){
            throw new ExospineAlreadyExistException(exospineRequestDTO.getName());
        }

        List<StatusExospine> listStatusExospine = new ArrayList<StatusExospine>();

        exospineRequestDTO.getStatusExospines().stream().forEach(status->{
            if (!statusExospineRepository.existsStatusExospineByStatus(status)){
                throw new StatusExospineNotFoundException(status);
            }
            listStatusExospine.add(statusExospineRepository.findStatusExospineByStatus(status));
        });

        Exospine exospine = new Exospine();
        exospine.setName(exospineRequestDTO.getName());
        exospine.setDescription(exospineRequestDTO.getDescription());
        exospine.setNumberOfStars(exospineRequestDTO.getNumberOfStars());
        exospine.setStatusExospines(listStatusExospine);

        return exospineRepository.save(exospine);
    }

    public void deleteExospineById(long id){
        if (!exospineRepository.existsById(id)){
            throw new ExospineNotFoundException(id);
        }
        exospineRepository.deleteById(id);
    }
}
