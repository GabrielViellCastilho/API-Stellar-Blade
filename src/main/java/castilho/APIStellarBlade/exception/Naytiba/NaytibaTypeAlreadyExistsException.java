package castilho.APIStellarBlade.exception.Naytiba;

public class NaytibaTypeAlreadyExistsException extends RuntimeException {
    public NaytibaTypeAlreadyExistsException(String type) {
        super("Naytiba Type: "+type+" already exists");
    }
}
