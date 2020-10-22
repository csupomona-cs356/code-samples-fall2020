package v1;

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
		
		Window appWindow = new Window();
		appWindow.setButtons(Arrays.asList(new Button[] {button1, button2}));
		appWindow.setImages(Arrays.asList(new Image2D[] {image2d}));
		appWindow.setMenuBars(Arrays.asList(new MenuBar[] {menuBar}));
		appWindow.setTextAreas(Arrays.asList(new TextArea[] {textArea1, textArea2}));

		appWindow.openWindow();
	}

}
