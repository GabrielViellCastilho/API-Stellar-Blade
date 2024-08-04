package castilho.APIStellarBlade.domain.model.entity.Natyba;

import jakarta.persistence.*;

@Entity(name = "tb_NaytibaType")
public class NaytibaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
