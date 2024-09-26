package castilho.APIStellarBlade.exception.Appearance.Earrings;

public class EarringsNotFoundException extends RuntimeException {
    public EarringsNotFoundException(long id){
        super("Earrings not found with id " + id);
    }

    public EarringsNotFoundException(String name){
        super("Earrings not found with name " + name);
    }
}
