package castilho.APIStellarBlade.controller.Skills;

import castilho.APIStellarBlade.domain.model.entity.Skills.SkillsType;
import castilho.APIStellarBlade.dto.Skills.SkillsTypeRequestDTO;
import castilho.APIStellarBlade.service.Skills.SkillsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/SkillsType")
public class SkillsTypeController {

    @Autowired
    private SkillsTypeService skillsTypeService;

    @GetMapping
    public ResponseEntity<List<SkillsType>> getAllSkillsType() {
        return ResponseEntity.ok(skillsTypeService.getAllSkillsType());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<SkillsType> getSkillsTypeByName(@PathVariable String name) {
        return ResponseEntity.ok(skillsTypeService.getSkillsTypeByName(name));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<SkillsType> getSkillsTypeById(@PathVariable long id) {
        return ResponseEntity.ok(skillsTypeService.getSkillsTypeById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<SkillsType> createSkillsType(@RequestBody SkillsTypeRequestDTO skillsTypeRequestDTO) {
        SkillsType skillsType = skillsTypeService.createSkillsType(skillsTypeRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(skillsType);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<SkillsType> deleteSkillsType(@PathVariable long id) {
        skillsTypeService.DeleteSkillsTypeById(id);
        return ResponseEntity.noContent().build();
    }

}
