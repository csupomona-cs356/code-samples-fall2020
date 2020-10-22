package edu.cpp.cs3560.ppvsoop.optimized;

import java.io.File;
import java.util.Scanner;

public class MessagingService {
	
	public static IMessage messageBuffer;
	
	public static void sendMessage(IMessage message) {
		message.getMessageFromInput();
		System.out.println("Message has been sent out " + message);
	}	
	
	public static void receiveMessage() {
		messageBuffer.displayMessage();		
	}
	
	public static void main(String[] args) {				
		IMessage imageMsg = new ImageMessage();
		sendMessage(imageMsg);
		
//		MessagingService messageService = new MessagingService();
//		messageService.sendMessage(imageMsg);
	}

}
