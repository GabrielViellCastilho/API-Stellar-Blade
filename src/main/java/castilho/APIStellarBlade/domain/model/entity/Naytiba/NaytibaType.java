package castilho.APIStellarBlade.domain.model.entity.Natyba;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_NaytibaType")
public class NaytibaType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String type;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("type")
    private List<Naytiba> naytibas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Naytiba> getNaytibas() {
        return naytibas;
    }

    public void setNaytibas(List<Naytiba> naytibas) {
        this.naytibas = naytibas;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
