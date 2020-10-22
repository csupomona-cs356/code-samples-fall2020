package edu.cpp.cs3560.ppvsoop;

import java.io.File;
import java.util.Scanner;

public class MessagingService {
	
	public static String messageBuffer;
	
	public static void sendMessageParent(int type) {
		if (type == 1) {
			String msg = getMessageFromInput();
			//...
		} else {
			File msg = getImaeMessageFromInput();
			// ...
		}
	}
	
	public static String getMessageFromInput() {
		String message = "";
		Scanner s = new Scanner(System.in);
		message = s.nextLine();
		return message;
	}
	
	public static File getImaeMessageFromInput() {
		File file = null;
		return file;
	}
	
	public static void sendMessage(String message) {
		System.out.println("Message has been sent out " + message);
	}
	
	public static void sendImageMessage(File file) {
		System.out.println("Message has been sent out " + file);
	}
	
	public static void receiveMessage() {
		messageBuffer = "sth";
	}
	
	public static void displayMessage(String message) {
		System.out.println("Displaying the message " + message);
	}

	public static void main(String[] args) {
		String msg = getMessageFromInput();
		sendMessage(msg);
		
		while(true) {
			receiveMessage();
//			displayMessage();
		}

	}

}
