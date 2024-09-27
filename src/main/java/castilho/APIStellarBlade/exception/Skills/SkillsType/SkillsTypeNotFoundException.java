package castilho.APIStellarBlade.exception.Skills.SkillsType;

public class SkillsTypeNotFoundException extends  RuntimeException{
    public SkillsTypeNotFoundException(long id){
        super("Skills Type not found with id " + id);
    }

    public SkillsTypeNotFoundException(String name){
        super("Skills Type not found with name " + name);
    }
}
