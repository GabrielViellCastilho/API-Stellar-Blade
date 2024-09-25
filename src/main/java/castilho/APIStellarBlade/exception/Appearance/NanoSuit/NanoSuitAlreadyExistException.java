package castilho.APIStellarBlade.exception.Appearance.NanoSuit;

public class NanoSuitAlreadyExistException extends RuntimeException {
    public NanoSuitAlreadyExistException(String name) {
        super("Nano Suit: "+name+" already exists");
    }
}
