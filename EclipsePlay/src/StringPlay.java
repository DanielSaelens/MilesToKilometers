import java.awt.Point;
public class StringPlay {

    public static void main(String[] args) {
        
        String string_1 = "C++ is cool";
        String string_2 = "I love Java";
        
        // Added string replacement
        String replaced = string_1.replace("C++", "Java");
        System.out.println("Replaced string_1: " + replaced);

        // Added conversion to uppercase
        String uppercased = string_2.toUpperCase();
        System.out.println("Uppercased string_2: " + uppercased);

        // Created two new strings to explore equals() and equalsIgnoreCase()
        String newString1 = "Programming is Fun";
        String newString2 = "programming is fun";

        // Compare using equals()
        if (newString1.equals(newString2)) {
            System.out.println("newString1 and newString2 are exactly the same.");
        } else {
            System.out.println("newString1 and newString2 are not the same using equals().");
        }

        // Compare using equalsIgnoreCase()
        if (newString1.equalsIgnoreCase(newString2)) {
            System.out.println("newString1 and newString2 are the same when ignoring case.");
        } else {
            System.out.println("newString1 and newString2 are not the same using equalsIgnoreCase().");
        }

        Point point1 = new Point(3, 4);
        Point point2 = new Point(3, 4);
        System.out.println(point1 == point2);
        System.out.println(point1.equals(point2));

        String name_1 = "Daniel";
        String name_2 = "daniel";
        System.out.println(name_1.equals(name_2));
        System.out.println(name_1.equalsIgnoreCase(name_2));
    }
}

	

		
		
		 
		 
	
		
	


