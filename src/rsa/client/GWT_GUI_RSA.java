package rsa.client;

import java.awt.Label;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import rsa.server.RideSharingServiceImpl;
import rsa.shared.RideSharingAppException;


public class GWT_GUI_RSA implements EntryPoint {
	
	private RideSharingServiceImpl myInstance = null;
	private final Panel root = RootPanel.get();
	private final HTML lineBreak = new HTML();
	
	public void initApp() throws RideSharingAppException {
		//Does some back stuff in the beginning
		this.myInstance = new RideSharingServiceImpl();
		lineBreak.setHTML("<br/>");
	}
	public void onModuleLoad() {
		try {
			initApp();
		} catch (RideSharingAppException e) {
			//RIP
		}
			
		final HTML unameLabel = new HTML();
		final HTML pswLabel = new HTML();
		unameLabel.setHTML("<h3 class='label'>Nick: </h3>");
		pswLabel.setHTML("<h3 class='label'>Password: </h3>");
		
		final TextBox unameInput = new TextBox();
		final TextBox pswInput = new TextBox();
		unameInput.setStylePrimaryName("inputBox");
		pswInput.setStylePrimaryName("inputBox");
		
		final Button submitBtn = new Button("Login");
		submitBtn.addClickHandler( new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				//gets strings from password and user
				//calls
				String s1 = "";
				String s2 = "";
				myInstance.authenticate(s1,s2);
			}
			
		});
		root.add(unameLabel);
		root.add(unameInput);
		root.add(lineBreak);
		root.add(pswLabel);
		root.add(pswInput);
		}

}
