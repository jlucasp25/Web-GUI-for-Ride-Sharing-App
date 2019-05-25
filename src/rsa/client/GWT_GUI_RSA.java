package rsa.client;


import java.awt.Label;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.Window;
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
	
	//Server instances
	//RideSharingServiceAsync rssService = GWT.create(RideSharingService.class);
	
	public void onModuleLoad() {
		
		//Set style of root panel to entire page
		root.setStylePrimaryName("rootPanel");
		Window.setMargin("0px");
		Window.enableScrolling(false);
		
		//Create a DockPanel and customize it
		DockLayoutPanel pagePanel = new DockLayoutPanel(Unit.PCT);
		pagePanel.setSize("100%", "100%");
		pagePanel.setStylePrimaryName("dockLayoutPanel");	
		
		//Create and customize 2 panels to make
		//the base body of the interface
		FlowPanel sidePanel = new FlowPanel();
		FlowPanel mainPanel = new FlowPanel();
		sidePanel.setStylePrimaryName("roundFloatPanel");
		sidePanel.addStyleName("sidePanel");
		mainPanel.setStylePrimaryName("roundFloatPanel");
		mainPanel.addStyleName("mainPanel");

		WelcomeScreen welcomeScreen = new WelcomeScreen();
		mainPanel.add(welcomeScreen);
		
		//Create the SideMenu
		//The inside elements creation are delegated to
		//its constructor
		MenuPanel sideMenu = new MenuPanel(mainPanel);
		sideMenu.setSize("100%","100%");
		sidePanel.add(sideMenu);
		
		//Bind each panel with its respective parents
		pagePanel.addWest(sidePanel,20);
		pagePanel.addEast(mainPanel,80);
		root.add(pagePanel);

		}

}
