package castilho.APIStellarBlade.exception.Weapon.StatusExospine;

public class StatusExospineAlreadyExistException extends RuntimeException {
    public StatusExospineAlreadyExistException(String name) {
        super("Status exospine: "+name+" already exists");
    }
}
