
public class Conditionals1Problem3CarsBuses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int people = 100;
		int cars = 100;
		int buses = 100;
		
		if(cars > people) {
			System.out.println("We should take the cars.");
		} else if(cars < people) {
			System.out.println("We should not take the cars.");
		} else {
			System.out.println("We can't decide.");
		}
		
			
		if(buses > cars) {
			System.out.println("That's too many buses.");
		} else if(buses < cars) {
			System.out.println("Maybe we should take the buses.");
		} else {
			System.out.println("We still can't decide.");
		}
		
		
		if(people > buses) {
			System.out.println("Alright, let's just take the buses.");
		} else {
			System.out.println("Let's just take the cars.");
	}

}
}

/*Problem: Cars or Buses

Create three integers named [people], [cars], and [buses].

Change the following arguments into code:
If there are more cars than people, then print "We should take the cars"
Else If there are less cars than people, then print "We should not take the cars."
Else, print "We can't decide."

If there are more buses than cars, then print "That's too many buses."
Else If there are less buses than cars, then print "Maybe we should take the buses."
Else, print "We still can't decide."

If there are more people than buses, then print "Alright, let's just take the buses"
Else, print "Let's just take the cars."*/
