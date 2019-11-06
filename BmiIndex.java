package ClassExercise;

import java.util.Scanner;

public class BmiIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 /*Problem: Body Mass Index(BMI)is a measure of health on weight. It can be calculated by 
 taking your weight in kilograms and dividing by the square of your height in meters.*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your weight in Kg ");
		double weight = input.nextDouble();
		System.out.println("Enter your height in meters ");
		double height = input.nextDouble();
		double bodyMassIndex = weight /Math.pow(height, 2);
		
		if(bodyMassIndex < 18.5) {
			System.out.println("You are underweight!");
		} else if(bodyMassIndex >= 18.5 || bodyMassIndex < 25) {
			System.out.println("You are normal.");
		} else if(bodyMassIndex >= 25 || bodyMassIndex < 30) {
			System.out.println("You are overweight!");
		} else {
			System.out.println("Your are obese!!");
		}
		input.close();
		double result = Math.pow(1.025, 12);
		System.out.println(result);
	}

}
