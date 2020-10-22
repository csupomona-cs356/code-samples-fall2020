
public class SnapchatApp {

	public static void main(String[] args) {
		AndroidCamera.getInstance().takePicture();
		
		AndroidCamera camera2 = AndroidCamera.getInstance();
		camera2.takePicture();

		System.out.println(camera2);
	}

}
