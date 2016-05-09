package relogio;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Parametros errados, verificar sejam numeros")
public class RelogioException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3688448454542590825L;

}
