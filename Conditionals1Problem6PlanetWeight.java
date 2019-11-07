import java.util.Scanner;

public class Conditionals1Problem6PlanetWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your current earth weight ");
    double weight = input.nextDouble();
    System.out.println("I have information for the following planets:\r\n" + 
    		"1. Venus\r\n" + 
    		"2. Mars\r\n" + 
    		"3. Jupiter\r\n" + 
    		"4. Saturn\r\n" + 
    		"5. Uranus\r\n" + 
    		"6. Neptune\r\n" + 
    		"Which planet are you visiting? ");
    int planetNum = input.nextInt();
    
    input.close();
    
    switch(planetNum) {
    case 1:
    	System.out.println("Your relative weight on Venus is: " + (0.78 * weight +"!"));
    	break;
    case 2:
    	System.out.println("Your relative weight on Mars is: " + (0.78 * weight +"!"));
    	break;
    case 3:
    	System.out.println("Your relative weight on Jupitar is: " + (0.78 * weight +"!"));
    	break;
    case 4:
    	System.out.println("Your relative weight on Saturn is: " + (0.78 * weight +"!"));
    	break;
    case 5:
    	System.out.println("Your relative weight on Uranus is: " + (0.78 * weight +"!"));
    	break;
    case 6:
    	System.out.println("Your relative weight on Neptune is: " + (0.78 * weight +"!"));
    	break;
    default:
    	System.out.println("Invalid planet number!");
    }
    
	}

}
/* Problem: Space Weight

Create a program that will ask you for your current weight.
The program should then give you a list of planets and numbers that you can use to select them.
The program will then ask you for which planet you're selecting.
Then, the program will multiply your current weight by the relative gravity of that planet.
Finally, the program will output your relative weight on that planet (gravity * weight)

The relative gravities and numbers of each planet are as follows:
1 (Venus) -> 0.78
2 (Mars) -> 0.39
3 (Jupiter) -> 2.65
4 (Saturn) -> 1.17
5 (Uranus) -> 1.05
6 (Neptune) -> 1.23*/
