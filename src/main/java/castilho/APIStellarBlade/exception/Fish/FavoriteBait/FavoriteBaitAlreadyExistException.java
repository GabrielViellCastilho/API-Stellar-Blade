package castilho.APIStellarBlade.exception.Fish.FavoriteBait;

public class FavoriteBaitAlreadyExistException extends RuntimeException {
    public FavoriteBaitAlreadyExistException(String name) {
        super("Favorite bait: "+name+" already exists");
    }
}
