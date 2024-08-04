package castilho.APIStellarBlade.domain.model.repository.Skills;

import castilho.APIStellarBlade.domain.model.entity.Skills.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills, Long> {
}
