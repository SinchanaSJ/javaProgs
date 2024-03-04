package pattern;
import java.util.Scanner;

public class SwapUsingTemp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 Strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println(s1);
		System.out.println(s2);
		
	}


}
