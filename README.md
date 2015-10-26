# UCSD_Earthquake_Map

This project was designed by the University of California, San Diego Cousera Intermediate Programming Team for
 the Object-Oriented Programming in Java course. It was the first of a 5 course specialization (Java Programming: Object-Oriented Design of Data Structures Specialization).

Link for course: https://www.coursera.org/learn/object-oriented-java/home/welcome

The Program was built from:
</br>
Unfolding Maps
</br>
Processing
</br>
data from earthquake.usgs.gov


The project was separated into 5 modules:

<b>Module 1:</b> Display a map equal to the size and adjacent to the original map.


<b>Module 3:</b> Display markers for recent earthquakes by using data from earthquake.usgs.gov. The markers are color coded depending on the magnitude. 

<b>Module 4:</b> Uses the abstract class EarthquakeMarker that is inherited by LandQuakeMarker and OceanQuakeMarker. The method draw() is used to call the drawEarthquake() methods present in LandQuakeMarker and OceanQuakeMarker which have different code to draw different size/shape/and color. CityMarker also added to label major cities on the globe. 
</br>
</br>
<b>Module 5:</b> Primarily updates the program with using the eventhandlers mouseClicked() and mouseMoved(). If an EarthQuakeMarker is clicked, all the markers except the CityMarkers nearby are removed. If a city is clicked, all markers besides the closet EarthquakeMarkers are removed. CityMarker and EarthquakeMarker now extends from CommonMarker which contains the draw() method depending 


<b>Module 6:</b> The comparableTo interface is used on the EarthquakeMarker which compares the "this" earthquake magnitude from all the other earthquakemagnitudes. The method sortAndPrint sorts the earthquakes by magnitudes in descending order.

<b>Final:</b> Made a custom GUI that shows the Top 5 Earthquakes sorted by Magnitude.  

![Alt text](https://github.com/hokatvcu/UCSD_Earthquake_Map/blob/master/Final_Earthquake_Project.png "Optional title")


