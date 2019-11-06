package com.perscholas;

import java.util.Scanner;


public class BodyMassIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your weight in Kg: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter you height in meter: ");
		double height = input.nextDouble();
		
		double bodyMassIndex = weight / (height * height);
		
		input.close();
		
		System.out.println("Your BMI is: " + bodyMassIndex);
	}

}
