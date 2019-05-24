package rsa.client;


import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Class GWT_GUI_RSA
 * Main class for the graphical interface
 * @author jlucasp25
 * @implements EntryPoint
 * 
 */

public class GWT_GUI_RSA implements EntryPoint {
	
	//Quick access to the root panel
	private final Panel root = RootPanel.get();
	
	//Graphical Instances
	private AuthenticationArea authenticationInstance = null;
	
	//Server instances
	//RideSharingServiceAsync rssService = GWT.create(RideSharingService.class);
	
	public void onModuleLoad() {
		
		//Set size of root panel to entire page
		root.setSize("100%","100%");
		
		//Create a DockPanel and customize it
		DockLayoutPanel pagePanel = new DockLayoutPanel(Unit.PCT);
		pagePanel.setSize("100%", "100%");
		pagePanel.setStylePrimaryName("mainPanel");	
		
		//Create and customize 2 panels to make
		//the base body of the interface
		FlowPanel sidePanel = new FlowPanel();
		FlowPanel mainPanel = new FlowPanel();
		sidePanel.setSize("90%", "100%");
		sidePanel.addStyleName("roundFloatPanel");
		mainPanel.setSize("95%", "100%");
		mainPanel.addStyleName("roundFloatPanel");
		
		//
		authenticationInstance = new AuthenticationArea(true); //vamos registar
		mainPanel.add(authenticationInstance);
		//
		
		//Create the SideMenu
		//The inside elements creation are delegated to
		//its constructor
		MenuPanel sideMenu = new MenuPanel();
		sideMenu.setSize("100%","100%");
		sidePanel.add(sideMenu);
		
		//Bind each panel with its respective parents
		pagePanel.addWest(sidePanel,20);
		pagePanel.addEast(mainPanel,80);
		root.add(pagePanel);

		}

}
