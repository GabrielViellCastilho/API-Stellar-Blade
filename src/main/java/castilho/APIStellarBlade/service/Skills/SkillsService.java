package castilho.APIStellarBlade.service.Skills;

import castilho.APIStellarBlade.domain.model.entity.Skills.Skills;
import castilho.APIStellarBlade.domain.model.entity.Skills.SkillsType;
import castilho.APIStellarBlade.domain.model.repository.Skills.SkillsRepository;
import castilho.APIStellarBlade.domain.model.repository.Skills.SkillsTypeRepository;
import castilho.APIStellarBlade.dto.Skills.SkillsRequestDTO;
import castilho.APIStellarBlade.exception.Skills.Skills.SkillsAlreadyExistException;
import castilho.APIStellarBlade.exception.Skills.Skills.SkillsNotFoundException;
import castilho.APIStellarBlade.exception.Skills.SkillsType.SkillsTypeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {
    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private SkillsTypeRepository skillsTypeRepository;

    public List<Skills> getAllSkills() {
        return skillsRepository.findAll();
    }

    public Skills getSkillsById(long id) {
        if (!skillsRepository.existsById(id)) {
            throw new SkillsNotFoundException(id);
        }
        return skillsRepository.findById(id).get();
    }

    public Skills getSkillsByName(String name) {
        if (!skillsRepository.existsByName(name)) {
            throw new SkillsNotFoundException(name);
        }
        return skillsRepository.findByName(name);
    }

    public Skills createSkills(SkillsRequestDTO skillsRequestDTO){
        SkillsType skillsType = skillsTypeRepository.findById(skillsRequestDTO.getIdSkillsType()).
                orElseThrow(() ->  new SkillsTypeNotFoundException(skillsRequestDTO.getIdSkillsType()));

        if (skillsRepository.existsByName(skillsRequestDTO.getName())) {
            throw new SkillsAlreadyExistException(skillsRequestDTO.getName());
        }

        Skills skills = new Skills();
        skills.setName(skillsRequestDTO.getName());
        skills.setDescription(skillsRequestDTO.getDescription());
        skills.setSkillsType(skillsType);
        skills.setSP(skillsRequestDTO.getSP());
       skillsRepository.save(skills);
       return skills;
    }

    public void DeleteSkillsById(long id) {
        if (!skillsRepository.existsById(id)) {
            throw new SkillsNotFoundException(id);
        }
        skillsRepository.deleteById(id);
    }
}

