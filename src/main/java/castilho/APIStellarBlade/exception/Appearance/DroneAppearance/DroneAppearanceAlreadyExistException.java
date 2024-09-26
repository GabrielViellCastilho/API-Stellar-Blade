package castilho.APIStellarBlade.exception.Appearance.DroneAppearance;

public class DroneAppearanceAlreadyExistException extends RuntimeException {
    public DroneAppearanceAlreadyExistException(String name) {
        super("Drone Appearance: "+name+" already exists");
    }
}
