package castilho.APIStellarBlade.domain.model.repository.Natyba;

import castilho.APIStellarBlade.domain.model.entity.Naytiba.Naytiba;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO;
import castilho.APIStellarBlade.dto.Naytiba.NaytibaIdAndNameDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NaytibaRepository extends JpaRepository<Naytiba, Long> {
    boolean existsByName(String name);

    @Query("SELECT new castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO(n.id, n.name, t.type, n.descriptionEcologicalInformation, n.descriptionCombatInformation) " +
            "FROM tb_Naytiba n JOIN n.type t WHERE n.name = :name")
    Optional<NaytibaDTO> findByName(@Param("name")String name);

    @Query("SELECT new castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO(n.id, n.name, t.type, n.descriptionEcologicalInformation, n.descriptionCombatInformation) " +
            "FROM tb_Naytiba n JOIN n.type t WHERE n.id = :id")
    Optional<NaytibaDTO> findById(@Param("id")long id);

    @Query("SELECT new castilho.APIStellarBlade.dto.Naytiba.NaytibaIdAndNameDTO(n.name , n.id) FROM tb_Naytiba n")
    List<NaytibaIdAndNameDTO> findAllNaytibaNamesAndIds();


    @Query("SELECT new castilho.APIStellarBlade.dto.Naytiba.NaytibaDTO(n.id, n.name, t.type, n.descriptionEcologicalInformation, n.descriptionCombatInformation) " +
            "FROM tb_Naytiba n JOIN n.type t")
    List<NaytibaDTO> findAllNaytibas();
}
