package strings;

import java.util.Scanner;

public class ReverseFullWordsInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String temp="";
		
		String s1[]=s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			String str=s1[i];
			String rev="";
			for (int j = str.length()-1; j >= 0; j--) {
				rev=rev+str.charAt(j);
				
			}
			temp=temp+rev+" ";
		}
		System.out.println(temp);
	}
	
}
