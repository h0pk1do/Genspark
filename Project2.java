import java.util.Scanner;

public class Project2 {

    public static void main (String[] args) {
	    
	    
	  
	Scanner scanner = new Scanner(System.in);
	
	
	
	int number = 1 + (int)(20
                * Math.random());
		 
		int x = 5;
		int y, guess;
		
		try {
		
		System.out.println("Hello! What is your name?");
		String name = scanner.nextLine();
		
		System.out.printf("Well," + name + ", I am thinking of a number between 1 and 20.");
		scanner.nextLine();
		System.out.println("Take a guess.");
		
		for (y = 0; y < x; y++) {
		    
		    guess = scanner.nextInt();
		    
		    if (number == guess) {
			System.out.println("Congrats! + You guessed the number!");
		    }
		    
		    else if (number > guess && x != y -1)  {
		    System.out.println("Your guess is too high.");
		    
		    
		} else if (number < guess && x != y - 1) {
		    
		   System.out.println("Your guess is too low.");
		}
		    
		}
		
		
		if (x == y) {
		    System.out.println("You've guessed too many times");
		    
		    System.out.println("The number was " + number);
		}
		
		}
		finally {
			scanner.close();
		    }
	   
	}
}	   
	
   
   
