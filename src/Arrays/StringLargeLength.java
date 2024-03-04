package Arrays;

import java.util.Scanner;

public class StringLargeLength {

	public static void main(String[] args) {
		
		String[]s= {"Hello","Hi","Bye"};
		String large= s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>large.length()) {
				large=s[i];
			}
		}
		
		System.out.println();
		}
		
	}

