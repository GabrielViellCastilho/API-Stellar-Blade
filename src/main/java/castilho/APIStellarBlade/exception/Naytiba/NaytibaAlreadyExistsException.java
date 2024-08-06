package castilho.APIStellarBlade.exception.Naytiba;

public class NaytibaAlreadyExistsException extends RuntimeException{
    public NaytibaAlreadyExistsException(String name){
        super("Naytiba: "+name+" already exists");
    }
}
