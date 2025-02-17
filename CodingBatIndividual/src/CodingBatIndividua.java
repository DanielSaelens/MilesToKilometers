
public class CodingBatIndividua {

	public static void main(String[] args) {
		
		
		
		
		// Author: Daniel Saelens 
		 // canBalance exercise

	}  public boolean canBalance(int[] nums) {
        int num1 = 0;
        int num2 = 0;
        int i = 0;

        while (i < nums.length) {
            num2 = num2 + nums[i];
            i = i + 1;
        }

        for (i = 0; i < nums.length; i++) {
            num1 = num1 + nums[i];
            num2 = num2 - nums[i];
            if (num1 == num2) {
                return true;
            }
        }

        return false;
    }

}
/*	Expected This Run 
 * Test cases for the canBalance function:
 *
 * canBalance([1, 1, 1, 2, 1]) → true      OK
 * canBalance([2, 1, 1, 2, 1]) → false     OK
 * canBalance([10, 10]) → true             OK
 * canBalance([10, 0, 1, -1, 10]) → true   OK
 * canBalance([1, 1, 1, 1, 4]) → true      OK
 * canBalance([2, 1, 1, 1, 4]) → false     OK
 * canBalance([2, 3, 4, 1, 2]) → false     OK
 * canBalance([1, 2, 3, 1, 0, 2, 3]) → true OK
 * canBalance([1, 2, 3, 1, 0, 1, 3]) → false OK
 * canBalance([1]) → false                 OK
 * canBalance([1, 1, 1, 2, 1]) → true      OK
 *
 * Additional tests:
 * OK
 */


//Author: ChatGPT
//canBalance exercise

public boolean canBalance(int[] nums) {
    int leftSum = 0;

    // Calculate the total sum of the array
    int totalSum = 0;
    for (int num : nums) {
        totalSum += num;
    }

    // Traverse the array to find the balance point
    for (int num : nums) {
        leftSum += num; // Add the current number to the left sum
        int rightSum = totalSum - leftSum; // Calculate the right sum
        if (leftSum == rightSum) {
            return true; // Return true if the left and right sums are equal
        }
    }

    return false; // Return false if no balance point is found
}

/*
 * Test cases for the canBalance function:
 *
 * Expected Results:
 * canBalance([1, 1, 1, 2, 1]) → true     // Output: true    Result: OK
 * canBalance([2, 1, 1, 2, 1]) → false    // Output: false   Result: OK
 * canBalance([10, 10]) → true            // Output: true    Result: OK
 * canBalance([10, 0, 1, -1, 10]) → true  // Output: true    Result: OK
 * canBalance([1, 1, 1, 1, 4]) → true     // Output: true    Result: OK
 * canBalance([2, 1, 1, 1, 4]) → false    // Output: false   Result: OK
 * canBalance([2, 3, 4, 1, 2]) → false    // Output: false   Result: OK
 * canBalance([1, 2, 3, 1, 0, 2, 3]) → true // Output: true  Result: OK
 * canBalance([1, 2, 3, 1, 0, 1, 3]) → false // Output: false Result: OK
 * canBalance([1]) → false                // Output: false   Result: OK
 *
 * Additional tests: All passed
 * 
 * For this code, I prefer my own based on readability. I think knowing all the short hand ways to set variables is important,
 * but I also think being able to trace code that may not be yours can be beneficial for all parties.
 */

// Author: Daniel Saelens 
// tenRun exercise

public static int[] tenRun(int[] nums) {
	boolean ISten;
	
	int currentMultiple = -1;
	for(int i = 0; i < nums.length; i++) {
		if(nums[i] % 10 == 0) {
			currentMultiple = nums[i];
			ISten = true;
		} else if(currentMultiple!= -1) {
			nums[i] = currentMultiple;
			ISten = false;
		}
	}
	return nums;
	
	
	  
	  
	  }

/*
 * Test cases for the tenRun function:
 *
 * Expected Results:
 * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]   // Result: OK
 * tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]               // Result: OK
 * tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]               // Result: OK
 * tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]                  // Result: OK
 * tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]                // Result: OK
 * tenRun([10, 10]) → [10, 10]                             // Result: OK
 * tenRun([10, 2]) → [10, 10]                              // Result: OK
 * tenRun([0, 2]) → [0, 0]                                 // Result: OK
 * tenRun([1, 2]) → [1, 2]                                 // Result: OK
 * tenRun([1]) → [1]                                       // Result: OK
 * tenRun([]) → []                                         // Result: OK
 *
 * Additional tests: All passed
 */

//Author: ChatGpt 
//tenRun exercise

public int[] tenRun(int[] nums) {
    int multipleOfTen = -1; // Variable to track the most recent multiple of 10
    
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] % 10 == 0) {
            multipleOfTen = nums[i]; // Update the multiple of 10
        } else if (multipleOfTen != -1) {
            nums[i] = multipleOfTen; // Replace the value with the last multiple of 10
        }
    }
    
    return nums;
}


