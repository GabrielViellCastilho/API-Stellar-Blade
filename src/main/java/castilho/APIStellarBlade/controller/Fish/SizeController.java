package castilho.APIStellarBlade.controller.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.Size;
import castilho.APIStellarBlade.dto.Fish.SizeRequestDTO;
import castilho.APIStellarBlade.service.Fish.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fish/Size")
public class SizeController {

    @Autowired
    private SizeService sizeService;

    @GetMapping
    public ResponseEntity<List<Size>> getAll() {
        return ResponseEntity.ok(sizeService.getAllSizes());
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Size> getById(@PathVariable long id) {
        return ResponseEntity.ok(sizeService.getSizeById(id));
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<Size> getByName(@PathVariable String name) {
        return ResponseEntity.ok(sizeService.getSizeByName(name));
    }


    @PostMapping("/create")
    public ResponseEntity<Size> create(@RequestBody SizeRequestDTO sizeRequestDTO) {
        return  ResponseEntity.status(HttpStatus.CREATED).body(sizeService.createSize(sizeRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Size> delete(@PathVariable long id) {
        sizeService.deleteSize(id);
        return  ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
