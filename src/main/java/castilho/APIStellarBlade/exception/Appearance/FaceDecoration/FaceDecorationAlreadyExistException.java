package castilho.APIStellarBlade.exception.Appearance.FaceDecoration;

public class FaceDecorationAlreadyExistException extends RuntimeException {
    public FaceDecorationAlreadyExistException(String name) {
        super("Face Decoration: "+name+" already exists");
    }
}
