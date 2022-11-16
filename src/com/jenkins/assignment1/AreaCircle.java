package com.jenkins.assignment1;

public class AreaCircle {
	//Instance Fields
		public static double area;
		public static double radius;
		public static final double pi = 3.14; 
		
		//Calculate area of circle
		public static double calcArea(double r) {
			area = pi*(r*r);
			return area;
		}
		//Display return value
		public static void displayArea(double a ) {
			System.out.println(a);
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			AreaCircle.displayArea(AreaCircle.calcArea(3));

		}

	
}
