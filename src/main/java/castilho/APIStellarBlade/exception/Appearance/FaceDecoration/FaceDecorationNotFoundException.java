package castilho.APIStellarBlade.exception.Appearance.FaceDecoration;

public class FaceDecorationNotFoundException extends RuntimeException {
    public FaceDecorationNotFoundException(long id){
        super("Face Decoration not found with id " + id);
    }

    public FaceDecorationNotFoundException(String name){
        super("Face Decoration not found with name " + name);
    }
}
