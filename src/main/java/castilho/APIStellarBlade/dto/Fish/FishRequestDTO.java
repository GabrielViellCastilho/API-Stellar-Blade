package castilho.APIStellarBlade.dto.Fish;

public class FishRequestDTO {
    private String name;
    private String favoriteBait;
    private String description;
    private String size;
    private int numberOfStars;

    public FishRequestDTO(String name, String favoriteBait, String description, String size, int numberOfStars) {
        this.name = name;
        this.favoriteBait = favoriteBait;
        this.description = description;
        this.size = size;
        this.numberOfStars = numberOfStars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFavoriteBait() {
        return favoriteBait;
    }

    public void setFavoriteBait(String favoriteBait) {
        this.favoriteBait = favoriteBait;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }
}
