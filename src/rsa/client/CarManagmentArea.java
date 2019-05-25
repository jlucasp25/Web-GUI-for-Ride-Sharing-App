package rsa.client;

import java.util.HashSet;
import java.util.Set;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

public class CarManagmentArea extends Composite {
	
	private final VerticalPanel mainPanel;
	private final HorizontalPanel headerPanel;
	private Set<CarElement> carsList;
	
	public CarManagmentArea() {
		//Construct elements and fields
		this.headerPanel = new HorizontalPanel();
		this.mainPanel = new VerticalPanel();
		this.carsList = new HashSet<CarElement>();
		
		//Call method to retrieve the cars
		
		//Creates two fakes to test :))
		CarElement sara1 = new CarElement("Citroen","C3 TDi 2007","Azul","12-32-XV");
		CarElement sara2 = new CarElement("Renault","Clio 2013","Vermelho","35-AS-12");
		carsList.add(sara1);
		carsList.add(sara2);
		
		//Stylize Elements
		this.mainPanel.setStylePrimaryName("verticalCarListPanel");
		this.headerPanel.setStylePrimaryName("carHeaderPanel");
		
		//Add elements to header
		headerPanel.add(new Label("Marca"));
		headerPanel.add(new Label("Modelo"));
		headerPanel.add(new Label("Cor"));
		headerPanel.add(new Label("Matricula"));
		
		//Bind elements
		mainPanel.add(headerPanel);
		for (CarElement aux : carsList)
			mainPanel.add(aux);
		
		//Call initWidget
		initWidget(mainPanel);
	}
}
