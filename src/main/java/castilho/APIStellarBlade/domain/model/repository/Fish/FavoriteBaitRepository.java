package castilho.APIStellarBlade.domain.model.repository.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.FavoriteBait;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteBaitRepository extends JpaRepository<FavoriteBait, Long> {
    boolean existsByName(String name);

    FavoriteBait findByName(String name);


}
