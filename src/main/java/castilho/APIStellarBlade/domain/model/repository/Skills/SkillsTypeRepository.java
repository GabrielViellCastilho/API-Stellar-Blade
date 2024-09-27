package castilho.APIStellarBlade.domain.model.repository.Skills;

import castilho.APIStellarBlade.domain.model.entity.Skills.SkillsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsTypeRepository extends JpaRepository<SkillsType, Long> {
    boolean existsByName(String name);

    SkillsType findByName(String name);
}
