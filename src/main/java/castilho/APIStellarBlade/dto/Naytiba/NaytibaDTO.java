package castilho.APIStellarBlade.dto.Naytiba;

public class NaytibaDTO {
    private long id;
    private String name;
    private String type;
    private String descriptionEcologicalInformation;
    private String descriptionCombatInformation;

    public NaytibaDTO(long id, String name, String type, String descriptionEcologicalInformation, String descriptionCombatInformation) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.descriptionEcologicalInformation = descriptionEcologicalInformation;
        this.descriptionCombatInformation = descriptionCombatInformation;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
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
