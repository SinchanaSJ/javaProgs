package strings;

import java.util.Scanner;

public class PrintString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			String s1="";
			for (int j = 0; j < ch.length-i; j++) {
				s1=s1+ch[j];
			}
			System.out.println(s1);
		}
	}

}
