import java.util.Random;

public class Athlete extends Person {
	private int[] champYear;
	private Random random = new Random();
	private String[] randomQuestions = {"Who is your favorite athlete?", "What is your favorite sport?", "How can I be like you?"};
	private String[] answers = {"Hard work pays off", "No pain, no gain", "Champions are made, not born", "We gave it 110%"};
	
	
	public Athlete(String name, String sport, int[] champYear) {
		super(name, sport);
		this.champYear = champYear;
	}
	
	@Override
	public void askQuestion() {
		random.nextInt(0, randomQuestions.length);
		System.out.println(randomQuestions[random.nextInt(0, randomQuestions.length)]);
			
	}
	
	@Override
	public void answerQuestion(){
		Random random = new Random();
		System.out.println(answers[random.nextInt(0,answers.length)]);
	}
	
	
	
	@Override
	public void whatIDo() {
		super.whatIDo();
		if(champYear.length > 0) {
			System.out.print("I won in year/s ");
			for(int i = 0; i < champYear.length; i++) {
				System.out.print(champYear[i] + ", ");
			}
		}

	}

}
