
import java.util.Vector;
import java.util.Scanner;








public class Test {

	public static void main(String[] args) {
		System.out.println("Test");
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		System.out.println(a);
		
			if(a >= 3) {
				System.out.println("Correct");
			}
			else if( a <= 3) {
				System.out.println("Incorrect");
			}
	
	}

}
