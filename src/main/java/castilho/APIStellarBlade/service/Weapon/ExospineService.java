package castilho.APIStellarBlade.service.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.Exospine;
import castilho.APIStellarBlade.domain.model.repository.Weapon.ExospineRepository;
import castilho.APIStellarBlade.exception.Weapon.Exospine.ExospineNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExospineService {

    @Autowired
    ExospineRepository exospineRepository;

    public List<Exospine> getAllExospine(){return exospineRepository.findAll();
    }

    public Exospine getExospineById(long id){
        if (!exospineRepository.existsById(id)){
          throw new ExospineNotFoundException(id);
        }
        return exospineRepository.findById(id).get();
    }
}
