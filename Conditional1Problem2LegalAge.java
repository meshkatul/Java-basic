import java.util.Scanner;

public class Conditional1Problem2LegalAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Hey, what is your name?");
		String name = input.next();
		System.out.println("Okay, " + name + ", How old are you?");
		int age = input.nextInt();
		
		input.close();
		
		if(age < 16) {
			System.out.println("You can't drive, " + name +".");
		} else if(age < 18) {
			System.out.println("You can't vote, " + name +".");
		} else if(age < 25) {
			System.out.println("You can't rent a car, " + name +".");
		} else {
			System.out.println("You can do anything that's legal, " + name +".");
		}
		

	}

}

/*Problem: Legal problems

Make a program which displays a different message depending on the age given. 

Here are the possible responses:
age is less than 16, say "You can't drive."
age is less than 18, say "You can't vote."
age is less than 25, say "You can't rent a car."
age is 25 or over, say "You can do anything that's legal."

Your output could be the following:
Hey, what's your name? 
>Mike

Ok, Mike, how old are you? 
>17

You can't vote, Mike.
You can't rent a car, Mike.*/

