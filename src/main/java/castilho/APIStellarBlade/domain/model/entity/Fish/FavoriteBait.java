package castilho.APIStellarBlade.domain.model.entity.Fish;

import jakarta.persistence.*;

@Entity(name = "tb_FavoriteBait")
public class FavoriteBait {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length = 50)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
