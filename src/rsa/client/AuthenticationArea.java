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
		
		
		
		
		
		//Create callback for submit button
		//Teste para REGISTER
	/*
		submitBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				String nick = nickInput.getText();
				String name = unameInput.getText();
				String password = pswInput.getText();
				
				try {
					rssService.register(nick,name,password,new AsyncCallback<Boolean>() {
						
					//	@Override
						public void onSuccess(Boolean result) {
							if (result)
								Window.alert("Registou-se com sucesso!");
							else
								Window.alert("Ocorreu um erro no registo!");
						}
						
						//@Override
						public void onFailure(Throwable caught) {
							if (caught instanceof RideSharingAppException)
								Window.alert(caught.getMessage());
						}
					});
				} catch (RideSharingAppException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		*/
		
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
