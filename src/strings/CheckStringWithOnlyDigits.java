package strings;

import java.util.Scanner;

public class CheckStringWithOnlyDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		try {
			Integer.parseInt(s);
			System.out.println("Only Digits");
		}
		catch(Exception e) {
			System.out.println("Not only Digits");
		}
	}


}
