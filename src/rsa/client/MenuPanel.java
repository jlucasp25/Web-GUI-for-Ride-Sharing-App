package rsa.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;

public class MenuPanel extends Composite {

	private final VerticalPanel mainPanel;
	private final MenuPanelElement firstElement;
	private final MenuPanelElement secondElement;
	private final MenuPanelElement thirdElement;
	private final MenuPanelElement fourthElement;
	
	public MenuPanel() {
		//Construct the vertical panel
		this.mainPanel = new VerticalPanel();
		
		//Build the 1st element of the panel (authentication area)
		this.firstElement = new MenuPanelElement("assets/img/icon1.png","Autenticacao");
		firstElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				
				Window.alert("Clicou na autenticacao");
			}
		});
		mainPanel.add(firstElement);
			
		//Build the 2nd element of the panel (car managment)
		this.secondElement = new MenuPanelElement("assets/img/icon2.png","Gestao de automoveis");
		secondElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Clicou na gestao");
			}
		});
		mainPanel.add(secondElement);
		
		//Build the 3nd element of the panel (preferences)
		this.thirdElement = new MenuPanelElement("assets/img/icon3.png","Preferencias");
		thirdElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Clicou na preferencia");
			}
		});
		mainPanel.add(thirdElement);
		
		//Build the 4th element of the panel (rides)
		this.fourthElement = new MenuPanelElement("assets/img/icon4.png","Boleias");
		fourthElement.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				Window.alert("Clicou na boleias");
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
