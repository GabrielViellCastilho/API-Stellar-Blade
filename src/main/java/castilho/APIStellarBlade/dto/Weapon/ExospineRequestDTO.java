package castilho.APIStellarBlade.dto.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.StatusExospine;

import java.util.List;

public class ExospineRequestDTO {

    private String name;
    private int numberOfStars;
    private List<String> statusExospines;;
    private String description;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStars() {
        return numberOfStars;
    }

    public void setNumberOfStars(int numberOfStars) {
        this.numberOfStars = numberOfStars;
    }

    public List<String> getStatusExospines() {
        return statusExospines;
    }

    public void setStatusExospines(List<String> statusExospines) {
        this.statusExospines = statusExospines;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
