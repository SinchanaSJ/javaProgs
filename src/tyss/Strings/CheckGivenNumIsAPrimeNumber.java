package tyss.Strings;

public class CheckGivenNumIsAPrimeNumber {

	public static void main(String[] args) {
		int num=67;
		int i=2;
		int count=0;
		while(i<=num/2) {
			if(num%i==0) {
				count++;
				break;
			}
			i++;
		}
		if(count>=1) {
			System.out.println("Not a Prime Number");
		}
		else {
			System.out.println("Prime Number");
		}
	}

}
