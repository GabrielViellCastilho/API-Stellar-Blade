package castilho.APIStellarBlade.dto.Skills;

public class SkillsRequestDTO {
    private  String name;
    private  long idSkillsType;
    private  int SP;
    private  String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getIdSkillsType() {
        return idSkillsType;
    }

    public void setIdSkillsType(long idSkillsType) {
        this.idSkillsType = idSkillsType;
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
