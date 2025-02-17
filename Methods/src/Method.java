
public class Method {

	 public static void main(String[] args) {

	        boolean gameOver = true;
	        int score = 800;
	        int levelCompleted = 5;
	        int bonus = 100;
	        
	        int final_score = score;
	        
	      int high_score =  calculateScore(gameOver, score, levelCompleted, bonus);
	      System.out.println(" The highscore is " + high_score);
	       
	       score = 10000;
	       levelCompleted = 8;
	       bonus = 200;
	       
	       
	       
	      System.out.println("The next high score is " + 
	      calculateScore(gameOver, score, levelCompleted, bonus));
	        
	        
   
    }
	 		public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
	 			
	 	        
	 	        int final_score = score;
	 	        
	 	        if(gameOver) {
	 	        	final_score += (levelCompleted * bonus);
	 	        	final_score += 1000;
	 	        	
	 	        }
	 	        	return final_score;
	 		}
	}
