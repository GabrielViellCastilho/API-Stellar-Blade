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
@RequestMapping("/Skills/Type")
public class SkillsTypeController {

    @Autowired
    private SkillsTypeService skillsTypeService;

    @GetMapping
    public ResponseEntity<List<SkillsType>> getAll() {
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
    public ResponseEntity<SkillsType> create(@RequestBody SkillsTypeRequestDTO skillsTypeRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(skillsTypeService.createSkillsType(skillsTypeRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<SkillsType> delete(@PathVariable long id) {
        skillsTypeService.DeleteSkillsType(id);
        return ResponseEntity.noContent().build();
    }

}
