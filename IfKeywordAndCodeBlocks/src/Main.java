// Insert a code segment after the code we’ve just reviewed:
//
// - Set the existing score variable to 10,000.
// - Set the existing levelCompleted variable to 8.
// - Set the existing bonus variable to 200.
// - Use the same if condition. Meaning if gameOver is true, 
//   then you want to perform the same calculation, and print 
//   out the value of the finalScore variable.


public class Main {

	    public static void main(String[] args) {

	        boolean gameOver = true;
	        int score = 800;
	        int levelCompleted = 5;
	        int bonus = 100;
	        
	        int final_score = score;
	        
	        if(gameOver) {
	        	final_score += (levelCompleted * bonus);
	        	final_score += 1000;
	        	System.out.println("Your final score is " + final_score);
	        }
	        
	        
	         score = 10000;
	         levelCompleted = 8;
	         bonus = 200;
	        
	         final_score = score;
	        
	        if(gameOver) {
	        	final_score += (levelCompleted * bonus);
	        	System.out.println("Your final score is " + final_score);
	        }

	        
	    }
	}

