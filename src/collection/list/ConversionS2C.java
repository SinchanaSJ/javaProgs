package collection.list;

import java.util.Scanner;

public class ConversionS2C {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=s.next();
		char [] ch= new char[s1.length()];
		for (int i = 0; i < ch.length; i++) {
			ch[i]=s1.charAt(i);
			System.out.print(ch[i]+" ");
			
		}

	}

}
