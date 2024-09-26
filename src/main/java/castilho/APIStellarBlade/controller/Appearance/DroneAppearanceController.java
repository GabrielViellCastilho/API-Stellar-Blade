package castilho.APIStellarBlade.controller.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.DroneAppearance;
import castilho.APIStellarBlade.dto.Appearance.DroneAppearanceDTO;
import castilho.APIStellarBlade.service.Appearance.DroneAppearanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/DroneAppearance")
public class DroneAppearanceController {

    @Autowired
    private DroneAppearanceService droneAppearanceService;

    @GetMapping
    public ResponseEntity<List<DroneAppearance>> getAll() {
        return ResponseEntity.ok(droneAppearanceService.getAllDroneAppearances());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<DroneAppearance> searchByName(@PathVariable String name) {
        return ResponseEntity.ok(droneAppearanceService.getByName(name));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<DroneAppearance> getById(@PathVariable long id) {
        return ResponseEntity.ok(droneAppearanceService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<DroneAppearance> create(@RequestBody DroneAppearanceDTO droneAppearanceDTO) {
        DroneAppearance droneAppearance = droneAppearanceService.createDroneAppearance(droneAppearanceDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(droneAppearance);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        droneAppearanceService.deleteDroneAppearanceById(id);
        return ResponseEntity.noContent().build();
    }
}
