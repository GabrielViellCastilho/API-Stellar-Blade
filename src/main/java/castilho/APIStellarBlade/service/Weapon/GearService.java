package castilho.APIStellarBlade.service.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.Gear;
import castilho.APIStellarBlade.domain.model.repository.Weapon.GearRepository;
import castilho.APIStellarBlade.dto.Weapon.GearRequestDTO;
import castilho.APIStellarBlade.exception.Weapon.Gear.GearAlreadyExistException;
import castilho.APIStellarBlade.exception.Weapon.Gear.GearNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GearService {
    @Autowired
    private GearRepository gearRepository;

    public List<Gear> getAllGears() {
        return gearRepository.findAll();
    }

    public Gear getGearById(long id) {
        if (!gearRepository.existsById(id)) {
            throw new GearNotFoundException(id);
        }
        return gearRepository.findById(id).get();
    }

    public Gear getGearByName(String name) {
        if (!gearRepository.existsByName(name)) {
            throw new GearNotFoundException(name);
        }
        return gearRepository.findByName(name);
    }

    public Gear createGear(GearRequestDTO gearRequestDTO) {
        if (gearRepository.existsByName(gearRequestDTO.getName())) {
            throw new GearAlreadyExistException(gearRequestDTO.getName());
        }
        Gear gear = new Gear();
        gear.setName(gearRequestDTO.getName());
        gear.setDescription(gearRequestDTO.getDescription());
        gear.setNumberOfStars(gearRequestDTO.getNumberOfStars());
        gear.setStatus(gearRequestDTO.getStatus());
        return gearRepository.save(gear);
    }

    public void deleteGearById(long id) {
        if (!gearRepository.existsById(id)) {
            throw new GearNotFoundException(id);
        }
        gearRepository.deleteById(id);
    }
}
