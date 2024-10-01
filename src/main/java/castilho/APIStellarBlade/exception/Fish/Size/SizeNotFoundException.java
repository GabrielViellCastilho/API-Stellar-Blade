package castilho.APIStellarBlade.exception.Fish.Size;

public class SizeNotFoundException extends RuntimeException {
    public SizeNotFoundException(long id){
        super("Size not found with id " + id);
    }

    public SizeNotFoundException(String name){
        super("Size not found with name " + name);
    }
}
