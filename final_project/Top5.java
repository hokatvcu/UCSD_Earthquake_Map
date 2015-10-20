package final_project;

import de.fhpotsdam.unfolding.data.PointFeature;
import final_project.EarthquakeMarker;
import processing.core.PGraphics;

/** Implements a visual marker for earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Kenny Ho
 *
 */
public abstract class Top5 extends CommonMarker {

	// abstract method implemented in derived classes
	public abstract void drawEarthquake(PGraphics pg, float x, float y);
		
	// constructor
	public Top5 (PointFeature feature){
		super(feature.getLocation());
		// Add a radius property and then set the properties
		java.util.HashMap<String, Object> properties = feature.getProperties();

	}
		
	// calls abstract method drawEarthquake and then checks age and draws X if needed
	@Override
	public void drawMarker(PGraphics pg, float x, float y){
		// save previous styling
		pg.pushStyle();
			
		// determine color of marker from depth
	
		
		// call abstract method implemented in child class to draw marker shape
		pg.fill(255,255,255);
		pg.rect(x,y, 140, 200);
		
		// IMPLEMENT: add X over marker if within past day		

		pg.popStyle();	
	}

	/** Show the title of the earthquake if this marker is selected */
	@Override
	public void showTitle(PGraphics pg, float x, float y){
		String title = "Hello";
		pg.fill(0,0,0);
		pg.text(title, 10, 10);
		// TODO: Implement this method
	}
}