package castilho.APIStellarBlade.controller.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.Hairs;
import castilho.APIStellarBlade.dto.Appearance.HairsRequestDTO;
import castilho.APIStellarBlade.service.Appearance.HairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Hairs")
public class HairsController {

    @Autowired
    private HairsService hairsService;

    @GetMapping
    public ResponseEntity<List<Hairs>> getAllHairs() {
        return ResponseEntity.ok(hairsService.getAllHairs());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<Hairs> searchByName(@PathVariable String name) {
        return ResponseEntity.ok(hairsService.getByName(name));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Hairs> getById(@PathVariable long id) {
        return ResponseEntity.ok(hairsService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Hairs> create(@RequestBody HairsRequestDTO hairsRequestDTO) {
        Hairs hair = hairsService.createHairs(hairsRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(hair);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        hairsService.deleteHairs(id);
        return ResponseEntity.noContent().build();
    }
}
