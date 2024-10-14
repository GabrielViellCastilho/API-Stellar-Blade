package castilho.APIStellarBlade.service.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.StatusExospine;
import castilho.APIStellarBlade.domain.model.repository.Weapon.StatusExospineRepository;
import castilho.APIStellarBlade.dto.Weapon.StatusExospineRequestDTO;
import castilho.APIStellarBlade.exception.Weapon.StatusExospine.StatusExospineAlreadyExistException;
import castilho.APIStellarBlade.exception.Weapon.StatusExospine.StatusExospineNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusExospineService {

    @Autowired
    private StatusExospineRepository statusExospineRepository;

    public List<StatusExospine> getAllExospineStatus() {return statusExospineRepository.findAll();
    }

    public StatusExospine getExospineById(long id) {
        if (!statusExospineRepository.existsById(id)) {
            throw new StatusExospineNotFoundException(id);
        }
        return statusExospineRepository.findById(id).get();
    }

    public StatusExospine getExospineByStatus(String name) {
        if (!statusExospineRepository.existsStatusExospineByStatus(name)){
            throw new StatusExospineNotFoundException(name);
        }
        return statusExospineRepository.findStatusExospineByStatus(name);
    }

    public StatusExospine createExospine(StatusExospineRequestDTO requestDTO) {
        if (statusExospineRepository.existsStatusExospineByStatus(requestDTO.getStatus())) {
            throw new StatusExospineAlreadyExistException(requestDTO.getStatus());
        }
        StatusExospine statusExospine = new StatusExospine();
        statusExospine.setStatus(requestDTO.getStatus());
        return statusExospineRepository.save(statusExospine);
    }

    public void  deleteExospineById(long id) {
        if (!statusExospineRepository.existsById(id)) {
            throw new StatusExospineNotFoundException(id);
        }
        statusExospineRepository.deleteById(id);
    }


}
