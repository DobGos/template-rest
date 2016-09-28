package com.doxason.template.rest.jaxrs;

public class LogRecord {
	String line;

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}

	public static class LogRecordBuilder{
		public static LogRecord create(String logLine){
			LogRecord lr = new LogRecord();
			lr.setLine(logLine);
			return lr;
		}
	}
}
