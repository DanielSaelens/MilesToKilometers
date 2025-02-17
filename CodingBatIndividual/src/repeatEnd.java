


public class repeatEnd {

	public static void main(String[] args) {
		
		System.out.println(repeatEnd("abc", 3));
		
		
	
		
		
		
		// Author: Daniel Saelens 
		// repeatEnd exercise
		

	} public static String repeatEnd(String str, int n) {
			  
		int len_of_word = str.length();
		String current_word = "";
		
		for(int i = 0; i < n; i++) {
			current_word = current_word + str.substring(len_of_word - n, len_of_word);
		}
		
		return current_word;
		
		
		
		}
		
		
		
	}


