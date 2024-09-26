package castilho.APIStellarBlade.exception.Appearance.DroneAppearance;

public class DroneAppearanceNotFoundException extends RuntimeException {
    public DroneAppearanceNotFoundException(long id){
        super("Drone Appearance not found with id " + id);
    }

    public DroneAppearanceNotFoundException(String name){
        super("Drone Appearance not found with name " + name);
    }
}
