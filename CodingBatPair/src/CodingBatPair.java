
public class CodingBatPair {

	public static void main(String[] args) {
		

	
	}
	
	// Authors: Daniel Saelens and Jose Abuan
	// evenlySpaced exercise
	public static boolean evenlySpaced(int a, int b, int c) {
		
	    int small = Math.min(a, Math.min(b,  c));
	    int large = Math.max(a, Math.max(b, c));
	    int medium = (a+b+c) - small - large;
	    int diff1 = medium - small;
	    int diff2 = large - medium;
	    if(diff1 == diff2){
	      return true;
	    }
	      return false;
	}

}
/*
 * Test cases for the evenlySpaced function:
 *
 * Expected Results:
 * evenlySpaced(2, 4, 6) → true             // Result: OK
 * evenlySpaced(4, 6, 2) → true             // Result: OK
 * evenlySpaced(4, 6, 3) → false            // Result: OK
 * evenlySpaced(6, 2, 4) → true             // Result: OK
 * evenlySpaced(6, 2, 8) → false            // Result: OK
 * evenlySpaced(2, 2, 2) → true             // Result: OK
 * evenlySpaced(2, 2, 3) → false            // Result: OK
 * evenlySpaced(9, 10, 11) → true           // Result: OK
 * evenlySpaced(10, 9, 11) → true           // Result: OK
 * evenlySpaced(10, 9, 9) → false           // Result: OK
 * evenlySpaced(2, 4, 4) → false            // Result: OK
 * evenlySpaced(2, 2, 4) → false            // Result: OK
 * evenlySpaced(3, 6, 12) → false           // Result: OK
 * evenlySpaced(12, 3, 6) → false           // Result: OK
 *
 * Additional tests: All passed
 */

//Authors: ChatGpt
// evenlySpaced exercise
public boolean evenlySpaced(int a, int b, int c) {
    // Step 1: Find the smallest, middle, and largest values
    int small = Math.min(a, Math.min(b, c));
    int large = Math.max(a, Math.max(b, c));
    int middle = a + b + c - small - large; // Calculate middle value

    // Step 2: Check if the differences are equal
    return (middle - small) == (large - middle);
}

/*
 * Test cases for the evenlySpaced function:
 *
 * Expected Results:
 * evenlySpaced(2, 4, 6) → true             // Result: OK
 * evenlySpaced(4, 6, 2) → true             // Result: OK
 * evenlySpaced(4, 6, 3) → false            // Result: OK
 * evenlySpaced(6, 2, 4) → true             // Result: OK
 * evenlySpaced(6, 2, 8) → false            // Result: OK
 * evenlySpaced(2, 2, 2) → true             // Result: OK
 * evenlySpaced(2, 2, 3) → false            // Result: OK
 * evenlySpaced(9, 10, 11) → true           // Result: OK
 * evenlySpaced(10, 9, 11) → true           // Result: OK
 * evenlySpaced(10, 9, 9) → false           // Result: OK
 * evenlySpaced(2, 4, 4) → false            // Result: OK
 * evenlySpaced(2, 2, 4) → false            // Result: OK
 * evenlySpaced(3, 6, 12) → false           // Result: OK
 * evenlySpaced(12, 3, 6) → false           // Result: OK
 *
 * Additional tests: All passed
 *  I think our code is a lot easier to read and understand. Both code were successful in the testing portion. Now it is
 *  more of a dealers choice, But, I think reading someone else code can save time if it is written easier to understand.  
 */



//Authors: Daniel Saelens and Jose Abuan
// plusOut exercise

public static String plusOut(String str, String word) {
    int len_str = str.length();
    int len_word = word.length();
    int extra_character_skip = 1;
    String string_holder = "";

    for (int i = 0; i < len_str; i++) {
        if (i <= len_str - len_word) {
            String place_holder = str.substring(i, i + len_word);
            if (place_holder.equals(word)) {
                string_holder = string_holder + word;
                i = i + len_word - extra_character_skip;
            } else {
                string_holder = string_holder + "+";
            }
        } else {
            string_holder = string_holder + "+";
        }
    }
    return string_holder;
}
/*
 * Test cases for the plusOut function:
 *
 * Expected Results:
 * plusOut("12xy34", "xy") → "++xy++"                // Result: OK
 * plusOut("12xy34", "1") → "1+++++"                // Result: OK
 * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy" // Result: OK
 * plusOut("abXYabcXYZ", "ab") → "ab++ab++++"       // Result: OK
 * plusOut("abXYabcXYZ", "abc") → "++++abc+++"      // Result: OK
 * plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"       // Result: OK
 * plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"      // Result: OK
 * plusOut("--++ab", "++") → "++++++"               // Result: OK
 * plusOut("aaxxxxbb", "xx") → "++xxxx++"           // Result: OK
 * plusOut("123123", "3") → "++3++3"                // Result: OK
 *
 * Additional tests: All passed
 */


