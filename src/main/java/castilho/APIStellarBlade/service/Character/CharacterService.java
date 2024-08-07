package castilho.APIStellarBlade.service.Character;

import castilho.APIStellarBlade.domain.model.entity.Character.Character;
import castilho.APIStellarBlade.domain.model.repository.Character.CharacterRepository;
import castilho.APIStellarBlade.dto.Character.CharacterRequestDTO;
import castilho.APIStellarBlade.exception.Character.CharacterAlreadyExistException;
import castilho.APIStellarBlade.exception.Character.CharacterNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterRepository characterRepository;

    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    public Character getCharacterById(long id) {
        if (!characterRepository.existsById(id)) {
            throw new CharacterNotFoundException(id);
        }
        return characterRepository.findById(id).get();
    }

    public Character getCharacterByName(String name) {
        if (!characterRepository.existsByName(name)) {
            throw new CharacterNotFoundException(name);
        }
        return characterRepository.findByName(name);
    }

    public Character createCharacter(CharacterRequestDTO characterRequestDTO) {
        Character character = new Character();
        character.setName(characterRequestDTO.getName());
        character.setDescription(characterRequestDTO.getDescription());

        if (characterRepository.existsByName(character.getName())) {
            throw new CharacterAlreadyExistException(character.getName());
        }
        return characterRepository.save(character);

    }

    public void deleteCharacterById(long id) {
        if (!characterRepository.existsById(id)) {
            throw new CharacterNotFoundException(id);
        }
        characterRepository.deleteById(id);
    }

}
