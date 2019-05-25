package rsa.client;


import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.maps.gwt.client.GoogleMap;
import com.google.maps.gwt.client.LatLng;
import com.google.maps.gwt.client.MapOptions;
import com.google.maps.gwt.client.MapTypeId;

public class RidesArea extends Composite {
	
	public RidesArea() {
		HorizontalPanel mainPanel = new HorizontalPanel();
		mainPanel.setSize("100%","100%");
		mainPanel.setStylePrimaryName("mapContainer");
		MapOptions options = MapOptions.create();
		
		options.setZoom(6);
		options.setMapTypeId(MapTypeId.ROADMAP);
		options.setDraggable(true);
		    options.setMapTypeControl(true);
		    options.setScaleControl(true);
		    options.setScrollwheel(true);
		GoogleMap gMap = GoogleMap.create(mainPanel.getElement(), options);
		//tentei meter na trofa
		gMap.setCenter(LatLng.create(41.3026992, -8.56771829));
		initWidget(mainPanel);
	}
}
