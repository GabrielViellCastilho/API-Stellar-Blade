package castilho.APIStellarBlade.exception.Weapon.StatusExospine;

public class StatusExospineNotFoundException extends RuntimeException {
    public StatusExospineNotFoundException(long id){
        super("Status exospine not found with id " + id);
    }

    public StatusExospineNotFoundException(String name){
        super("Status exospine not found with name " + name);
    }
}
