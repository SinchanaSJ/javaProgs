package strings;

import java.util.Scanner;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		for (int i = s1.length-1; i >=0; i--) {
			System.out.print(s1[i]+" ");
		}
		//Using temp variable
		/*
		 *   String temp="";
		 *  String s1[]=s.split(" ");
			for (int i = s1.length-1; i >=0; i--) {
			temp=temp+s1[i]+" ";
			
		}
		System.out.println(temp);
		 */
	}

}
