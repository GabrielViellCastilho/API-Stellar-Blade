package castilho.APIStellarBlade.domain.model.repository.Natyba;

import castilho.APIStellarBlade.domain.model.entity.Natyba.Naytiba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaytibaRepository extends JpaRepository<Naytiba, Long> {
}
