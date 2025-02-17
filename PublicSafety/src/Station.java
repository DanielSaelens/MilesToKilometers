import java.util.Scanner;
public class Station {
		
		private String name;
		private int numDetectives;
		// Use of a constant variable in Station class for maximum detectives 
		private static final int MAX_DETECTIVES = 5;
		private Detective[] detective_list = new Detective[MAX_DETECTIVES]; 
		private static int lastBadgeNumber;
		
		public Station(String name) {
			super();
			this.name = name;
		}
		
		public void listDetectives(){
			System.out.println("List of detectives for " + this.name);
			for(int i = 0; i < numDetectives; i++) {
				System.out.println(detective_list[i]);
			}
		}
			
			
		public void addDetective() {
			if(numDetectives == MAX_DETECTIVES) {
				System.out.println("Can't hire any more detectives for " + this.name);
				return;
			}
			System.out.print("New hire for " + this.name + "...Enter detective's name: ");
			Scanner scanner = new Scanner(System.in);
			String name = scanner.next();
	
			lastBadgeNumber++;
			Detective newDetective = new Detective(name, lastBadgeNumber);
			detective_list[numDetectives] = newDetective;
			numDetectives++;
		}
		
		
}
