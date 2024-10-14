package castilho.APIStellarBlade.controller.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.NanoSuit;
import castilho.APIStellarBlade.dto.Appearance.NanoSuitRequestDTO;
import castilho.APIStellarBlade.service.Appearance.NanoSuitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/NanoSuit")
public class NanoSuitController {

    @Autowired
    private NanoSuitService nanoSuitService;

    @GetMapping
    public ResponseEntity<List<NanoSuit>> getAll() {
        return ResponseEntity.ok(nanoSuitService.getAllNanoSuits());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<NanoSuit> getByName(@PathVariable String name) {
        return ResponseEntity.ok(nanoSuitService.getByName(name));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<NanoSuit> getById(@PathVariable long id) {
        return ResponseEntity.ok(nanoSuitService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<NanoSuit> create(@RequestBody NanoSuitRequestDTO nanoSuitRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(nanoSuitService.createNanoSuit(nanoSuitRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        nanoSuitService.deleteNanoSuitById(id);
        return ResponseEntity.noContent().build();
    }
}
