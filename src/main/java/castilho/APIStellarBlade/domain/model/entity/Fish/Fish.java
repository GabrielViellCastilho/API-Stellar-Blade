package castilho.APIStellarBlade.domain.model.entity.Fish;

import jakarta.persistence.*;

@Entity(name = "tb_Fish")
public class Fish {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private FavoriteBait favoriteBait;

    @Column(length = 500, nullable = false, unique = true)
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    private Size size;

    @Column(nullable = false, precision = 1)
    private int numberOfStars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FavoriteBait getFavoriteBait() {
        return favoriteBait;
    }

    public void setFavoriteBait(FavoriteBait favoriteBait) {
        this.favoriteBait = favoriteBait;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }
}
