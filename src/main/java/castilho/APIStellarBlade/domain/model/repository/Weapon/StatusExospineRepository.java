package castilho.APIStellarBlade.domain.model.repository.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.StatusExospine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusExospineRepository extends JpaRepository<StatusExospine, Long> {
}
