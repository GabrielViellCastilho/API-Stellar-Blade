package castilho.APIStellarBlade.domain.model.entity.Skills;

import jakarta.persistence.*;

@Entity(name = "tb_Skills")
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50, unique = true)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private SkillsType skillsType;

    @Column(nullable = false, precision = 1)
    private int SP;

    @Column(nullable = false, length = 500, unique = true)
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

    public SkillsType getSkillsType() {
        return skillsType;
    }

    public void setSkillsType(SkillsType skillsType) {
        this.skillsType = skillsType;
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
