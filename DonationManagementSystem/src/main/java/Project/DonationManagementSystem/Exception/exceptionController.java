package Project.DonationManagementSystem.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class exceptionController {

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<Object> idNotFound(IdNotFoundException ex){
		return new ResponseEntity<Object>(ex.getMessage(),HttpStatus.OK);
	}
}