/*
 * Test cases for the tenRun function:
 *
 * Expected Results:
 * tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]   // Result: OK
 * tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]               // Result: OK
 * tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]               // Result: OK
 * tenRun([1, 2, 50, 1]) → [1, 2, 50, 50]                  // Result: OK
 * tenRun([1, 20, 50, 1]) → [1, 20, 50, 50]                // Result: OK
 * tenRun([10, 10]) → [10, 10]                             // Result: OK
 * tenRun([10, 2]) → [10, 10]                              // Result: OK
 * tenRun([0, 2]) → [0, 0]                                 // Result: OK
 * tenRun([1, 2]) → [1, 2]                                 // Result: OK
 * tenRun([1]) → [1]                                       // Result: OK
 * tenRun([]) → []                                         // Result: OK
 *
 * Additional tests: All passed
 * 
 * There is a slight difference between mine and Chats. I think Chat has more efficiency based on not having 
booleans, so that is something I can practice to get more comfortable with. 
 */


//Author: Daniel Saelens 
// scoreIncreasing exercise

public boolean scoresIncreasing(int[] scores) {
for(int i = 1; i < scores.length; i++){

if(scores[i] < scores[i-1]){
 return false;
} 

   }
   return true;
}

/*
 * Test cases for the scoresIncreasing function:
 *
 * Expected Results:
 * scoresIncreasing([1, 3, 4]) → true      // Result: OK
 * scoresIncreasing([1, 3, 2]) → false     // Result: OK
 * scoresIncreasing([1, 1, 4]) → true      // Result: OK
 * scoresIncreasing([1, 1, 2, 4, 4, 7]) → true // Result: OK
 * scoresIncreasing([1, 1, 2, 4, 3, 7]) → false // Result: OK
 * scoresIncreasing([-5, 4, 11]) → true    // Result: OK
 */

//Author: ChatGpt 
//scoreIncreasing exercise


public boolean scoresIncreasing(int[] scores) {
    for (int i = 1; i < scores.length; i++) {
        if (scores[i] < scores[i - 1]) {
            return false; // Return false if a score is less than the previous one
        }
    }
    return true; // Return true if all scores are in non-decreasing order
}

/*
 * Test cases for the scoresIncreasing function:
 *
 * Expected Results:
 * scoresIncreasing([1, 3, 4]) → true          // Result: OK
 * scoresIncreasing([1, 3, 2]) → false         // Result: OK
 * scoresIncreasing([1, 1, 4]) → true          // Result: OK
 * scoresIncreasing([1, 1, 2, 4, 4, 7]) → true // Result: OK
 * scoresIncreasing([1, 1, 2, 4, 3, 7]) → false // Result: OK
 * scoresIncreasing([-5, 4, 11]) → true        // Result: OK
 *  There is no difference between mine and Chats. I think because there is a limited way to write this code
 *  that's why chat had the same thing as I did. One thing I could do different is changed up the looping structure
 *  but that would be for more style than actual logic change. 
 */


//Author: Daniel Saelens 
// repeatEnd exercise
public static String repeatEnd(String str, int n) {
	  
	int len_of_word = str.length();
	String current_word = "";
	
	for(int i = 0; i < n; i++) {
		current_word = current_word + str.substring(len_of_word - n, len_of_word);
	}
	
	return current_word;
	
	
	
	}

/*
 * Test cases for the repeatEnd function:
 *
 * Expected Results:
 * repeatEnd("Hello", 3) → "llollollo"         // Result: OK
 * repeatEnd("Hello", 2) → "lolo"             // Result: OK
 * repeatEnd("Hello", 1) → "o"                // Result: OK
 * repeatEnd("Hello", 0) → ""                 // Result: OK
 * repeatEnd("abc", 3) → "abcabcabc"          // Result: OK
 * repeatEnd("1234", 2) → "3434"              // Result: OK
 * repeatEnd("1234", 3) → "234234234"         // Result: OK
 * repeatEnd("", 0) → ""                      // Result: OK
 *
 * Additional tests: All passed
 */


//Author: ChatGpt
//repeatEnd exercise

public String repeatEnd(String str, int n) {
    String result = "";
    String sub = str.substring(str.length() - n); // Extract the last n characters
    
    for (int i = 0; i < n; i++) {
        result += sub; // Append the substring n times
    }
    
    return result;
}


/*
 * Test cases for the repeatEnd function:
 *
 * Expected Results:
 * repeatEnd("Hello", 3) → "llollollo"         // Result: OK
 * repeatEnd("Hello", 2) → "lolo"             // Result: OK
 * repeatEnd("Hello", 1) → "o"                // Result: OK
 * repeatEnd("Hello", 0) → ""                 // Result: OK
 * repeatEnd("abc", 3) → "abcabcabc"          // Result: OK
 * repeatEnd("1234", 2) → "3434"              // Result: OK
 * repeatEnd("1234", 3) → "234234234"         // Result: OK
 * repeatEnd("", 0) → ""                      // Result: OK
 *
 * Additional tests: All passed
 * 
 * Chats code is more efficient, but I do prefer naming my. I think my is readable and easier to trace. Making the len_of_word
 * variable helps follow along with tracing. 
 * Overall, all of these exercises were helpful and challenging. 
 *  
 */





