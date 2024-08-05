package castilho.APIStellarBlade.dto.Naytiba;

import castilho.APIStellarBlade.domain.model.entity.Natyba.NaytibaType;

public class NaytibaRequestDTO {
    private String name;
    private long idType;
    private String descriptionEcologicalInformation;
    private String descriptionCombatInformation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdType() {
        return idType;
    }

    public void setIdType(long idType) {
        this.idType = idType;
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
