import java.util.Scanner;
public class EqualSumChecker {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a =  scan.nextInt();
		int b =  scan.nextInt();
		int c = scan.nextInt();
		
		
		boolean test = hasEqualSum(a, b, c);
		
		System.out.println(test);
	}
	public static boolean hasEqualSum(int num1, int num2, int num3){
        int final_num = num1 + num2;
        if(final_num == num3){
            return true;
        } 
        return false;
    }

}
