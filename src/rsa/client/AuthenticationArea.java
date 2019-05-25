package rsa.client;


import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


/**
 * 
 * @author João Lucas Pires, Sara Ferreira
 *
 */
public class AuthenticationArea extends Composite {
		
	//Area GUI Elements
	private final VerticalPanel formPanel;
	private final TextBox unameInput;
	private final TextBox nickInput;
	private final PasswordTextBox pswInput;
	private final Button submitBtn;
	
	//RPC Service
	//	RideSharingServiceAsync rssService = GWT.create(RideSharingService.class);
	
	
	//Main Constructor
	public AuthenticationArea(boolean isRegister) {
		
		//Construct elements
		this.formPanel = new VerticalPanel();
		this.unameInput = new TextBox();	
		this.pswInput = new PasswordTextBox();
		if (isRegister) {
			this.nickInput = new TextBox();
			this.submitBtn = new Button("Registar");
		}
		else {
			this.nickInput = null;
			this.submitBtn = new Button("Entrar");
		}
		
		//Stylize them
		formPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		formPanel.setStylePrimaryName("formPanel");
		unameInput.setStylePrimaryName("inputBox");
		pswInput.setStylePrimaryName("inputBox");
		unameInput.setText("Username");
		pswInput.setText("Password");
		if (isRegister) {
			nickInput.setStylePrimaryName("inputBox");
			nickInput.setText("Nick");
		}
		submitBtn.setStylePrimaryName("sendButton");
		
		//Bind elements with respective parents
		formPanel.add(unameInput); 
		if (isRegister)
			formPanel.add(nickInput);
		formPanel.add(pswInput);
		formPanel.add(submitBtn);
		
		//Call the initWidget() method
		initWidget(formPanel);
	}
}
