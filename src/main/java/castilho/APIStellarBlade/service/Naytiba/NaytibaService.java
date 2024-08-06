package castilho.APIStellarBlade.service.Naytiba;

import castilho.APIStellarBlade.domain.model.entity.Naytiba.Naytiba;
import castilho.APIStellarBlade.domain.model.entity.Naytiba.NaytibaType;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaRepository;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaTypeRepository;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaIdAndNameDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaRequestDTO;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaAlreadyExistsException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaNotFoundException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NaytibaService {
    @Autowired
    private NaytibaRepository naytibaRepository;

    @Autowired
    private NaytibaTypeRepository typeRepository;

    public List<NaytibaIdAndNameDTO> getAllNaytibaNamesAndIds() {
        return naytibaRepository.findAllNaytibaNamesAndIds();
    }

    public List<NaytibaDTO> getAllNaytibas() {
        return naytibaRepository.findAllNaytibas();
    }

    public NaytibaDTO getNaytibaByName(String name) {
        return naytibaRepository.findByName(name)
                .orElseThrow(() -> new NaytibaNotFoundException(name));
    }

    public NaytibaDTO getNaytibaById(long id) {
        return naytibaRepository.findById(id)
                .orElseThrow(() -> new NaytibaNotFoundException(id));
    }

    public NaytibaDTO createNaytiba(NaytibaRequestDTO naytibaRequestDTO) {
        NaytibaType type = typeRepository.findById(naytibaRequestDTO.getIdType())
                .orElseThrow(() -> new NaytibaTypeNotFoundException(naytibaRequestDTO.getIdType()));

        Naytiba naytiba = new Naytiba();
        naytiba.setName(naytibaRequestDTO.getName());
        naytiba.setType(type);
        naytiba.setDescriptionEcologicalInformation(naytibaRequestDTO.getDescriptionEcologicalInformation());
        naytiba.setDescriptionCombatInformation(naytibaRequestDTO.getDescriptionCombatInformation());

        if (!naytibaRepository.existsByName(naytibaRequestDTO.getName())) {
            naytibaRepository.save(naytiba);
        }
        else {
            throw new NaytibaAlreadyExistsException(naytibaRequestDTO.getName());
        }

        NaytibaDTO reponse = naytibaRepository.findByName(naytibaRequestDTO.getName())
                .orElseThrow(() -> new RuntimeException());

        return reponse;
    }

    public void deleteNaytibaById(long id) {
        if (!naytibaRepository.existsById(id)) {
            throw new NaytibaNotFoundException(id);
        }
        naytibaRepository.deleteById(id);
    }
}
