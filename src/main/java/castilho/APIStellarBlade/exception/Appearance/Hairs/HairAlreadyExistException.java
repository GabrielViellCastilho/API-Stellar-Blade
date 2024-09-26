package castilho.APIStellarBlade.exception.Appearance.Hairs;

public class HairAlreadyExistException extends RuntimeException{
    public HairAlreadyExistException(String name){
        super("Hair : "+name+ " already exists");
    }
}
