package castilho.APIStellarBlade.exception.Naytiba;

public class NaytibaNotFoundException extends RuntimeException{
    public NaytibaNotFoundException(long id){
        super("Naytiba not found Id = "+ id);
    }

    public NaytibaNotFoundException(String name){
        super("Naytiba not found Name = " + name);
    }
}
