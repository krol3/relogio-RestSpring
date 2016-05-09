package relogio;

import org.springframework.stereotype.Service;

@Service
public class RelogioServiceImpl implements RelogioService {

	@Override
	public long calcularAngulo(int h, int m) throws Exception {

		if (h > 12)
			h = h - 12;
		int movementH = m * 30 / 60;
		int angleHour = (h * 30) + movementH;
		int angleMinutos = m * 6;
		int diferenca = Math.abs(angleHour - angleMinutos);
		return Math.min(360 - diferenca, diferenca);
	}

}
