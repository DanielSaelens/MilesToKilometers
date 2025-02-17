import java.lang.Comparable;
public class Student implements Comparable{
	
	private String name;
    private int score;
	
    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    public String toString() { 		
    	return this.name + "score = " + this.score;	
    }

	@Override
	public int compareTo(Object o) {
        if(o instanceof Student){
            Student other = (Student) o; //Typecast this object as a Student object
            if(this.score > other.score){
                return 1;
            } else if(this.score < other.score){
                return -1;
            }
            return 0;
            
        }
    	throw new ClassCastException("Cannot compare Student with " + o.getClass().getName());
	}

}
