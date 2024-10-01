package castilho.APIStellarBlade.controller.Character;

import castilho.APIStellarBlade.domain.model.entity.Character.Character;
import castilho.APIStellarBlade.dto.Character.CharacterRequestDTO;
import castilho.APIStellarBlade.service.Character.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Character")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping
    public ResponseEntity<List<Character>> getAllCharacter() {
        return ResponseEntity.ok(characterService.getAllCharacters());
    }

    @GetMapping("/search/name/{name}")
    public ResponseEntity<Character> getCharacterByName(@PathVariable String name) {
        return ResponseEntity.ok(characterService.getCharacterByName(name));
    }

    @GetMapping("/search/id/{id}")
    public ResponseEntity<Character> getCharacterById(@PathVariable long id) {
        return ResponseEntity.ok(characterService.getCharacterById(id));
    }

    @PostMapping("/create")
    public ResponseEntity<Character> createCharacter(@RequestBody CharacterRequestDTO characterRequestDTO) {
        Character character = characterService.createCharacter(characterRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(character);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteCharacter(@PathVariable long id) {
        characterService.deleteCharacterById(id);
        return ResponseEntity.noContent().build();
    }
}

