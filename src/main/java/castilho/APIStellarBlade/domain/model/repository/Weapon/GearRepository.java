package castilho.APIStellarBlade.domain.model.repository.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.Gear;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GearRepository extends JpaRepository<Gear, Long> {
}
