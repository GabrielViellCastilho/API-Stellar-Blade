package castilho.APIStellarBlade.exception.Fish.FavoriteBait;

public class FavoriteBaitNotFoundException extends RuntimeException {
    public FavoriteBaitNotFoundException(long id){
        super("Favorite bait not found with id " + id);
    }

    public FavoriteBaitNotFoundException(String name){
        super("Favorite bait not found with name " + name);
    }
}
