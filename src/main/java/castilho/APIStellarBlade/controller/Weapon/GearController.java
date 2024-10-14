package castilho.APIStellarBlade.controller.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.Gear;
import castilho.APIStellarBlade.dto.Weapon.GearRequestDTO;
import castilho.APIStellarBlade.service.Weapon.GearService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Gear")
public class GearController {

    @Autowired
    private GearService gearService;

    @GetMapping
    public ResponseEntity<List<Gear>> getAll() { return ResponseEntity.ok(gearService.getAllGears());}

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Gear> getById(@PathVariable long id) {
        return ResponseEntity.ok(gearService.getGearById(id));
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<Gear> getByName(@PathVariable String name) {
        return ResponseEntity.ok(gearService.getGearByName(name));
    }

    @PostMapping("/create")
    public ResponseEntity<Gear> create(@RequestBody GearRequestDTO gearRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(gearService.createGear(gearRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable long id) {
        gearService.deleteGearById(id);
        return ResponseEntity.noContent().build();
    }
}
