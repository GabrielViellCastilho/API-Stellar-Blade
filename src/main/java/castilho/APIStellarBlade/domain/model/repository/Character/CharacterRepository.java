package castilho.APIStellarBlade.domain.model.repository.Character;

import castilho.APIStellarBlade.domain.model.entity.Character.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {
    boolean existsByName(String name);
}
