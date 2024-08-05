package castilho.APIStellarBlade.controller.Naytiba;

import castilho.APIStellarBlade.domain.model.entity.Natyba.NaytibaType;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaIdAndNameDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaRequestDTO;
import castilho.APIStellarBlade.service.Naytiba.NaytibaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/naytiba")
public class NaytibaController {


    @Autowired
    NaytibaService naytibaService;

    @GetMapping
    public ResponseEntity<List<NaytibaDTO>> getAll() {
        return ResponseEntity.ok(naytibaService.getAllNaytibas());
    }

    @GetMapping("/get_id")
    public ResponseEntity<List<NaytibaIdAndNameDTO>> listNaytibaIdAndName() {
        return  ResponseEntity.ok(naytibaService.getAllNaytibaNamesAndIds());
    }

    @GetMapping("/search/name/{nameNaytiba}")
    public ResponseEntity<NaytibaDTO> searchNaytibaByName(@PathVariable String nameNaytiba) {
        return ResponseEntity.ok((naytibaService.getNaytibaByName(nameNaytiba)));
    }

    @GetMapping("/search/id/{idNaytiba}")
    public ResponseEntity<NaytibaDTO> searchNaytibaById(@PathVariable Long idNaytiba) {
        return ResponseEntity.ok(naytibaService.getNaytibaById(idNaytiba));
    }


    @PostMapping("/create")
    public ResponseEntity<NaytibaDTO> createNaytiba(@RequestBody NaytibaRequestDTO naytibaRequestDTO) {
        NaytibaDTO result = naytibaService.createNaytiba(naytibaRequestDTO);
        return ResponseEntity.ok(result);
    }
}
