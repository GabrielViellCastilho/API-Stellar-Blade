package castilho.APIStellarBlade.service.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.Earrings;
import castilho.APIStellarBlade.domain.model.repository.Appearance.EarringsRepository;
import castilho.APIStellarBlade.dto.Appearance.EarringsRequestDTO;
import castilho.APIStellarBlade.exception.Appearance.Earrings.EarringsAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.Earrings.EarringsNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EarringsService {
    @Autowired
    private EarringsRepository earringsRepository;

    public List<Earrings> getAllEarrings() {return  earringsRepository.findAll();}

    public Earrings getById(long id) {
        if (!earringsRepository.existsById(id)){
            throw new EarringsNotFoundException(id);
        }
        return earringsRepository.findById(id).get();
    }

    public  Earrings getByName(String name) {
        if (!earringsRepository.existsByName(name)){
            throw new EarringsNotFoundException(name);
        }
        return earringsRepository.findByName(name);
    }

    public Earrings createEarrings(EarringsRequestDTO earringsRequestDTO) {
        if (earringsRepository.existsByName(earringsRequestDTO.getName())){
            throw new EarringsAlreadyExistException(earringsRequestDTO.getName());
        }
        Earrings earrings = new Earrings();
        earrings.setName(earringsRequestDTO.getName());
        earrings.setDescription(earringsRequestDTO.getDescription());
        earrings.setNumberOfStars(earringsRequestDTO.getNumberOfStars());
        earringsRepository.save(earrings);
        return earrings;
    }

    public void deleteEarrings(long id) {
        if (!earringsRepository.existsById(id)){
            throw new EarringsNotFoundException(id);
        }
        earringsRepository.deleteById(id);
    }
}
