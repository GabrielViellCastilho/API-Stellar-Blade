package castilho.APIStellarBlade.exception.Appearance.Hairs;

public class HairNotFoundException extends RuntimeException {
    public HairNotFoundException(long id){
        super("Hair not found with id " + id);
    }


    public HairNotFoundException(String name){
        super("Hair not found with name " + name);
    }
}
