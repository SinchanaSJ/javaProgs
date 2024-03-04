package strings;

import java.util.Scanner;

public class AnagramProg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 2 strings");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		int [] a=frequency(s1);
		int [] b=frequency(s2);
		boolean res = isAnagram(a, b);
		if(res)
			System.out.println("Anagram");
		else
			System.out.println("Not an Anagram");
	}
	public static boolean isAnagram(int []a,int []b) {
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=b[i]) {
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
