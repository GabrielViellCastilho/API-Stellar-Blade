package castilho.APIStellarBlade.controller.Naytiba;

import castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaIdAndNameDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaRequestDTO;
import castilho.APIStellarBlade.service.Naytiba.NaytibaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Naytiba")
public class NaytibaController {


    @Autowired
    NaytibaService naytibaService;

    @GetMapping
    public ResponseEntity<List<NaytibaDTO>> getAll() {
        return ResponseEntity.ok(naytibaService.getAllNaytibas());
    }

    @GetMapping("/names-and-ids")
    public ResponseEntity<List<NaytibaIdAndNameDTO>> listNaytibaIdAndName() {
        return  ResponseEntity.ok(naytibaService.getAllNaytibaNamesAndIds());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<NaytibaDTO> getNaytibaByName(@PathVariable String name) {
        return ResponseEntity.ok((naytibaService.getNaytibaByName(name)));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<NaytibaDTO> getNaytibaById(@PathVariable Long id) {
        return ResponseEntity.ok(naytibaService.getNaytibaById(id));
    }


    @PostMapping("/create")
    public ResponseEntity<NaytibaDTO> create(@RequestBody NaytibaRequestDTO naytibaRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(naytibaService.createNaytiba(naytibaRequestDTO));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        naytibaService.deleteNaytiba(id);
        return ResponseEntity.noContent().build();
    }
}
