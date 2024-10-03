package castilho.APIStellarBlade.exception.Weapon.Gear;

public class GearAlreadyExistException extends RuntimeException {
    public GearAlreadyExistException(String name) {
        super("Gear: "+name+" already exists");
    }
}
