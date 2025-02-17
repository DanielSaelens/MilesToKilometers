
/* Step 1: Create a double variable with a value of 20.00
// Step 2: Create a second variable of type double with a value of 80.00
// Step 3: Add both numbers together, then multiply by 100.00
// Step 4: Use the remainder operator to figure out the remainder when the result is divided by 40.00
// Step 5: Create a boolean variable that assigns true if the remainder is 0.00, or false otherwise
// Step 6: Output the boolean variable to see the result
// Step 7: Write an if-then statement that displays a message if there is a remainder
 */

public class Exercise_1 {

	public static void main(String[] args) {

		double step_1, step_2, step_3, step_4;

		step_1 = 20.00d;
		step_2 = 80.00d;
		step_3 = (step_1 + step_2) * 100;
		step_4 = step_3 % 40d;
		System.out.println("My Values total = " + step_3);
		System.out.println("The remainder = " + step_4);

		boolean step_5 = true;

		if (step_4 == 0.00) {
			step_5 = true;
			System.out.println("is no remainder = " + step_5);
		}

		else {
			step_5 = false;
			System.out.println("is no remainder = " + step_5);
		}

		if (step_5 != true) {
			System.out.println("Got some remainder");
		}

	}
}
