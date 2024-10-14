package castilho.APIStellarBlade.domain.model.repository.Weapon;

import castilho.APIStellarBlade.domain.model.entity.Weapon.Exospine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExospineRepository extends JpaRepository<Exospine, Long> {
    boolean existsByName(String name);

    Exospine findByName(String name);
}
