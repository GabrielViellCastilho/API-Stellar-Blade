package castilho.APIStellarBlade.exception.Weapon.Exospine;

public class ExospineAlreadyExistException extends RuntimeException {
    public ExospineAlreadyExistException(String name) {
        super("Exospine: "+name+" already exists");
    }
}
