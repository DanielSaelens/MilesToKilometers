import java.util.Scanner;
public class DecimalComparator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double number_1 = scan.nextDouble();
		double number_2 = scan.nextDouble();
		
		
		
		
		boolean test = areEqualByThreeDecimalPlaces(number_1, number_2);
		
		
		System.out.println(test);
		
		
		

	}   public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
     
        
        num1 = num1 * 1000;
        int value_1 = (int)(num1);
         
       
      num2 = num2 * 1000;
      int value_2 = (int)(num2);
          
		if(value_1 == value_2){
			return true;
	
		}
		
		return false;
		
	}
	
}
        	
        
        
        
  

