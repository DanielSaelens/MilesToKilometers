
public class PublicSafety {

	private Station University; 
	private Station City;	

	
	public PublicSafety(String universityName, String cityName ){
		
		super();
		this.University = new Station(universityName);
		this.City =  new Station(cityName);
		
		// true -> city hire
		// false -> university hire
	}
	public void doHire(boolean myBool){
		if(myBool){
			City.addDetective();
		}else {
			University.addDetective();
		}
	}
	
	public void printDetectiveLists() {
		City.listDetectives();
		System.out.println();
		University.listDetectives();
		System.out.println();
	}
	
}

