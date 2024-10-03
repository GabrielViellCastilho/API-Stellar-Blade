package castilho.APIStellarBlade.controller.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.Fish;
import castilho.APIStellarBlade.dto.Fish.FishRequestDTO;
import castilho.APIStellarBlade.service.Fish.FishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fish")
public class FishController {

    @Autowired
    private FishService fishService;

    @GetMapping
    public ResponseEntity<List<Fish>> getAll() {
        return ResponseEntity.ok(fishService.getAllFish());
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Fish> getById(@PathVariable long id) {
        return ResponseEntity.ok(fishService.getFishById(id));
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<Fish> getByName(@PathVariable String name) {
        return ResponseEntity.ok(fishService.getFishByName(name));
    }

    @PostMapping("/create")
    public ResponseEntity<Fish> create(@RequestBody FishRequestDTO fishRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(fishService.createFish(fishRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Fish> delete(@PathVariable long id) {
        fishService.deleteFish(id);
        return ResponseEntity.noContent().build();
    }
}
