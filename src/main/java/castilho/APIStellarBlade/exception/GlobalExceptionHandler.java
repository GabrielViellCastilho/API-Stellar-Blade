package castilho.APIStellarBlade.exception;


import castilho.APIStellarBlade.exception.Appearance.Hairs.HairAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.Hairs.HairNotFoundException;
import castilho.APIStellarBlade.exception.Appearance.NanoSuit.NanoSuitAlreadyExistException;
import castilho.APIStellarBlade.exception.Appearance.NanoSuit.NanoSuitNotFoundException;
import castilho.APIStellarBlade.exception.Character.CharacterAlreadyExistException;
import castilho.APIStellarBlade.exception.Character.CharacterNotFoundException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaAlreadyExistsException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaNotFoundException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaTypeAlreadyExistsException;
import castilho.APIStellarBlade.exception.Naytiba.NaytibaTypeNotFoundException;
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
}
