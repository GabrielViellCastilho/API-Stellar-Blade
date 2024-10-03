package castilho.APIStellarBlade.exception.Fish.Fish;

public class FishAlreadyExistException extends RuntimeException {
    public FishAlreadyExistException(String name) {
        super("Fish: "+name+" already exists");
    }
}
