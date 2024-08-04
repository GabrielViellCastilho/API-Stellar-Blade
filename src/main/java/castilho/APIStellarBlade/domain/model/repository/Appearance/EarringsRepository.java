package castilho.APIStellarBlade.domain.model.repository.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.Earrings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarringsRepository extends JpaRepository<Earrings, Long> {
}
