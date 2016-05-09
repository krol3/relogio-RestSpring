package relogio;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Maps;

@RestController
public class RelogioController {

	private static final Logger LOG = LoggerFactory.getLogger(RelogioController.class);

	@Autowired
	private RelogioService relogioService;

	@RequestMapping(value = "/greet", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	String sayHello(@RequestParam("name") String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("The 'name' parameter must not be null or empty");
		}
		return "Hello! " + name;
	}

	@RequestMapping(value = "/rest/clock/{hora}/{minuto}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	Map<String, Object> getAngulo1(@PathVariable("hora") String hora, @PathVariable("minuto") String minuto)
			throws NumberFormatException, Exception {

		long resultado = 0l;

		LOG.info("hora: " + hora);
		LOG.info("minuto: " + minuto);
		resultado = relogioService.calcularAngulo(new Integer(hora), new Integer(minuto));

		Map<String, Object> m = Maps.newHashMap();
		m.put("success", true);
		m.put("angle", resultado);

		return m;
	}

	@RequestMapping(value = "/rest/clock/{hora}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=application/json")
	Map<String, Object> getAngulo2(@PathVariable("hora") String hora) throws NumberFormatException, Exception {

		long resultado = 0l;
		int minuto = 0;

		LOG.info("hora: " + hora);
		LOG.info("minuto: " + minuto);
		resultado = relogioService.calcularAngulo(new Integer(hora), new Integer(minuto));

		Map<String, Object> m = Maps.newHashMap();
		m.put("success", true);
		m.put("angle", resultado);

		return m;
	}
}
