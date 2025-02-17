
public class TeenNumberChecker {

	public static void main(String[] args) {
		
		boolean test = hasTeen(13, 14, 19);
		boolean test2 = isTeen(13);
		System.out.println(test + " " + test2);
		
		

	}   public static boolean hasTeen(int teen_1, int teen_2, int teen_3) {
        if (teen_1 >= 13 && teen_1 <= 19) {
            return true;
        } else if (teen_2 >= 13 && teen_2 <= 19) {
            return true;
        } else if (teen_3 >= 13 && teen_3 <= 19) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int teen_4) {
        if (teen_4 >= 13 && teen_4 <= 19) {
            return true;
        }
        return false; 
    }
}

