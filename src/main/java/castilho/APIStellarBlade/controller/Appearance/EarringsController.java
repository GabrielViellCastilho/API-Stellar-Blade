package castilho.APIStellarBlade.controller.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.Earrings;
import castilho.APIStellarBlade.dto.Appearance.EarringsRequestDTO;
import castilho.APIStellarBlade.service.Appearance.EarringsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Earrings")
public class EarringsController {

    @Autowired
    private EarringsService earringsService;

    @GetMapping
    public ResponseEntity<List<Earrings>> getAll() {
        return ResponseEntity.ok(earringsService.getAllEarrings());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<Earrings> searchByName(@PathVariable String name) {
        return ResponseEntity.ok(earringsService.getByName(name));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Earrings> getById(@PathVariable long id) {
        return ResponseEntity.ok(earringsService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Earrings> create(@RequestBody EarringsRequestDTO earringsRequestDTO) {
        Earrings earrings = earringsService.createEarrings(earringsRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(earrings);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        earringsService.deleteEarrings(id);
        return ResponseEntity.noContent().build();
    }

}
