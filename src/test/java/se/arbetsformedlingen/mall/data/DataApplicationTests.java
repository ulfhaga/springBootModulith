package se.arbetsformedlingen.mall.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class DataApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void verifiesModulithStructure() {
		ApplicationModules.of(DataApplication.class).verify();
	}

}
