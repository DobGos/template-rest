package com.doxason.template.rest.jaxrs;

import static org.junit.Assert.*;

import org.junit.Test;

public class LogFileReaderTest {

	
	@Test
	public void test(){
		LogFileReader fileReader = new LogFileReader();
		assertFalse(fileReader.getFile("test_demo_file.log").isEmpty());
	}
}
