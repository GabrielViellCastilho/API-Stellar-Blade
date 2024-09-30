package castilho.APIStellarBlade.exception.Skills.Skills;

public class SkillsAlreadyExistException extends RuntimeException {
    public SkillsAlreadyExistException(String name) {
        super("Skills: "+name+" already exists");
    }
}
