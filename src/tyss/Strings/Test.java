package tyss.Strings;

public class Test {
	

	public static void main(String[] args) {
		try {
			int res=150/0;
			System.out.println(res);
		}
		
		catch (Exception e) {
			System.out.println("Hi");		}
		
		finally {
			System.out.println("Hello");
		}
	}

}
