package v2;

import java.util.List;

public class Window {

	private List<Widget> widgets;
	
	public void openWindow() {
		System.out.println("Openning the window and display all the widgets included.");
		if (getWidgets() != null) {
			for(Widget widget : getWidgets()) {
				widget.render();
			}
		}		
	}

	public List<Widget> getWidgets() {
		return widgets;
	}

	public void setWidgets(List<Widget> widgets) {
		this.widgets = widgets;
	}
	
}
