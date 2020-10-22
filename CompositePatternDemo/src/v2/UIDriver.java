package v2;

import java.util.Arrays;

public class UIDriver {

	public static void main(String[] args) {
		Button button1 = new Button();
		Button button2 = new Button();
		
		Image2D image2d = new Image2D();
		image2d.setImageUrl("cpp.edu/cs.jpg");
		
		MenuBar menuBar = new MenuBar();
		menuBar.setPosition_x(10);
		menuBar.setPosition_y(10);
		
		TextArea textArea1 = new TextArea();
		TextArea textArea2 = new TextArea();
		
		CheckBox cb = new CheckBox();
		
		Window appWindow = new Window();
		appWindow.setWidgets(Arrays.asList(new Widget[] {button1, button2, cb, image2d, menuBar, textArea1, textArea2}));		

		appWindow.openWindow();
	}

}
