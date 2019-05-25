package rsa.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
//import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
//import com.google.gwt.user.client.ui.Widget;

public class WelcomeScreen extends Composite {
	
	private final VerticalPanel mainPanel;
	//private final Label welcomeText;
	private final Button loginButton;
	private final Button registerButton;
	private AuthenticationArea authArea;
	private Image image;
	
	
	public WelcomeScreen() {
		
		//Construct elements
		this.mainPanel = new VerticalPanel();
		//this.welcomeText = new Label("Registe-se ou entre: "); 
		this.image=new Image();
		image.setUrl("http://127.0.0.1:8888/lock1.png");
		image.setStylePrimaryName("auth_image");
		this.loginButton = new Button("Entrar");
		this.registerButton = new Button("Registar");
		this.authArea = null;
		
		
		
		//Stylize elements
		
		mainPanel.setStylePrimaryName("welcomePanel");
		//welcomeText.setStylePrimaryName("welcomeText");
		loginButton.setStylePrimaryName("welcomeButton");
		registerButton.setStylePrimaryName("welcomeButton");
		
		//Add callbacks to buttons
		loginButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				createAuthenticationArea(false);
			}
		});
		registerButton.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				createAuthenticationArea(true);
			}
		});
		
		//Bind elements
		//mainPanel.add(welcomeText);
		mainPanel.add(image);
		mainPanel.add(loginButton);
		mainPanel.add(registerButton);
		
		//Call initWidget
		initWidget(mainPanel);
	}
	
	public void createAuthenticationArea(boolean isRegister) {
		this.authArea = new AuthenticationArea(isRegister);
		//welcomeText.removeFromParent();
		image.removeFromParent();
		loginButton.removeFromParent();
		registerButton.removeFromParent();
		mainPanel.add(authArea);
	}
}
