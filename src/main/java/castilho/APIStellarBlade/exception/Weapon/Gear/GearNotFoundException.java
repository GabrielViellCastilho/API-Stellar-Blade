package castilho.APIStellarBlade.exception.Weapon.Gear;

public class GearNotFoundException extends RuntimeException {
    public GearNotFoundException(long id){
        super("Gear not found with id " + id);
    }

    public GearNotFoundException(String name){
        super("Gear not found with name " + name);
    }
}
