package castilho.APIStellarBlade.controller.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.StatusExospine;
import castilho.APIStellarBlade.dto.Weapon.StatusExospineRequestDTO;
import castilho.APIStellarBlade.service.Weapon.StatusExospineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Exospine/Status")
public class StatusExpospineController {
     @Autowired
    private StatusExospineService statusExospineService;

     @GetMapping
    public ResponseEntity<List<StatusExospine>> getAll() {
         return ResponseEntity.ok(statusExospineService.getAllExospineStatus());
     }

     @GetMapping("/search/id/{id}")
    public ResponseEntity<StatusExospine> getById(@PathVariable long id) {
         return ResponseEntity.ok(statusExospineService.getExospineById(id));
     }

     @GetMapping("/search/status/{status}")
    public ResponseEntity<StatusExospine> getByStatus(@PathVariable String status) {
         return ResponseEntity.ok(statusExospineService.getExospineByStatus(status));
     }

     @PostMapping("/create")
    public  ResponseEntity<StatusExospine> create(@RequestBody StatusExospineRequestDTO statusExospineRequestDTO) {
         return ResponseEntity.status(HttpStatus.CREATED).body(statusExospineService.createExospine(statusExospineRequestDTO));
     }

     @DeleteMapping("/delete/{id}")
    public  ResponseEntity delete(@PathVariable long id) {
         statusExospineService.deleteExospine(id);
         return ResponseEntity.noContent().build();
     }
}
