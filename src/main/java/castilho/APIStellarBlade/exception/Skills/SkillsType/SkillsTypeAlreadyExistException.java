package castilho.APIStellarBlade.exception.Skills.SkillsType;

public class SkillsTypeAlreadyExistException extends RuntimeException {
    public SkillsTypeAlreadyExistException(String name) {
        super("Skills Type: "+name+" already exists");
    }
}
