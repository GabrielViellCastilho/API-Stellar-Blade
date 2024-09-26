package castilho.APIStellarBlade.service.Appearance;

import castilho.APIStellarBlade.domain.model.entity.Appearance.FaceDecoration;
import castilho.APIStellarBlade.domain.model.repository.Appearance.FaceDecorationRepository;
import castilho.APIStellarBlade.dto.Appearance.FaceDecorationDTO;
import castilho.APIStellarBlade.exception.Appearance.FaceDecoration.FaceDecorationAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.FaceDecoration.FaceDecorationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaceDecorationService {
    @Autowired
    private FaceDecorationRepository faceDecorationRepository;

    public List<FaceDecoration> getAllFaceDecorations(){
        return faceDecorationRepository.findAll();
    }

    public FaceDecoration getById(long id) {
        if (!faceDecorationRepository.existsById(id)) {
            throw new FaceDecorationNotFoundException(id);
        }
        return faceDecorationRepository.findById(id).get();
    }

    public FaceDecoration getByName(String name) {
        if (!faceDecorationRepository.existsByName(name)) {
            throw new FaceDecorationNotFoundException(name);
        }
        return faceDecorationRepository.findByName(name);
    }

    public FaceDecoration createFaceDecoration(FaceDecorationDTO faceDecorationDTO) {
        if (faceDecorationRepository.existsByName(faceDecorationDTO.getName())) {
            throw new FaceDecorationAlreadyExistException(faceDecorationDTO.getName());
        }
        FaceDecoration faceDecoration = new FaceDecoration();
        faceDecoration.setName(faceDecorationDTO.getName());
        faceDecoration.setDescription(faceDecorationDTO.getDescription());
        faceDecoration.setNumberOfStars(faceDecorationDTO.getNumberOfStars());
        faceDecorationRepository.save(faceDecoration);
        return faceDecoration;
    }

    public void deleteFaceDecorationById(long id) {
        if (!faceDecorationRepository.existsById(id)) {
            throw new FaceDecorationNotFoundException(id);
        }
        faceDecorationRepository.deleteById(id);
    }

}
