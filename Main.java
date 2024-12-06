/*Name: Timothy Jacot
 * Due Date: October 6th 2024
 * Lab Professor: Leanne Seaward
 * Assessment: Assignment 1
 * Description: Calculating volume of a cylinder pyramid
 */

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		//importing Scanner class
		Scanner keyboard = new Scanner(System.in);
		
		//importing VolumeCalculator class for calculations
		CylinderPyramid calculator = new CylinderPyramid();
		System.out.print("Please enter the base radius:");
		
		//assigning base radius variable via Scanner
		double baseRadius = keyboard.nextDouble();
		System.out.print("Please enter the height of the cylinder: ");
		
		//assigning height variable via Scanner
		double height = keyboard.nextDouble();
		
		//calling base radius setter variable from CylinderPyramid class
		calculator.setBaseRadius(baseRadius);
		
		//calling height setter variable from CylinderPyramid class
		calculator.setHeight(height);
		
		//creating total volume variable, calling CylinderCalculations worker method
		double totalVolume = calculator.CylinderCalculations();

		//printing total volume of cylinder pyramid, with 3 decimal point format
		System.out.printf("The total volume of the cylinder is: %.3f\n", totalVolume);
		System.out.println("Programmed by: Timothy Jacot");
		
		//closing Scanner class
		keyboard.close();
	}
}
