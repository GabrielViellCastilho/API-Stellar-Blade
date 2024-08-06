package castilho.APIStellarBlade.domain.model.repository.Natyba;

import castilho.APIStellarBlade.domain.model.entity.Naytiba.NaytibaType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaytibaTypeRepository extends JpaRepository<NaytibaType, Long> {
    boolean existsByType(String type);
    NaytibaType findByType(String type);
}
