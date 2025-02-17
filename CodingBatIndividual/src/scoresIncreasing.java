import java.util.Arrays;

public class scoresIncreasing {

	public static void main(String[] args) {
		
		   scoresIncreasing obj = new scoresIncreasing(); 
	        
	        int[] test = {1, 2, 3, 4}; 
	        System.out.println(obj.scoresIncreasing(test)); 
	    }

	// Author: Daniel Saelens 
			 // scoreIncreasing exercise
	
		public boolean scoresIncreasing(int[] scores) {
	    for(int i = 1; i < scores.length; i++){
	       
	    	if(scores[i] < scores[i-1]){
	          return false;
	        } 
	        
	            }
	            return true;
	}
		
		}



