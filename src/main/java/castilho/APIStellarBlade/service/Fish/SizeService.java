package castilho.APIStellarBlade.service.Fish;

import castilho.APIStellarBlade.domain.model.entity.Fish.Size;
import castilho.APIStellarBlade.domain.model.repository.Fish.SizeRepository;
import castilho.APIStellarBlade.dto.Fish.SizeRequestDTO;
import castilho.APIStellarBlade.exception.Fish.Size.SizeAlreadyExistException;
import castilho.APIStellarBlade.exception.Fish.Size.SizeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeService {

    @Autowired
    private SizeRepository sizeRepository;

    public List<Size> getAllSizes() {
        return sizeRepository.findAll();
    }

    public Size getSizeById(long id) {
        if (!sizeRepository.existsById(id)) {
            throw new SizeNotFoundException(id);
        }
        return sizeRepository.findById(id).get();
    }

    public  Size getSizeByName(String name) {
        if (!sizeRepository.existsBySize(name)) {
            throw new SizeNotFoundException(name);
        }
        return sizeRepository.findBySize(name);
    }

    public Size createSize(SizeRequestDTO sizeRequestDTO) {
        if (sizeRepository.existsBySize(sizeRequestDTO.getSize())){
            throw new SizeAlreadyExistException(sizeRequestDTO.getSize());
        }
        Size size = new Size();
        size.setSize(sizeRequestDTO.getSize());
        return sizeRepository.save(size);
    }

    public void deleteSizeById(long id) {
        if (!sizeRepository.existsById(id)) {
            throw new SizeNotFoundException(id);
        }
        sizeRepository.deleteById(id);
    }
}
