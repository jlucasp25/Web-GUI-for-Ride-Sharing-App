package rsa.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MenuPanel extends Composite {

	private final VerticalPanel mainPanel;
	private final MenuPanelElement firstElement;
	private final MenuPanelElement secondElement;
	private final MenuPanelElement thirdElement;
	private final MenuPanelElement fourthElement;
	private FlowPanel mainPanelAccess;
	
	public MenuPanel(FlowPanel rootMain) {
		
		//Construct the vertical panel
		this.mainPanel = new VerticalPanel();
		mainPanel.setStylePrimaryName("menuPanel");
		this.mainPanelAccess = rootMain;
		
		//Build the 1st element of the panel (authentication area)
		this.firstElement = new MenuPanelElement("assets/img/icon1.png"," ");
		firstElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				mainPanelAccess.clear();
				mainPanelAccess.add(new AuthenticationArea(false));
			}
		});
		mainPanel.add(firstElement);
			
		//Build the 2nd element of the panel (car managment)
		this.secondElement = new MenuPanelElement("assets/img/icon2.png"," ");
		secondElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				mainPanelAccess.clear();
				mainPanelAccess.add(new CarManagmentArea());
			}
		});
		mainPanel.add(secondElement);
		
		//Build the 3nd element of the panel (preferences)
		this.thirdElement = new MenuPanelElement("assets/img/icon3.png"," ");
		thirdElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Clicou na preferencia");
			}
		});
		mainPanel.add(thirdElement);
		
		//Build the 4th element of the panel (rides)
		this.fourthElement = new MenuPanelElement("assets/img/icon4.png","");
		fourthElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				mainPanelAccess.clear();
				mainPanelAccess.add(new RidesArea());
			}
		});
		mainPanel.add(fourthElement);
		
		//Call initWidget method
		initWidget(mainPanel);
	}

	public void AuthenticationCallback() {
		// Root -> DeckLayoutPanel -> MainPanel ||> new element
	}
}
