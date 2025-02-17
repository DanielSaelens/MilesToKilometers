package birthdayPary;

class Guest{
	
	
	private String name;
	private int age;

	public Guest(String name, int age) {
		super()
;		this.name = name;
		this.age = age;
		
		
	}
	public String toString() {
		return "Happy Birthday " + name + "," + " you are " + age + "!";
	}
	
	public void printName() {
		String name = toString();
		for(int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	
	
}






public class happyBirthday {

	public static void main(String[] args) {
		
		Guest guest1 = new Guest("Daniel", 29);
		System.out.println(guest1);
		guest1.printName();
		
	}

}
