package castilho.APIStellarBlade.service.Naytiba;

import castilho.APIStellarBlade.domain.model.entity.Natyba.NaytibaType;
import castilho.APIStellarBlade.domain.model.repository.Natyba.NaytibaTypeRepository;
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
}
