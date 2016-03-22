package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.time06.escoladeti.Escoladeti2016Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Escoladeti2016Application.class)
@WebAppConfiguration
public class Escoladeti2016ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
