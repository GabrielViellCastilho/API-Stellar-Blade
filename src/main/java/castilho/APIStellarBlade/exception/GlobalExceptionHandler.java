package castilho.APIStellarBlade.exception;


import castilho.APIStellarBlade.exception.Appearance.DroneAppearance.DroneAppearanceAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.DroneAppearance.DroneAppearanceNotFoundException;
import castilho.APIStellarBlade.exception.Appearance.Earrings.EarringsAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.Earrings.EarringsNotFoundException;
import castilho.APIStellarBlade.exception.Appearance.FaceDecoration.FaceDecorationAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.FaceDecoration.FaceDecorationNotFoundException;
import castilho.APIStellarBlade.exception.Appearance.Hairs.HairAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.Hairs.HairNotFoundException;
import castilho.APIStellarBlade.exception.Appearance.NanoSuit.NanoSuitAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.NanoSuit.NanoSuitNotFoundException;
import castilho.APIStellarBlade.exception.Character.CharacterAlreadyExistException;
import castilho.APIStellarBlade.exception.Character.CharacterNotFoundException;
import castilho.APIStellarBlade.exception.Fish.FavoriteBait.FavoriteBaitAlreadyExistException;
import castilho.APIStellarBlade.exception.Fish.FavoriteBait.FavoriteBaitNotFoundException;
import castilho.APIStellarBlade.exception.Fish.Fish.FishAlreadyExistException;
import castilho.APIStellarBlade.exception.Fish.Fish.FishNotFoundException;
import castilho.APIStellarBlade.exception.Fish.Size.SizeAlreadyExistException;
import castilho.APIStellarBlade.exception.Fish.Size.SizeNotFoundException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaAlreadyExistsException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaNotFoundException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaTypeAlreadyExistsException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaTypeNotFoundException;
import castilho.APIStellarBlade.exception.Skills.Skills.SkillsAlreadyExistException;
import castilho.APIStellarBlade.exception.Skills.Skills.SkillsNotFoundException;
import castilho.APIStellarBlade.exception.Skills.SkillsType.SkillsTypeAlreadyExistException;
import castilho.APIStellarBlade.exception.Skills.SkillsType.SkillsTypeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NaytibaAlreadyExistsException.class)
    public ResponseEntity<String> handleNaytibaAlreadyExistsException(NaytibaAlreadyExistsException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NaytibaNotFoundException.class)
    public ResponseEntity<String> handleNaytibaNotFoundException(NaytibaNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NaytibaTypeNotFoundException.class)
    public ResponseEntity<String> handleNaytibaTypeNotFoundException(NaytibaTypeNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NaytibaTypeAlreadyExistsException.class)
    public ResponseEntity<String> handleNaytibaTypeAlreadyExistsException(NaytibaTypeAlreadyExistsException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(CharacterNotFoundException.class)
    public ResponseEntity<String> handleCharacterNotFoundException(CharacterNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CharacterAlreadyExistException.class)
    public ResponseEntity<String> handleCharacterAlreadyExistException(CharacterAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(NanoSuitNotFoundException.class)
    public ResponseEntity<String> handleNanoSuitNotFoundException(NanoSuitNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(NanoSuitAlreadyExistException.class)
    public ResponseEntity<String> handleNanoSuitAlreadyExistException(NanoSuitAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(HairNotFoundException.class)
    public  ResponseEntity<String> handleHairNotFoundException(HairNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(HairAlreadyExistException.class)
    public ResponseEntity<String> handleHairAlreadyExistException(HairAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(DroneAppearanceNotFoundException.class)
    public  ResponseEntity<String> handleDroneAppearanceNotFoundException(DroneAppearanceNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(DroneAppearanceAlreadyExistException.class)
    public ResponseEntity<String> handleDroneAppearanceAlreadyExistException(DroneAppearanceAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(EarringsNotFoundException.class)
    public  ResponseEntity<String> handleEachDroneAppearanceNotFoundException(EarringsNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EarringsAlreadyExistException.class)
    public  ResponseEntity<String> handleEachDroneAppearanceAlreadyExistException(EarringsAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(FaceDecorationNotFoundException.class)
    public  ResponseEntity<String> handleEachFaceDecorationNotFoundException(FaceDecorationNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FaceDecorationAlreadyExistException.class)
    public  ResponseEntity<String> handleEachFaceDecorationAlreadyExistException(FaceDecorationAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(SkillsTypeNotFoundException.class)
    public ResponseEntity<String> handleSkillsTypeNotFoundException(SkillsTypeNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SkillsTypeAlreadyExistException.class)
    public ResponseEntity<String> handleSkillsTypeAlreadyExistException(SkillsTypeAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(SkillsNotFoundException.class)
    public ResponseEntity<String> handleSkillsNotFoundException(SkillsNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SkillsAlreadyExistException.class)
    public ResponseEntity<String> handleSkillsAlreadyExistException(SkillsAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(SizeNotFoundException.class)
    public ResponseEntity<String> handleSizeNotFoundException(SizeNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(SizeAlreadyExistException.class)
    public ResponseEntity<String> handleSizeAlreadyExistException(SizeAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(FavoriteBaitNotFoundException.class)
    public ResponseEntity<String> handleFavoriteBaitNotFoundException(FavoriteBaitNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FavoriteBaitAlreadyExistException.class)
    public ResponseEntity<String> handleFavoriteBaitAlreadyExistException(FavoriteBaitAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(FishNotFoundException.class)
    public ResponseEntity<String> handleFishNotFoundException(FishNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FishAlreadyExistException.class)
    public ResponseEntity<String> handleFishAlreadyExistException(FishAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.CONFLICT);
    }
}
