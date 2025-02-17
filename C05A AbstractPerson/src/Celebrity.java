
public class Celebrity extends Person {
	
	public Celebrity(String name,  String occupation){
		super(name, occupation);
	}
	
	@Override
	public void askQuestion() {
		System.out.println("Who has been your biggest influence in your career?");
	}
	
	@Override
	public void answerQuestion(){
		System.out.println("I’m just so lucky to be doing what I love");
	}
	
	
	
}
