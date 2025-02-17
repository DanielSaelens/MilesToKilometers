
public class BarkingDog {

	public static void main(String[] args) {
		
		boolean test = shouldWakeUp(true, 22);
		
		System.out.println(test);
		
		
		

	}  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
	    if (hourOfDay < 0 || hourOfDay > 23) {
	        return false; // Invalid hour
	    } else if (hourOfDay < 8 || hourOfDay > 22) {
	        return barking; 
	    } else {
	        return false;
	    }
	}


}
