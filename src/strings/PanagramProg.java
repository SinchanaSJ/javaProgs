package strings;

import java.util.Scanner;

public class PanagramProg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		int [] a=frequency(s);
		boolean res = isPangram(a);
		if(res)
			System.out.println("Pangram");
		else
			System.out.println("Not a Pangram");
	}
	public static boolean isPangram(int []a) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]==0) {
				return false;
			}
		}
		return true;
	}
	public static int [] frequency(String s) {
		int[] a=new int[26];
		char[]ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A' && ch[i]<='Z') {
				a[ch[i]-65]++;
			}
			else if(ch[i]>='a' && ch[i]<='z') {
				a[ch[i]-97]++; 
			}
		}
		return a;
	}
}
