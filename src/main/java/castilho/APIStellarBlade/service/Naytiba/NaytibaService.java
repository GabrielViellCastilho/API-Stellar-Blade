package castilho.APIStellarBlade.service.Naytiba;

import castilho.APIStellarBlade.domain.model.entity.Natyba.Naytiba;
import castilho.APIStellarBlade.domain.model.entity.Natyba.NaytibaType;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaRepository;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaTypeRepository;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaIdAndNameDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaRequestDTO;
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
                .orElseThrow(() -> new RuntimeException("Naytiba not found with name: " + name));
    }

    public NaytibaDTO getNaytibaById(long id) {
        return naytibaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Naytiba not found with id: " + id));
    }

    public NaytibaDTO createNaytiba(NaytibaRequestDTO naytibaRequestDTO) {
        NaytibaType type = typeRepository.findById(naytibaRequestDTO.getIdType())
                .orElseThrow(() -> new RuntimeException("Type not found with id: " + naytibaRequestDTO.getIdType()));

        Naytiba naytiba = new Naytiba();
        naytiba.setName(naytibaRequestDTO.getName());
        naytiba.setType(type);
        naytiba.setDescriptionEcologicalInformation(naytibaRequestDTO.getDescriptionEcologicalInformation());
        naytiba.setDescriptionCombatInformation(naytibaRequestDTO.getDescriptionCombatInformation());
        naytibaRepository.save(naytiba);

        NaytibaDTO reponse = naytibaRepository.findByName(naytibaRequestDTO.getName())
                .orElseThrow(() -> new RuntimeException());

        return reponse;
    }
}
