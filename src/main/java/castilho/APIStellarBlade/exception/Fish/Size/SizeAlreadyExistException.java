package castilho.APIStellarBlade.exception.Fish.Size;

public class SizeAlreadyExistException extends RuntimeException {
    public SizeAlreadyExistException(String name) {
        super("Size: "+name+" already exists");
    }
}
