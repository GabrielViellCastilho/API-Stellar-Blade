package castilho.APIStellarBlade.controller.Naytiba;


import castilho.APIStellarBlade.domain.model.entity.Natyba.NaytibaType;
import castilho.APIStellarBlade.service.Naytiba.NaytibaTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
