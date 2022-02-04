import java.util.InputMismatchException;
import java.util.Scanner;

public class Project1 {

    public static void main (String[] args) {
	    
	  
	Scanner scanner = new Scanner(System.in);
	
	
	int y, guess;
	int x = 1;
	
	
	
	try {
	    
	    System.out.println("You are in a land full of dragons. In front of you,");
		System.out.println("you see three caves. In one cave, the dragon is friendly");
		System.out.println("and will share his treasure with you. Another dragon");
		System.out.println("is greedy and hungry, and will eat you on sight.");
		System.out.println("What cave will you go into?(1 or 2)");
		
		 
		guess = scanner.nextInt();
	
	    if(guess == x) {
		
		 
	    	System.out.println("You approach the cave.");
		System.out.println("It is dark and spooky");
		System.out.println("A large dragon jumps out in front of you! He opens his jaws and");
		System.out.println("Gobbles you down in one bite");
		scanner.nextLine();
		System.out.println("You Lose! Try again?");
	    }
	
	    
	
	    else if (guess > x) {
	System.out.println("You approach the cave.");
	System.out.println("You see a dim light...");
	System.out.println("You discover a large dragon breakdancing in gold treasure and it asks...");
	System.out.println("Do you want to battle me for my gold?");
	scanner.nextLine();
	System.out.println("You defeat the dragon in a dance battle! and you earned 1000XP");
		
	}
	 
	    else {
		System.out.println("Not an option");
	    }
		    
	
	}
	
	catch (InputMismatchException e) {
	    
	    
	    
	}
	
	finally {
		scanner.close();
	    }
	
	
	}
		   
   }
	
   
   
