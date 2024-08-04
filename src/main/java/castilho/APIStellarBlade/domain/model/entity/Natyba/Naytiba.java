package castilho.APIStellarBlade.domain.model.entity.Natyba;

import jakarta.persistence.*;

@Entity(name = "tb_Naytiba")
public class Naytiba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private NaytibaType naytibaType;

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

    public NaytibaType getNaytibaType() {
        return naytibaType;
    }

    public void setNaytibaType(NaytibaType naytibaType) {
        this.naytibaType = naytibaType;
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
