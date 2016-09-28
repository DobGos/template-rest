package com.doxason.template.rest.jaxrs;

import static org.junit.Assert.*;

import org.junit.Test;

public class HiFiveResourceTest {

	@Test
	public void getResourceSholdReturnNonEmptyString() {
		assertFalse(new HiFiveResource().getResource().isEmpty());
	}
	
	@Test
	public void getResourceShouldReturnThePassedParam() {
		assertTrue(new HiFiveResource().getResource("someName").contains("someName"));
	}
	
}
