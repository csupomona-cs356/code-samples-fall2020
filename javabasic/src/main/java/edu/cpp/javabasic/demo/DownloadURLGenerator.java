package edu.cpp.javabasic.demo;

public class DownloadURLGenerator {
	
	public String getUniqueId() {
		return "id";
	}

	public String generateRandomURL() {
		String id = getUniqueId();
		return "url" + id;
	}
}
