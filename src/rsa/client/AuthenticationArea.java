package rsa.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
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
	
	//AREA RPC Elements
//	private final RideSharingServiceAsync rpc = GWT.create(RideSharingService.class);
	
	//Main Constructor
	public AuthenticationArea() {
		
		//Construct elements
		this.formPanel = new VerticalPanel();
		this.unameInput = new TextBox();
		this.nickInput = new TextBox();
		this.pswInput = new PasswordTextBox();
		this.submitBtn = new Button("Login");
		
		//Stylize them
		formPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		formPanel.setStylePrimaryName("formPanel");
		unameInput.setStylePrimaryName("inputBox");
		nickInput.setStylePrimaryName("inputBox");
		pswInput.setStylePrimaryName("inputBox");
		unameInput.setText("Username");
		nickInput.setText("Nick");
		pswInput.setText("Password");
		submitBtn.setStylePrimaryName("sendButton");
		
		//Create callback for submit button
		//Teste para REGISTER
	/*
		submitBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				RideSharingService.register(String nick, String name, String password,new AsyncCallback<Boolean>() {
					@Override
					public void onSuccess(Boolean result) {
						if (result)
							Window.alert("Registou-se com sucesso!");
						else
							Window.alert("Ocorreu um erro no registo!");
						// faz alguma coisa com o valor
						// faz login ou manda para a pagina inicial
					}
					@Override
					public void onFailure(Throwable caught) {
						Window.alert(caught.getMessage());
					}
				});
			}
		});
		*/
		//Bind elements with respective parents
		formPanel.add(unameInput); 
		formPanel.add(nickInput);
		formPanel.add(pswInput);
		formPanel.add(submitBtn);
		
		//Call the initWidget() method
		initWidget(formPanel);
	}
}
