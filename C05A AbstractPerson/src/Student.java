
public class Student extends Person {
		private String[] hobbies = {"playing basketball", "skateboarding", "cooking", "hiking"};
		private String[] questions = {"Are you getting enough rest?", "How old are you?", "I am sorry?", "Could you repeat that?"};
		private static int questionIndex; 
		private static int hobbiesIndex;
		private String major;
		private String university;
		
		
		public Student(String name, String major, String university) {
			super(name, "student");
			this.major = major;
			this.university = university;
		}
		
		@Override
		public void askQuestion() {		
			if(questionIndex == questions.length){
				questionIndex = 0;
			}
			System.out.println(questions[questionIndex]);
			questionIndex++;
		
			
		}
			
		@Override
		public void answerQuestion(){
			if(hobbiesIndex == hobbies.length) {
				hobbiesIndex = 0;
			}
			System.out.println("I love " + hobbies[hobbiesIndex]);
			hobbiesIndex++;
			
		}
		
		@Override
		public void whatIDo() {
			super.whatIDo();
			System.out.println("I study " + this.major + " at " + this.university);
		}
}
