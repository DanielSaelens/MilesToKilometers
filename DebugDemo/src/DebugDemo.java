
public class DebugDemo {
	int[] numbers = {1,2,3,4,5,6,7,8,9};
	
	public void swapNumbers() {
		int before=0;
		int after=numbers.length-2;
		while (before < after) {
			System.out.println("B: " + before + " A: " + after);
			int temp = numbers[before];
			numbers[before] = numbers[after];
			numbers[after] = temp;
			before++;
			after--;
		}
	}
	public void printNumbers() {
		for (int i=0;i<numbers.length; i++)
			System.out.print(numbers[i] + " ");
	}
	public static void main(String[] args) {
		DebugDemo debugIt = new DebugDemo(); 
		debugIt.swapNumbers();
		debugIt.printNumbers();
	}

}

