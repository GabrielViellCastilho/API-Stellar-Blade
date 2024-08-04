package castilho.APIStellarBlade.domain.model.repository.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {
}
