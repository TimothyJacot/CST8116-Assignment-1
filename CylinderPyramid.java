/*Name: Timothy Jacot
 *Student Number: 041113276
 *Lab Professor: Leanne Seaward
 *Due Date: October 6th
 *Description: Cylinder Pyramid calculations, getters, setters, worker methods
 */

	//creating new accessors
public class CylinderPyramid { 
	private double baseRadius;
	private double height;
	private double volume;

	
	//constructor
	public CylinderPyramid() {
		
	}
	//overload constructor
	public CylinderPyramid(double newBaseRadius, double newHeight) {
		this.baseRadius = newBaseRadius;
		this.height = newHeight;
		
		//base radius getter method
	}
	public double getBaseRadius() {
		return baseRadius;
	}
	
		//height getter method
	public double getHeight() {
		return height;
		
	}
		//base radius setter
	public void setBaseRadius(double newBaseRadius) {
		this.baseRadius = newBaseRadius;
	}
		//height setter
	public void setHeight(double newHeight) {
		this.height = newHeight;
	}
	//volume getter method
	public double GetVolume() {
		return volume;

	}
	
	//worker method: citation for formula
	
	/*[1], Ruben Ortega, “Volume and area of cylinder in Java / How to Tutorial”,
	 YouTube, https://www.youtube.com/watch?v=FVsYM76cLQI&ab_channel=RubenOrtega, Jan 6th, 2023.
	*/
	public double CylinderCalculations() {
		double volume, volume2, volume3;
		double radius2 = baseRadius*0.8;
		double radius3 = radius2*0.8;
		volume = Math.PI*(Math.pow(baseRadius,2))*height;
		//first cylinder of the pyramid
		volume2 = Math.PI*(Math.pow(radius2, 2))*height;
		//second cylinder of the pyramid, 20% smaller radius
		volume3 = Math.PI*(Math.pow(radius3, 2))*height;
		//third cylinder of the pyramid, 20% smaller than the 2nd radius
		return volume + volume2 + volume3;
	}
}