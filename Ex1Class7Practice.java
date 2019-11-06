package ClassExercise;

import java.util.Scanner;

public class Ex1Class7Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Problem: This example creates a program to let a firstgrader practice additions.
		The program randomly generates two single-digit integers number1 and number2
		and displays a question such as “Whatis7+9?” to the student.After the student types
		the answer,the program displays a message to indicate whether the answer is true or false.*/
		Scanner input = new Scanner(System.in);
		
		int num1 = (int) (Math.random() * 10);
		int num2 = (int) (Math.random()*10);
		int sum = num1 + num2;
		
		System.out.println("What is the sum of " + num1 + " and " + num2 + "?");
		int user = input.nextInt();
		
		if(user == sum) {
			System.out.println("correct!");
		} else {
			System.out.println("Try again");
		}
		input.close();
		
	}

}
