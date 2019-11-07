
public class Conditionals1Problem1CatPeopleDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//three integer variables are created
		int cat = 20;
		int people = 200; 
		int dog = 100;
		
		//comparison of cat and people
		if(cat > people) {
			System.out.println("Too many cats! The world is doomed!");
		} else if(cat < people) {
			System.out.println("Too few cats! The world is saved for another day!");
		} else {
			System.out.println("The world is perfect!");
		}
		
		//comparison of dog and people
		if(dog > people) {
			System.out.println("The world is drooled on!");
		} else if(dog < people) {
			System.out.println("The world is dry!");
		} else {
			System.out.println("The world is perfect!");
		}

	}

}
/* Problem: 
1. What if...

Create three integers: [people], [cats] and [dogs].

Set these variable to whatever you see fit.

Change the following arguments into code:
If there are less people than cats, then print "Too many cats! The world is doomed!"
If there are more people than cats, then print "Too few cats! The world is saved for another day!"

If there are less people than dogs, then print "The world is drooled on!"
If there are more people than dogs, then print "The world is dry!"*/

