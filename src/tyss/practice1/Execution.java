package tyss.practice1;

public class Execution {
	public static void main(String[] args) {
		Demo1 d1 = new Demo2();
		d1.test1();
		System.out.println();
		Demo2 d2 =(Demo2) d1;
		d2.test1();
//		
	}
}
