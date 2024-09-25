package castilho.APIStellarBlade.exception.Appearance.NanoSuit;

public class NanoSuitNotFoundException extends RuntimeException {
    public NanoSuitNotFoundException(long id){
        super("Nano Suit not found with id " + id);
    }

    public NanoSuitNotFoundException(String name){
        super("Nano Suit not found with name " + name);
    }
}
