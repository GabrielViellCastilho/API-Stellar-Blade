package castilho.APIStellarBlade.domain.model.repository.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.FaceDecoration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaceDecorationRepository extends JpaRepository<FaceDecoration, Long> {

    boolean existsByName(String name);

    FaceDecoration findByName(String name);
}
