package castilho.APIStellarBlade.domain.model.repository.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.Fish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FishRepository extends JpaRepository<Fish, Long> {
    boolean existsByName(String name);

    Fish findByName(String name);

}
