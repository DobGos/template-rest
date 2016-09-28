package com.doxason.template.rest.jaxrs;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.stream.Collectors;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("file")
public class LogFileReader {

	@GET
	@Path("/{fileName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<LogRecord> getFile(@PathParam("fileName") String fileName) {
		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		return br.lines().map(LogRecord.LogRecordBuilder::create).collect(Collectors.toList());
	}
}
