package castilho.APIStellarBlade.controller.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.Exospine;
import castilho.APIStellarBlade.dto.Weapon.ExospineRequestDTO;
import castilho.APIStellarBlade.service.Weapon.ExospineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Exospine")
public class ExospineController {

    @Autowired
    private ExospineService exospineService;

    @GetMapping
    public ResponseEntity<List<Exospine>> getAll(){
        return ResponseEntity.ok(exospineService.getAllExospine());
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Exospine> getById(@PathVariable long id){
        return ResponseEntity.ok(exospineService.getExospineById(id));
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<Exospine> getByName(@PathVariable String name){
        return ResponseEntity.ok(exospineService.getExospineByName(name));
    }

    @PostMapping("/create")
    public ResponseEntity<Exospine> create(@RequestBody ExospineRequestDTO exospineRequestDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(exospineService.createExospine(exospineRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable long id){
        exospineService.deleteExospine(id);
        return ResponseEntity.noContent().build();
    }
}
