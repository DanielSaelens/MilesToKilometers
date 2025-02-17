
//Detective class with correct constructor and toString() methods
public class Detective {
	
	

	private String name;
	private int badgeNumber; 
	
	//  Paramterized Constructor 
	public Detective(String name, int badgeNumber){
		super();
		this.name = name;
		this.badgeNumber = badgeNumber;
	
		
	} 
		// Detective [Badge=2, Name=Garfield]
		public String toString(){
			return "Detective" + "[Badge  =" + badgeNumber + "," + "Name =" + name +"]";
		}
		
		
	
}
