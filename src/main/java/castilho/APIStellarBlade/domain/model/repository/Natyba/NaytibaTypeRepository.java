package castilho.APIStellarBlade.domain.model.repository.Natyba;

import castilho.APIStellarBlade.domain.model.entity.Natyba.NaytibaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaytibaTypeRepository extends JpaRepository<NaytibaType, Long> {
}
