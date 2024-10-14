package castilho.APIStellarBlade.controller.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.FaceDecoration;
import castilho.APIStellarBlade.dto.Appearance.FaceDecorationDTO;
import castilho.APIStellarBlade.service.Appearance.FaceDecorationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/FaceDecoration")
public class FaceDecorationController {

    @Autowired
    private FaceDecorationService faceDecorationService;

    @GetMapping
    public ResponseEntity<List<FaceDecoration>> getAll() {
        return ResponseEntity.ok(faceDecorationService.getAllFaceDecorations());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<FaceDecoration> getByName(@PathVariable String name) {
        return ResponseEntity.ok(faceDecorationService.getByName(name));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<FaceDecoration> getById(@PathVariable long id) {
        return ResponseEntity.ok(faceDecorationService.getById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<FaceDecoration> create(@RequestBody FaceDecorationDTO faceDecorationDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(faceDecorationService.createFaceDecoration(faceDecorationDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        faceDecorationService.deleteFaceDecorationById(id);
        return ResponseEntity.noContent().build();
    }

}
