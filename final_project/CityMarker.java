package final_project;

import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import processing.core.PConstants;
import processing.core.PGraphics;

/** Implements a visual marker for cities on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Kenny Ho
 *
 */

public class CityMarker extends CommonMarker {
	
	// The size of the triangle marker
	public static int TRI_SIZE = 5;  
	
	public CityMarker(Location location) {
		super(location);
	}
	public CityMarker(Feature city) {
		super(((PointFeature)city).getLocation(), city.getProperties());
		// Cities have properties: "name" (city name), "country" (country name)
		// and "population" (population, in millions)
	}
	
	/**
	 * Implementation of method to draw marker on the map.
	 */
	public void drawMarker(PGraphics pg, float x, float y) {
		// Save previous drawing style
		pg.pushStyle();
		
		// IMPLEMENT: drawing triangle for each city
		pg.fill(255, 0, 255);
		pg.triangle(x, y-TRI_SIZE, x-TRI_SIZE, y+TRI_SIZE, x+TRI_SIZE, y+TRI_SIZE);
		
		// Restore previous drawing style
		pg.popStyle();
	}
	
	/** Show the title of the city if this marker is selected */
	public void showTitle(PGraphics pg, float x, float y){
		
		String city = getCity();
		String country = getCountry();
		String population = Float.toString(getPopulation()) + " million people";
		
		pg.pushStyle();
		
		pg.fill(0,0,0);
		pg.text(city, 5, 10);
		pg.text(country, 5, 20);
		pg.text(population, 5, 30);
		
		pg.popStyle();
	}
	
	/* Local getters for some city properties. */
	public String getCity(){
		return getStringProperty("name");
	}
	
	public String getCountry(){
		return getStringProperty("country");
	}
	
	public float getPopulation(){
		return Float.parseFloat(getStringProperty("population"));
	}
}
