package castilho.APIStellarBlade.service.Naytiba;

import castilho.APIStellarBlade.domain.model.entity.Naytiba.NaytibaType;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaTypeRepository;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaTypeRequestDTO;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaTypeAlreadyExistsException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NaytibaTypeService {
    @Autowired
    private NaytibaTypeRepository naytibaTypeRepository;

    public List<NaytibaType> getAllNaytibaTypes() {
        return naytibaTypeRepository.findAll();
    }

    public NaytibaType getNaytibaTypeById(long id) {
        return naytibaTypeRepository.findById(id).orElseThrow(()-> new NaytibaTypeNotFoundException(id));
    }

    public NaytibaType createNaytibaType(NaytibaTypeRequestDTO naytibaTypeRequestDTO) {
        NaytibaType naytibaType = new NaytibaType();
        naytibaType.setType(naytibaTypeRequestDTO.getType());

        if (!naytibaTypeRepository.existsByType(naytibaTypeRequestDTO.getType())){
            naytibaTypeRepository.save(naytibaType);
        }
        else throw new NaytibaTypeAlreadyExistsException(naytibaTypeRequestDTO.getType());

        return naytibaTypeRepository.findByType(naytibaTypeRequestDTO.getType());
    }

    public void deleteNaytibaTypeById(long id) {
        if (!naytibaTypeRepository.existsById(id)){
            throw new NaytibaTypeNotFoundException(id);
        }
        naytibaTypeRepository.deleteById(id);
    }
}
