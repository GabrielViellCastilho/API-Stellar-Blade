package castilho.APIStellarBlade.domain.model.entity.Weapon;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_Exospine")
public class Exospine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 50)
    private String nome;

    @Column(nullable = false, unique = true, precision = 1)
    private int numberOfStars;

    @OneToMany(fetch = FetchType.EAGER)
    private List<StatusExospine> statusExospines;;

    @Column(length = 500, nullable = false, unique = true)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<StatusExospine> getStatusExospines() {
        return statusExospines;
    }

    public void setStatusExospines(List<StatusExospine> statusExospines) {
        this.statusExospines = statusExospines;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
