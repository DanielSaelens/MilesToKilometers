/**
 * @author Mark Baldwin
 *
 */
public class Friend {

	public Friend(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	public Friend() {
		
	}

	private String name;
	public String getName() {
		return name;
	}
	
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", email=" + email + "]";
//	}
	

}
