

public class AndroidCamera {
	
	private static AndroidCamera pointer; 
	
 	
	public static AndroidCamera getInstance() {		
		// "double checked locking" 		
		if (pointer == null) {
			synchronized (AndroidCamera.class) { 
				if (pointer == null) {
					pointer = new AndroidCamera();
				}
			}
		}
						 
		return pointer;
	}
	
	private AndroidCamera() {		
		System.out.println("constructor called! ... ");		
	}
	
	// Master of Java, Sr. Java Developer
	// Concurrency Programming?

	public void takePicture() {
		System.out.println("Taking a photo ... ");
		System.out.println("Saving the the photo ...");
	}
	
	public void recordVideo(String filePath) {
		System.out.println("Recording the video at " + filePath);
	}
}
