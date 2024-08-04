package castilho.APIStellarBlade.domain.model.entity.Appearance;

import jakarta.persistence.*;

@MappedSuperclass
public abstract class BaseAppearance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 50, unique = true)
    private String name;

    @Column(nullable = false, unique = true, precision = 1)
    private int numberOfStars;

    @Column(nullable = false,length = 500, unique = true)
    private String description;

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


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
