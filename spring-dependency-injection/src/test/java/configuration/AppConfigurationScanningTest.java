package configuration;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nuttipongt.repository.SimpleRepository;
import com.nuttipongt.service.SimpleServiceTest;

/*@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfigurationMethods.class)
public class AppConfigurationScanningTest {

	@Autowired
	private SimpleServiceTest simpleService;
	
	@Autowired
	private SimpleRepository simpleRepository;
	
	@Test
	public void dependencyInjectionShouldWork() {
		assertNotNull(simpleService);
		assertNotNull(simpleRepository);
	}
	
}
*/