//Authors: ChatGpt
//plusOut exercise

public String plusOut(String str, String word) {
    StringBuilder result = new StringBuilder();
    int i = 0;

    while (i < str.length()) {
        // Check if the substring starting at 'i' matches 'word'
        if (i <= str.length() - word.length() && str.substring(i, i + word.length()).equals(word)) {
            result.append(word); // Append the word as-is
            i += word.length(); // Move index forward by the length of the word
        } else {
            result.append("+"); // Replace non-word characters with '+'
            i++;
        }
    }

    return result.toString();
}

/*
 * Test cases for the plusOut function:
 *
 * Expected Results:
 * plusOut("12xy34", "xy") → "++xy++"                // Result: OK
 * plusOut("12xy34", "1") → "1+++++"                // Result: OK
 * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy" // Result: OK
 * plusOut("abXYabcXYZ", "ab") → "ab++ab++++"       // Result: OK
 * plusOut("abXYabcXYZ", "abc") → "++++abc+++"      // Result: OK
 * plusOut("abXYabcXYZ", "XY") → "++XY+++XY+"       // Result: OK
 * plusOut("abXYxyzXYZ", "XYZ") → "+++++++XYZ"      // Result: OK
 * plusOut("--++ab", "++") → "++++++"               // Result: OK
 * plusOut("aaxxxxbb", "xx") → "++xxxx++"           // Result: OK
 * plusOut("123123", "3") → "++3++3"                // Result: OK
 *
 * Additional tests: All passed
 * 
 * For this code, ChatGpt definitely was a lot cleaner in their lines of code. However, I do think with 
 * more time and practice with java, the same results can be met with more familiarization of the language. 
 */

//Authors: Daniel Saelens and Jose Abuan
// countClump exercise

public int countClumps(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }

    int current = nums[0];
    int count = 1;
    int clump = 0;
    int highestCount = count;

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == current) {
            count++;
            highestCount = count;
        } else {
            if (highestCount > 1) {
                clump++;
            }
            current = nums[i];
            count = 1;
            highestCount = count;
        }
    }

    if (highestCount > 1) {
        clump++;
    }

    return clump;
}

/*
 * Test cases for the countClumps function:
 *
 * Expected Results:
 * countClumps([1, 2, 2, 3, 4, 4]) → 2           // Result: OK
 * countClumps([1, 1, 2, 1, 1]) → 2              // Result: OK
 * countClumps([1, 1, 1, 1, 1]) → 1              // Result: OK
 * countClumps([1, 2, 3]) → 0                    // Result: OK
 * countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4 // Result: OK
 * countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4 // Result: OK
 * countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5 // Result: OK
 * countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5 // Result: OK
 * countClumps([]) → 0                            // Result: OK
 *
 * Additional tests: All passed
 */


//Authors: ChatGpt
//countClump exercise

public int countClumps(int[] nums) {
    if (nums.length == 0) {
        return 0; // No elements, no clumps
    }

    int clumps = 0; // Count of clumps
    boolean inClump = false; // Tracks if currently inside a clump

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] == nums[i - 1]) { // Consecutive elements are the same
            if (!inClump) {
                clumps++; // Start of a new clump
                inClump = true; // Mark that we're inside a clump
            }
        } else {
            inClump = false; // End of a clump
        }
    }

    return clumps; // Return the total number of clumps
}


/*
 * Test cases for the countClumps function:
 *
 * Expected Results:
 * countClumps([1, 2, 2, 3, 4, 4]) → 2           // Result: OK
 * countClumps([1, 1, 2, 1, 1]) → 2              // Result: OK
 * countClumps([1, 1, 1, 1, 1]) → 1              // Result: OK
 * countClumps([1, 2, 3]) → 0                    // Result: OK
 * countClumps([2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4 // Result: OK
 * countClumps([0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 4 // Result: OK
 * countClumps([0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5 // Result: OK
 * countClumps([0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2]) → 5 // Result: OK
 * countClumps([]) → 0                            // Result: OK
 *
 * Additional tests: All passed
 * 
 *  There is less code in ChatGpt, but this was a good exercise. Maybe next time 
 *  we could try other built in libraries to find an efficient outcome.
 * 
 */


