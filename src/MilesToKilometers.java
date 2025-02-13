
import java.math.*;
public class MilesToKilometers {

	public static void main(String[] args) {
		
		printConversion(1.5);
	}
		
		public static long toMilesPerHour(double kilometersPerHour) {
	        if (kilometersPerHour >= 0) {
	            kilometersPerHour = kilometersPerHour / 1.609;
	            long rounded = Math.round(kilometersPerHour);
	            return rounded;
	        } else {
	            return -1;
	        }
	    }

	      public static void printConversion(double kilometersPerHour) {
	        if (kilometersPerHour < 0) {
	            System.out.println("Invalid Value");
	            return;
	        }
	        long mph = toMilesPerHour(kilometersPerHour);
	        System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
	    }
	
}
