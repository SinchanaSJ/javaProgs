package tyss.Strings;

public class IntegerPalindrome {

	public static void main(String[] args) {
		int num=12021;
		int r;
		int sum=0;
		int temp=0;
		temp=num;
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
