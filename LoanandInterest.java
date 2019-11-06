package ClassExercise;

import java.util.Scanner;

public class LoanandInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Problem: Write a program that lets the user enter the interest rate,number of years,
and loan amount,and computes monthly payment and total payment.*/		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the interest rate");
		double interestRate = input.nextDouble();
		double monthlyIR = (interestRate/100)/12;
		System.out.println("Enter no of years");
		int noOfYears = input.nextInt();
		int noOfMonths = noOfYears*12;
		System.out.println("Enter loan amount");
		double loanAmount = input.nextDouble();
		
		double monthlyPayment = (loanAmount * monthlyIR) / (1 - (1/(Math.pow(1+monthlyIR, noOfMonths))));
		double totalPayment = monthlyPayment * noOfMonths;
		input.close();
		System.out.println("Monthly payment: " + "$" + monthlyPayment);
		System.out.println("Total payment: " + "$" + totalPayment);
	}

}
