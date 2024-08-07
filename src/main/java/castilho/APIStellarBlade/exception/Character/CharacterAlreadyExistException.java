package castilho.APIStellarBlade.exception.Character;

public class CharacterAlreadyExistException extends RuntimeException {
    public CharacterAlreadyExistException(String name) {
        super("Character: "+name+" already exists");

    }
}
