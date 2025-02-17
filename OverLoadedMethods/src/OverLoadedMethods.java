
public class OverLoadedMethods {

	public static void main(String[] args) {
		
	System.out.println("5ft, 8in = " + converToCentimeters(5, 8) + "cm");
	System.out.println("68in = " + convertToCentimeters(68) + "cm");
		
		
	}  public static double convertToCentimeters(int inches) {
		
	
		return inches * 2.54;
		
		
		
	} public static double converToCentimeters(int height_in_feet, int height_in_inches) {
		
			
			int ft_inches = height_in_feet * 12;
			int total_inches = ft_inches + height_in_feet;
			double result = convertToCentimeters(total_inches);
			return result; 
		
			
			//return convertToCentimeters((height_in_feet * 12) + height_in_inches);


}
}



