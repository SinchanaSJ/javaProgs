package tyss.collections;

public class FactorialWithoutLoop {

	public static void main(String[] args) {
		int n=10;
		int res=fact(n);
		System.out.println(res);

	}
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		else {
			return (n*fact(n-1));
		}
	}

}
