package castilho.APIStellarBlade.exception.Naytiba;

public class NaytibaTypeNotFoundException extends RuntimeException {
    public NaytibaTypeNotFoundException(long id) {
        super("Naytiba Type not found  Id = "+id);
    }
}
