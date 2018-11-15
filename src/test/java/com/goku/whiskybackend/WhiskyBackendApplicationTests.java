package com.goku.whiskybackend;

import com.goku.whiskybackend.web.WhiskyController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WhiskyBackendApplicationTests {

	@Autowired
	WhiskyController whiskyController;

	@Test
	public void contextLoads() {
		Assert.assertNotNull(whiskyController);
	}
	//mvn -Dtest=WhiskyBackendApplicationTests

}
