package isabela.dranka.uolhostbackend.exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    public ResponseEntity treatNoSuchElementException(NoSuchElementException exception){
        ExceptionDto dto = new ExceptionDto("Esta lista não possui mais usuários disponíveis", "400");
        return ResponseEntity.badRequest().body(dto);
    }
}
