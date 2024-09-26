package castilho.APIStellarBlade.service.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.Hairs;
import castilho.APIStellarBlade.domain.model.repository.Appearance.HairsRepository;
import castilho.APIStellarBlade.dto.Appearance.HairsRequestDTO;
import castilho.APIStellarBlade.exception.Appearance.Hairs.HairAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.Hairs.HairNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HairsService {

    @Autowired
    private HairsRepository hairsRepository;

    public List<Hairs> getAllHairs() {return  hairsRepository.findAll();}

    public Hairs getById(long id) {
        if (!hairsRepository.existsById(id)){
            throw new HairNotFoundException(id);
        }
        return hairsRepository.findById(id).get();
    }

    public  Hairs getByName(String name) {
        if (!hairsRepository.existsByName(name)){
            throw new HairNotFoundException(name);
        }
        return hairsRepository.findByName(name);
    }

    public Hairs createHairs(HairsRequestDTO hairsDTO) {
        if (hairsRepository.existsByName(hairsDTO.getName())){
            throw new HairAlreadyExistException(hairsDTO.getName());
        }
        Hairs hairs = new Hairs();
        hairs.setName(hairsDTO.getName());
        hairs.setDescription(hairsDTO.getDescription());
        hairsRepository.save(hairs);
        return hairs;
    }

    public void deleteHairs(long id) {
        if (!hairsRepository.existsById(id)){
            throw new HairNotFoundException(id);
        }
        hairsRepository.deleteById(id);
    }
}
