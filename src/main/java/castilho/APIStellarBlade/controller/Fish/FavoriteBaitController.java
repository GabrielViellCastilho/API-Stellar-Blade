package castilho.APIStellarBlade.controller.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.FavoriteBait;
import castilho.APIStellarBlade.dto.Fish.FavoriteBaitRequestDTO;
import castilho.APIStellarBlade.service.Fish.FavoriteBaitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Fish/FavoriteBait")
public class FavoriteBaitController {

    @Autowired
    private FavoriteBaitService favoriteBaitService;

    @GetMapping
    public ResponseEntity<List<FavoriteBait>> getAll() {
        return ResponseEntity.ok(favoriteBaitService.getAllFavoriteBaits());
    }
    @GetMapping("/search/id/{id}")
    public ResponseEntity<FavoriteBait> getById(@PathVariable long id) {
        return ResponseEntity.ok(favoriteBaitService.getFavoriteBaitById(id));
    }

    @GetMapping("search/name/{name}")
    public ResponseEntity<FavoriteBait> getByName(@PathVariable String name) {
        return ResponseEntity.ok(favoriteBaitService.getFavoriteBaitByName(name));
    }

    @PostMapping("create")
    public ResponseEntity<FavoriteBait> create(@RequestBody FavoriteBaitRequestDTO favoriteBaitRequestDTO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(favoriteBaitService.createFavoriteBait(favoriteBaitRequestDTO));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<FavoriteBait> delete(@PathVariable long id) {
        favoriteBaitService.deleteFavoriteBait(id);
        return ResponseEntity.noContent().build();
    }
}

