package com.example.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class DemoApplicationIT {

	@Test
	public void contextLoads() {
		var tea = new IAmATeapot("Hello");

		assertThat(tea.getName(), is("Hello"));
	}
}
