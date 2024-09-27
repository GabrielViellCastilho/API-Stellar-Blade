package castilho.APIStellarBlade.service.Skills;

import castilho.APIStellarBlade.domain.model.entity.Skills.SkillsType;
import castilho.APIStellarBlade.domain.model.repository.Skills.SkillsTypeRepository;
import castilho.APIStellarBlade.dto.Skills.SkillsTypeRequestDTO;
import castilho.APIStellarBlade.exception.Skills.SkillsType.SkillsTypeAlreadyExistException;
import castilho.APIStellarBlade.exception.Skills.SkillsType.SkillsTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsTypeService {

    @Autowired
    private SkillsTypeRepository skillsTypeRepository;

    public List<SkillsType> getAllSkillsType() {
        return skillsTypeRepository.findAll();
    }

    public SkillsType getSkillsTypeById(long id) {
        if (!skillsTypeRepository.existsById(id)) {
            throw new SkillsTypeNotFoundException(id);
        }
        return skillsTypeRepository.findById(id).get();

    }

    public  SkillsType getSkillsTypeByName(String name) {
        if (!skillsTypeRepository.existsByName(name)) {
            throw new SkillsTypeNotFoundException(name);
        }
        return skillsTypeRepository.findByName(name);
    }

    public SkillsType createSkillsType(SkillsTypeRequestDTO SkillsTypeRequestDTO) {
        if (skillsTypeRepository.existsByName(SkillsTypeRequestDTO.getName())) {
            throw new SkillsTypeAlreadyExistException(SkillsTypeRequestDTO.getName());
        }
        SkillsType skillsType = new SkillsType();
        skillsType.setName(SkillsTypeRequestDTO.getName());
        skillsTypeRepository.save(skillsType);
        return skillsType;
    }

    public void DeleteSkillsTypeById(long id) {
        if (!skillsTypeRepository.existsById(id)) {
            throw new SkillsTypeNotFoundException(id);
        }
        skillsTypeRepository.deleteById(id);
    }
}
