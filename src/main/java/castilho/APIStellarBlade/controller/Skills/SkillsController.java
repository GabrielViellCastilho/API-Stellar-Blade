package castilho.APIStellarBlade.controller.Skills;

import castilho.APIStellarBlade.domain.model.entity.Skills.Skills;
import castilho.APIStellarBlade.dto.Skills.SkillsRequestDTO;
import castilho.APIStellarBlade.service.Skills.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Skills")
public class SkillsController {

   @Autowired
    private SkillsService skillsService;

   @GetMapping
    public ResponseEntity<List<Skills>> getAllSkills() {
       return ResponseEntity.ok(skillsService.getAllSkills());
   }

   @GetMapping("/search/name/{name}")
   public ResponseEntity<Skills> getSkillsByName(@PathVariable String name) {
    return ResponseEntity.ok(skillsService.getSkillsByName(name));
   }

   @GetMapping("/search/id/{id}")
    public ResponseEntity<Skills> getSkillById(@PathVariable long id) {
       return ResponseEntity.ok(skillsService.getSkillsById(id));
   }

   @PostMapping("/create")
    public ResponseEntity<Skills> createSkill(@RequestBody SkillsRequestDTO skillsRequestDTO) {
       Skills skills = skillsService.createSkills(skillsRequestDTO);
       return ResponseEntity.status(HttpStatus.CREATED).body(skills);
   }

   @DeleteMapping("/delete/{id}")
    public ResponseEntity<Skills> deleteSkill(@PathVariable long id) {
       skillsService.DeleteSkillsById(id);
       return ResponseEntity.noContent().build();
   }


}
