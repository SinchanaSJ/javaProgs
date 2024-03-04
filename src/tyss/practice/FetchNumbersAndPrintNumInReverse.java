package tyss.practice;

import java.util.ArrayList;

public class FetchNumbersAndPrintNumInReverse {

	public static void main(String[] args) {
		String s="aabb1235dd45ee1ff44";
		String [] s1=s.split("[a-z]+");
		for (int i = s1.length-1; i >=0 ; i--) {
			if(i>1)
			System.out.print(s1[i]+",");
			else
				System.out.print(s1[i]);
		}
	}
}