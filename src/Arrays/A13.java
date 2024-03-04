package Arrays;

import java.util.Scanner;

public class A13 {

	public static void main(String[] args) {
		//wajp to create a char[] of size 5, read char from user and store it inside the char[]
		Scanner sc=new Scanner(System.in);
		char [] ch=new char[5];
		System.out.println("Enter the characters");
		for(int i=0;i<ch.length;i++) {
			ch[i]=sc.next().charAt(0);
		}
		System.out.println("Entered characters are");
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		
	}

}
