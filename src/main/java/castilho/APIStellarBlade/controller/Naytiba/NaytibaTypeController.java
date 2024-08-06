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
@RequestMapping("/naytiba_type")
public class NaytibaTypeController {

    @Autowired
    private NaytibaTypeService naytibaTypeService;

    @GetMapping
    public ResponseEntity<List<NaytibaType>> getAllNaytibaTypes() {
        return  ResponseEntity.ok(naytibaTypeService.getAllNaytibaTypes());
    }

    @GetMapping("search/id/{id}")
    public ResponseEntity<NaytibaType> searchNaytibaTypeById(@PathVariable long id) {
        return  ResponseEntity.ok(naytibaTypeService.getNaytibaTypeById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<NaytibaType> createNaytibaType(@RequestBody NaytibaTypeRequestDTO naytibaTypeRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(naytibaTypeService.createNaytibaType(naytibaTypeRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteNaytibaType(@PathVariable long id) {
        naytibaTypeService.deleteNaytibaTypeById(id);
        return ResponseEntity.noContent().build();
    }



}
