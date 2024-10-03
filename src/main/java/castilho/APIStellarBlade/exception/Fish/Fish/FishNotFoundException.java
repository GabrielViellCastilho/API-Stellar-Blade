package castilho.APIStellarBlade.exception.Fish.Fish;

public class FishNotFoundException extends RuntimeException {
    public FishNotFoundException(long id){
        super("Fish not found with id " + id);
    }

    public FishNotFoundException(String name){
        super("Fish not found with name " + name);
    }
}
