
public abstract class Person {
	
	private String name;
	private String occupation;
	
	public Person(String name, String occupation){
	
		this.name = name;
		this.occupation = occupation;
	
	}
	
	public void askName() {
		System.out.println("What's your name? ");
	}
	
	
	public void giveName(){
		System.out.println("My name is " + this.name);
	}
	
	public void whatIDo(){
		System.out.print("I am a");
		switch (Character.toLowerCase(this.occupation.charAt(0))) {
			case 'a', 'b', 'c', 'd', 'e':
				System.out.println("n " + this.occupation);
				break;
			default:
				System.out.println(" " + this.occupation);
				break;			
		
		}
	
	}
	
	public abstract void askQuestion();
	
	public abstract void answerQuestion();
	
	
	
	
}  
