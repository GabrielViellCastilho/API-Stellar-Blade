package castilho.APIStellarBlade.exception.Character;

public class CharacterNotFoundException extends RuntimeException{
    public CharacterNotFoundException(long id){
        super("Character not found with id " + id);
    }

    public CharacterNotFoundException(String name){
        super("Character not found with name " + name);
    }
}
