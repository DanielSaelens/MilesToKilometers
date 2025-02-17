

public class canBalance {

    public static void main(String[] args) {
    	
       
        canBalance cb = new canBalance();

        
        int[] nums = {1, 1, 1, 2, 1};
        System.out.println(cb.canBalance(nums));
    	
    	
    	
    }
 // Author: Daniel Saelens 
 // canBalance exercise
    
    public boolean canBalance(int[] nums) {
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
 */



