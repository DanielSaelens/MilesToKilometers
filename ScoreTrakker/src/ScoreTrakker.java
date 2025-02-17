import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ScoreTrakker {

	private static ArrayList<Student> students;
	private String[] files = {"scores.txt", "badscores.txt", "nofile.txt"};

	public ScoreTrakker() {
		this.students = new ArrayList<Student>();
	}

	public void loadDataFile(String name) {

		try {
			File myData1 = new File(name);
			Scanner scan = new Scanner(myData1);
			int index = 0;
			String firstName, lastName, fullName;
			int value;
			while (scan.hasNextLine()) {
				scan.useDelimiter("\\s");
				firstName = scan.next();
				lastName = scan.next();
				fullName = firstName + " " + lastName;
				value = scan.nextInt();
				students.add(index, new Student(fullName, value));
			}
			scan.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public void printInOrder() {
		//Sort the students ArrayList
		 int n = students.size();
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                if (students.get(j).compareTo(students.get(j+1)) == 1) {
	                    // Swap students[j] and students[j+1]
	                    Student temp = students.get(j);
	                    students.set(j, students.get(j + 1));
	                    students.set(j + 1, temp);
	                }
	            }
	        }
	      //Output everything in the array now that it is in ord
			for(int i = 0; i < students.size(); i++){
				System.out.println(students.get(i));
			}
	    }		


	public void processFiles() {
		loadDataFile(files[0]);
		printInOrder();
	}

	public static void main(String[] args) {

	}

}

