import java.util.Arrays;

public class tenRun {

	public static void main(String[] args) {
		
		int[] test = tenRun(new int[] {3, 5, 6, 10, 12});

		System.out.println(Arrays.toString(test));
		
		 // Author: Daniel Saelens 
		 // tenRun exercise
		

	}public static int[] tenRun(int[] nums) {
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
		  
		}


