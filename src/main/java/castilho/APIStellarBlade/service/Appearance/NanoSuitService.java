package castilho.APIStellarBlade.service.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.NanoSuit;
import castilho.APIStellarBlade.domain.model.repository.Appearance.NanoSuitRepository;
import castilho.APIStellarBlade.dto.Appearance.NanoSuitRequestDTO;
import castilho.APIStellarBlade.exception.Appearance.NanoSuit.NanoSuitAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.NanoSuit.NanoSuitNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NanoSuitService {

    @Autowired
    private NanoSuitRepository nanoSuitRepository;

    public List<NanoSuit> getAll() {
        return nanoSuitRepository.findAll();
    }
    
    public NanoSuit getById(long id) {
       if (!nanoSuitRepository.existsById(id)) {
           throw new NanoSuitNotFoundException(id);
       }
       return nanoSuitRepository.findById(id).get();
    }

    public NanoSuit getByName(String name) {
        if (!nanoSuitRepository.existsByName(name)) {
            throw new NanoSuitNotFoundException(name);
        }
        return nanoSuitRepository.findByName(name);
    }

    public NanoSuit createNanoSuit(NanoSuitRequestDTO nanoSuitRequestDTO) {
        if (nanoSuitRepository.existsByName(nanoSuitRequestDTO.getName())) {
            throw new NanoSuitAlreadyExistException(nanoSuitRequestDTO.getName());
        }
        NanoSuit nanoSuit = new NanoSuit();
        nanoSuit.setName(nanoSuitRequestDTO.getName());
        nanoSuit.setDescription(nanoSuitRequestDTO.getDescription());
        nanoSuit.setNumberOfStars(nanoSuitRequestDTO.getNumberOfStars());
        nanoSuitRepository.save(nanoSuit);
        return nanoSuit;
    }

    public void deleteNanoSuitById(long id) {
        if (!nanoSuitRepository.existsById(id)) {
            throw new NanoSuitNotFoundException(id);
        }
        nanoSuitRepository.deleteById(id);
    }

}
