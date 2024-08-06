package castilho.APIStellarBlade.domain.model.entity.Naytiba;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity(name = "tb_Naytiba")
public class Naytiba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "type_id")
    @JsonIgnoreProperties("naytibas")
    private NaytibaType type;

    @Column(length = 500)
    private String descriptionEcologicalInformation;

    @Column(length = 500)
    private String descriptionCombatInformation;

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

    public NaytibaType getType() {
        return type;
    }

    public void setType(NaytibaType type) {
        this.type = type;
    }

    public String getDescriptionEcologicalInformation() {
        return descriptionEcologicalInformation;
    }

    public void setDescriptionEcologicalInformation(String descriptionEcologicalInformation) {
        this.descriptionEcologicalInformation = descriptionEcologicalInformation;
    }

    public String getDescriptionCombatInformation() {
        return descriptionCombatInformation;
    }

    public void setDescriptionCombatInformation(String descriptionCombatInformation) {
        this.descriptionCombatInformation = descriptionCombatInformation;
    }
}
