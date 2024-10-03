package castilho.APIStellarBlade.service.Fish;


import castilho.APIStellarBlade.domain.model.entity.Fish.FavoriteBait;
import castilho.APIStellarBlade.domain.model.repository.Fish.FavoriteBaitRepository;
import castilho.APIStellarBlade.dto.Fish.FavoriteBaitRequestDTO;
import castilho.APIStellarBlade.exception.Fish.FavoriteBait.FavoriteBaitAlreadyExistException;
import castilho.APIStellarBlade.exception.Fish.FavoriteBait.FavoriteBaitNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteBaitService {

    @Autowired
    private FavoriteBaitRepository favoriteBaitRepository;

    public List<FavoriteBait> getAllFavoriteBaits() { return favoriteBaitRepository.findAll();}

    public  FavoriteBait getFavoriteBaitById(long id) {
        if (!favoriteBaitRepository.existsById(id)) {
            throw new FavoriteBaitNotFoundException(id);
        }
        return favoriteBaitRepository.findById(id).get();

    }

    public  FavoriteBait getFavoriteBaitByName(String name) {
        if (!favoriteBaitRepository.existsByName(name)) {
            throw new FavoriteBaitNotFoundException(name);
        }
        return favoriteBaitRepository.findByName(name);
    }

    public  FavoriteBait createFavoriteBait(FavoriteBaitRequestDTO favoriteBaitRequestDTO) {
        if (favoriteBaitRepository.existsByName(favoriteBaitRequestDTO.getName())) {
            throw new FavoriteBaitAlreadyExistException(favoriteBaitRequestDTO.getName());
        }
        FavoriteBait favoriteBait = new FavoriteBait();
        favoriteBait.setName(favoriteBaitRequestDTO.getName());
        return favoriteBaitRepository.save(favoriteBait);
    }

    public  void deleteFavoriteBait(long id) {
        if (!favoriteBaitRepository.existsById(id)) {
            throw new FavoriteBaitNotFoundException(id);
        }
        favoriteBaitRepository.deleteById(id);
    }
}
