import java.util.Scanner;

public class ConditionalsProblemLottery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/*Problem: Write a program that randomly generates a lottery of a two-digit number, 
		prompts the user to enter a two-digit number, and determines whether the user wins 
		according to the following rule: 
			 If the user input matches the lottery in exact order, the award is $10,000. 
			 If the user input matches the lottery, the award is $3,000. 
			 If one digit in the user input matches a digit in the lottery, the award is $1,000.*/
		
		int lotteryNum = (int) (Math.random() * 100);
		System.out.println("Enter a two-digit number");
		int userNum = input.nextInt();
		
		int lotteryDigit1 = lotteryNum / 10;
		int lotteryDigit2 = lotteryNum % 10;
		
		int userDigit1 = userNum / 10;
		int userDigit2 = userNum % 10;
		
		if(lotteryNum == userNum) {
			System.out.println("You won $10,000!");
		} else if ((lotteryDigit1 == userDigit2) && (lotteryDigit2 == userDigit1)) {
			System.out.println("You won $3000");
		} else if((userDigit1 == lotteryDigit1) || (userDigit1 == lotteryDigit2) || 
				(userDigit2 == lotteryDigit1) || (userDigit2 == lotteryDigit2)) {
			System.out.println("You won $1000");
		} else {
			System.out.println("You didn't win anything");
		}
		
		input.close();

	}

}
