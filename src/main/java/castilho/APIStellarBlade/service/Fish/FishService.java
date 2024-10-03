package castilho.APIStellarBlade.service.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.Fish;
import castilho.APIStellarBlade.domain.model.repository.Fish.FavoriteBaitRepository;
import castilho.APIStellarBlade.domain.model.repository.Fish.FishRepository;
import castilho.APIStellarBlade.domain.model.repository.Fish.SizeRepository;
import castilho.APIStellarBlade.dto.Fish.FishRequestDTO;
import castilho.APIStellarBlade.exception.Fish.FavoriteBait.FavoriteBaitNotFoundException;
import castilho.APIStellarBlade.exception.Fish.Fish.FishAlreadyExistException;
import castilho.APIStellarBlade.exception.Fish.Fish.FishNotFoundException;
import castilho.APIStellarBlade.exception.Fish.Size.SizeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FishService {
    @Autowired
    private FishRepository fishRepository;

    @Autowired
    private SizeRepository sizeRepository;

    @Autowired
    private FavoriteBaitRepository favoriteBaitRepository;

    public List<Fish> getAllFish() {
        return fishRepository.findAll();
    }

    public Fish getFishById(long id) {
        if (!fishRepository.existsById(id)) {
            throw new FishNotFoundException(id);
        }
        return fishRepository.findById(id).get();
    }

    public Fish getFishByName(String name) {
        if (!fishRepository.existsByName(name)) {
            throw new FishNotFoundException(name);
        }
        return fishRepository.findByName(name);
    }

    public Fish createFish(FishRequestDTO fishRequestDTO) {
        if (fishRepository.existsByName(fishRequestDTO.getName())) {
            throw new FishAlreadyExistException(fishRequestDTO.getName());
        }
        else if(!favoriteBaitRepository.existsByName(fishRequestDTO.getFavoriteBait())){
            throw  new FavoriteBaitNotFoundException(fishRequestDTO.getFavoriteBait());
        }
        else if (!sizeRepository.existsBySize(fishRequestDTO.getSize())) {
            throw  new SizeNotFoundException(fishRequestDTO.getSize());
        }

        Fish fish = new Fish();
        fish.setName(fishRequestDTO.getName());
        fish.setFavoriteBait(favoriteBaitRepository.findByName(fishRequestDTO.getFavoriteBait()));
        fish.setDescription(fishRequestDTO.getDescription());
        fish.setSize(sizeRepository.findBySize(fishRequestDTO.getSize()));
        fish.setNumberOfStars(fishRequestDTO.getNumberOfStars());

        return fishRepository.save(fish);
    }

    public void deleteFish(long id) {
        if (!fishRepository.existsById(id)) {
            throw new FishNotFoundException(id);
        }
        fishRepository.deleteById(id);
    }


}
