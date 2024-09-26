package castilho.APIStellarBlade.service.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.DroneAppearance;
import castilho.APIStellarBlade.domain.model.repository.Appearance.DroneAppearanceRepository;
import castilho.APIStellarBlade.dto.Appearance.DroneAppearanceRequestDTO;
import castilho.APIStellarBlade.exception.Appearance.DroneAppearance.DroneAppearanceAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.DroneAppearance.DroneAppearanceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneAppearanceService {

    @Autowired
    private DroneAppearanceRepository droneAppearanceRepository;

    public List<DroneAppearance> getAllDroneAppearances(){
        return droneAppearanceRepository.findAll();
    }

    public DroneAppearance getById(long id) {
        if (!droneAppearanceRepository.existsById(id)) {
            throw new DroneAppearanceNotFoundException(id);
        }
        return droneAppearanceRepository.findById(id).get();
    }

    public DroneAppearance getByName(String name) {
        if (!droneAppearanceRepository.existsByName(name)) {
            throw new DroneAppearanceNotFoundException(name);
        }
        return droneAppearanceRepository.findByName(name);
    }

    public DroneAppearance createDroneAppearance(DroneAppearanceRequestDTO droneAppearanceRequestDTO) {
        if (droneAppearanceRepository.existsByName(droneAppearanceRequestDTO.getName())) {
            throw new DroneAppearanceAlreadyExistException(droneAppearanceRequestDTO.getName());
        }
        DroneAppearance droneAppearance = new DroneAppearance();
        droneAppearance.setName(droneAppearanceRequestDTO.getName());
        droneAppearance.setDescription(droneAppearanceRequestDTO.getDescription());
        droneAppearance.setNumberOfStars(droneAppearanceRequestDTO.getNumberOfStars());
        droneAppearanceRepository.save(droneAppearance);
        return droneAppearance;
    }

    public void deleteDroneAppearanceById(long id) {
        if (!droneAppearanceRepository.existsById(id)) {
            throw new DroneAppearanceNotFoundException(id);
        }
       droneAppearanceRepository.deleteById(id);

}
}
