package castilho.APIStellarBlade.dto.Weapon;

import jakarta.persistence.Column;

public class GearRequestDTO {
    private String name;
    private int numberOfStars;
    private String status;
    private String description;

    public GearRequestDTO(String name, int numberOfStars, String status, String description) {
        this.name = name;
        this.numberOfStars = numberOfStars;
        this.status = status;
        this.description = description;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
