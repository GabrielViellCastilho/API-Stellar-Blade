package castilho.APIStellarBlade.exception.Naytiba;

public class NaytibaTypeNotFoundException extends RuntimeException {
    public NaytibaTypeNotFoundException(long id) {
        super("Naytiba Type not found with id " + id);
    }

    public NaytibaTypeNotFoundException(String name) {
        super("Naytiba Type not found with name " + name);
    }
}
