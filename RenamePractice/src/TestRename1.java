
public class TestRename1 {

	public static void main(String[] args) {
			String s1 = "test";
			String s2 = "test";
			// object
			String s3 = new String("test");
			
			//System.out.println(s1 == s2);
			//System.out.println(s1 == s3);
			System.out.println(s1.equals(s3));
			String result = s1.replace('t', 'q');
			System.out.println(result);
			System.out.println(result.indexOf('e'));
			
			
			
			
	}

}
