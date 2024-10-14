package castilho.APIStellarBlade.exception.Weapon.Exospine;

public class ExospineNotFoundException extends RuntimeException {
    public ExospineNotFoundException(long id){
        super("Exospine not found with id " + id);
    }

    public ExospineNotFoundException(String name){
        super("Exospine not found with name " + name);
    }
}
