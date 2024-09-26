package castilho.APIStellarBlade.exception.Appearance.Earrings;

public class EarringsAlreadyExistException extends RuntimeException {
    public EarringsAlreadyExistException(String name) {
        super("Earrings: "+name+" already exists");
    }
}
