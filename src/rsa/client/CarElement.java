package rsa.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class CarElement extends Composite {

	private final HorizontalPanel mainPanel;
	private final Label brand;
	private final Label model;
	private final Label color;
	private final Label plate;
	private final Button editBtn;
	private final Button deleteBtn;
	
	CarElement(String _brand, String _model, String _color, String _plate) {
		
		//Construct elements
		this.mainPanel = new HorizontalPanel();
		this.brand = new Label(_brand);
		this.color = new Label(_color);
		this.plate = new Label(_plate);
		this.model = new Label(_model);
		this.editBtn = new Button("Editar");
		this.deleteBtn = new Button("Remover");
		
		//Stylize elements
		mainPanel.setStylePrimaryName("carPanel");
		this.brand.setStylePrimaryName("carText");
		this.color.setStylePrimaryName("carText");
		this.plate.setStylePrimaryName("carText");
		this.model.setStylePrimaryName("carText");
		this.editBtn.setStylePrimaryName("carButton");
		this.deleteBtn.setStylePrimaryName("carButton");
		
		//Add Callbacks
		this.editBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
			
			}
		});
		
		this.deleteBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				
			}
		});
		
		//Bind elements
		mainPanel.add(brand);
		mainPanel.add(model);
		mainPanel.add(color);
		mainPanel.add(plate);
		mainPanel.add(editBtn);
		mainPanel.add(deleteBtn);
		
		//Call initWidget
		initWidget(mainPanel);
		
	}	
}
