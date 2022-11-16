package com.jenkins.assignment1;
/**
 * 
 * @author apjenkins
 * @Class section 
 * Instructor 
 * Date
 * This program calculates the area of circle
 * Displays the result in the console
 */

public class AreaCircle {
	
		/**
		 * Public instance variables for our calculate area functionality 
		 */
		public static double area;
		public static double radius;
		public static final double pi = 3.14; 
		
		/**
		 * Calculates the area of circle  
		 * @param r, Represents radius as a double
		 * @return, Area of circle as a double 
		 */
		public static double calcArea(double r) {
			area = pi*(r*r);
			return area;
		}
		
		/**
		 * Displays double to screen 
		 * @param a, Represents area 
		 */
		public static void displayDouble(double a ) {
			System.out.println(a);
		}

		public static void main(String[] args) {
			AreaCircle.displayDouble(AreaCircle.calcArea(5));

		}

	
}