//Authors: Daniel Saelens and Jose Abuan
//fix34 exercise

public int[] fix34(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            int temp = nums[i + 1];
            nums[i + 1] = 4;
            for (int j = i + 2; j < nums.length; j++) {
                if (nums[j] == 4) {
                    nums[j] = temp;
                }
            }
        }
    }
    return nums;
}

//fix34([1, 3, 1, 4]) → [1, 3, 4, 1] [1, 3, 4, 1] OK
//fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4] [1, 3, 4, 1, 1, 3, 4] OK
//fix34([3, 2, 2, 4]) → [3, 4, 2, 2] [3, 4, 2, 2] OK
//fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2] [3, 4, 3, 4, 2, 2] OK
//fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2] [2, 3, 4, 3, 4, 2, 2] OK
//fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4] [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4] OK
//fix34([3, 1, 4]) → [3, 4, 1] [3, 4, 1] OK
//fix34([3, 4, 1]) → [3, 4, 1] [3, 4, 1] OK
//fix34([1, 1, 1]) → [1, 1, 1] [1, 1, 1] OK
//fix34([1]) → [1] [1] OK
//fix34([]) → [] [] OK
//fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7] [7, 3, 4, 7, 7] OK
//fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1] [3, 4, 1, 3, 4, 1] OK
//fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1] [3, 4, 1, 3, 4, 1] OK
//other tests OK



//Authors: chatGpt
//fix34 exercise

public int[] fix34(int[] nums) {
    int fourIndex = 0; // Pointer to track the position of available 4's

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 3) {
            while (nums[fourIndex] != 4 || (fourIndex > 0 && nums[fourIndex - 1] == 3)) {
                fourIndex++;
            }

            // Swap the numbers
            int temp = nums[i + 1];
            nums[i + 1] = nums[fourIndex];
            nums[fourIndex] = temp;
        }
    }
    return nums;
}


//fix34([1, 3, 1, 4]) → [1, 3, 4, 1] [1, 3, 4, 1] OK
//Works as expected, places 4 immediately after 3.

//fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4] [1, 3, 4, 1, 1, 3, 4] OK
//Correctly handles multiple 3s and 4s in the array.

//fix34([3, 2, 2, 4]) → [3, 4, 2, 2] [3, 4, 2, 2] OK
//Places the 4 correctly after the single 3.

//fix34([3, 2, 3, 2, 4, 4]) → [3, 4, 3, 4, 2, 2] [3, 4, 3, 4, 2, 2] OK
//Handles multiple 3s and 4s while preserving their relationships.

//fix34([2, 3, 2, 3, 2, 4, 4]) → [2, 3, 4, 3, 4, 2, 2] [2, 3, 4, 3, 4, 2, 2] OK
//Correctly rearranges all 3-4 pairs in order.

//fix34([5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5]) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4] [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4] OK
//Handles a complex array with multiple 3-4 pairs and other elements correctly.

//fix34([3, 1, 4]) → [3, 4, 1] [3, 4, 1] OK
//Works correctly for a simple array with one 3-4 pair.

//fix34([3, 4, 1]) → [3, 4, 1] ArrayIndexOutOfBoundsException: 3 (line:6)
//Error occurs because the code assumes that there is always a valid number after 3 to swap with. 
//In this case, the array already has 3 followed by 4, so no changes are needed, 
//but the code tries to access out-of-bounds elements.

//fix34([1, 1, 1]) → [1, 1, 1] [1, 1, 1] OK
//No 3s or 4s to rearrange, so the array is returned as-is.

//fix34([1]) → [1] [1] OK
//Single-element array, no 3s or 4s, so returned as-is.

//fix34([]) → [] [] OK
//Empty array, nothing to rearrange, returned as-is.

//fix34([7, 3, 7, 7, 4]) → [7, 3, 4, 7, 7] [7, 3, 4, 7, 7] OK
//Correctly places the 4 immediately after 3, while leaving other elements untouched.

//fix34([3, 1, 4, 3, 1, 4]) → [3, 4, 1, 3, 4, 1] [3, 4, 1, 3, 4, 1] OK
//Correctly handles multiple 3-4 pairs in the array.

//fix34([3, 1, 1, 3, 4, 4]) → [3, 4, 1, 3, 4, 1] ArrayIndexOutOfBoundsException: 6 (line:6)
//Error occurs because the code does not properly handle cases where there are extra numbers
//between or after the 3-4 pairs, leading to out-of-bounds access.

//other tests OK

// Our code passed all tests, where ChatGpt did not.






