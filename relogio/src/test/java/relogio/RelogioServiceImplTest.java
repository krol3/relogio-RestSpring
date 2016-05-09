package relogio;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.ApplicationContext;

@SpringApplicationConfiguration(classes = Application.class)
public class RelogioServiceImplTest {

	private static ApplicationContext applicationContext;
	private static RelogioService relogioService;

	@BeforeClass
	public static void beforeClass() {

		// Load our application context
		applicationContext = SpringApplication.run(Application.class);

		// Load the UserServiceImpl service
		relogioService = (RelogioService) applicationContext.getBean("relogioServiceImpl");
	}

	@Test
	public void testCalcularAngulo() throws Exception {

		Assert.assertEquals("Angle between hour and minutes", 30, relogioService.calcularAngulo(1, 0));
		Assert.assertEquals("Angle between hour and minutes", 180, relogioService.calcularAngulo(6, 0));
		Assert.assertEquals("Angle between hour and minutes", 90, relogioService.calcularAngulo(3, 0));
		Assert.assertEquals("Angle between hour and minutes", 90, relogioService.calcularAngulo(9, 0));

		Assert.assertEquals("Angle between hour and minutes", 30, relogioService.calcularAngulo(13, 0));
		Assert.assertEquals("Angle between hour and minutes", 105, relogioService.calcularAngulo(2, 30));
		Assert.assertEquals("Angle between hour and minutes", 135, relogioService.calcularAngulo(10, 30));
		Assert.assertEquals("Angle between hour and minutes", 150, relogioService.calcularAngulo(7, 0));
		Assert.assertEquals("Angle between hour and minutes", 140, relogioService.calcularAngulo(11, 20));
		Assert.assertEquals("Angle between hour and minutes", 8, relogioService.calcularAngulo(8, 45));
		Assert.assertEquals("Angle between hour and minutes", 165, relogioService.calcularAngulo(12, 30));
	}

}
