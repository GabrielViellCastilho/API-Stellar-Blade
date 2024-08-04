package castilho.APIStellarBlade.domain.model.entity.Weapon;

import jakarta.persistence.*;

@Entity(name = "tb_StatusExospine")
public class StatusExospine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
