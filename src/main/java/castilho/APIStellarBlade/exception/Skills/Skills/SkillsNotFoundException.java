package castilho.APIStellarBlade.exception.Skills.Skills;

public class SkillsNotFoundException extends  RuntimeException{
    public SkillsNotFoundException(long id){
        super("Skill  not found with id " + id);
    }

    public SkillsNotFoundException(String name){
        super("Skill  not found with name " + name);
    }
}
