import java.util.Scanner;

public class Conditionals1Problem5DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number of a day in a week (1-7)") ;
		int day = input.nextInt();
		
		input.close();
		
		switch(day) {
		case 1: 
			System.out.println("Weekday 1 is Monday!");
			break;
		case 2: 
			System.out.println("Weekday 2 is Tuesday!");
			break;
		case 3: 
			System.out.println("Weekday 3 is Wednesday!");
			break;
		case 4: 
			System.out.println("Weekday 4 is Thursday!");
			break;
		case 5: 
			System.out.println("Weekday 5 is Friday!");
			break;
		case 6: 
			System.out.println("Weekend 6 is Saturday!");
			break;
		case 7: 
			System.out.println("Weekend 7 is Sunday!");
			break;
		default:
			System.out.println("Error");
		}

	}

}

/* Problem: Day of the week

Create a method that accepts an integer and returns a string with the corresponding day of the week.

1 -> Monday
2 -> Tuesday
3 -> Wednesday
4 -> Thursday
5 -> Friday
6 -> Saturday
7 -> Sunday
Anything Else -> Error*/
