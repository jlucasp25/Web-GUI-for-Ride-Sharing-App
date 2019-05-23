package rsa.client;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FocusPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

public class MenuPanelElement extends Composite {
	
	private final FocusPanel wrapperPanel;
	private final HorizontalPanel mainPanel;
	private final Image elementIcon;
	private final Label elementLabel;
	
	public MenuPanelElement(String iconPath, String textLabel) {
		
		//Construct the elements
		this.wrapperPanel = new FocusPanel();
		this.mainPanel = new HorizontalPanel();
		this.elementIcon = new Image();
		this.elementLabel = new Label();
		
		//Stylize the elements
		mainPanel.setStylePrimaryName("menuPanelElement");
		elementIcon.setUrl(iconPath);
		elementIcon.setStylePrimaryName("menuicon");
		elementLabel.setText(textLabel);
		elementLabel.setStylePrimaryName("sidemenuLabel");
		
		//Bind Elements
		mainPanel.add(elementIcon);
		mainPanel.add(elementLabel);
		wrapperPanel.add(mainPanel);
		
		//Call the initWidget method()
		initWidget(wrapperPanel);
	}
	
	//Enables setting click handlers to these type of elements
	public void addClickHandler(ClickHandler ch) {
		this.wrapperPanel.addClickHandler(ch);
	}
	
}
