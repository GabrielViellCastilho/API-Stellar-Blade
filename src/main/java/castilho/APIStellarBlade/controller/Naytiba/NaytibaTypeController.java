package castilho.APIStellarBlade.controller.Naytiba;


import castilho.APIStellarBlade.domain.model.entity.Naytiba.NaytibaType;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaTypeRequestDTO;
import castilho.APIStellarBlade.service.Naytiba.NaytibaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Naytiba/Type")
public class NaytibaTypeController {

    @Autowired
    private NaytibaTypeService naytibaTypeService;

    @GetMapping
    public ResponseEntity<List<NaytibaType>> getAll() {
        return  ResponseEntity.ok(naytibaTypeService.getAllNaytibaTypes());
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<NaytibaType> getNaytibaTypeById(@PathVariable long id) {
        return  ResponseEntity.ok(naytibaTypeService.getNaytibaTypeById(id));
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<NaytibaType> getNaytibaTypeByName(@PathVariable String name) {
        return  ResponseEntity.ok(naytibaTypeService.getNaytibaTypeByName(name));
    }

    @PostMapping("/create")
    public ResponseEntity<NaytibaType> create(@RequestBody NaytibaTypeRequestDTO naytibaTypeRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(naytibaTypeService.createNaytibaType(naytibaTypeRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        naytibaTypeService.deleteNaytibaType(id);
        return ResponseEntity.noContent().build();
    }



}
