package tyss.Strings;

import java.util.Iterator;

public class PrintNumbersOfPattern {

	public static void main(String[] args) {
		// o/p: 1 3 7 15 31 63
		int num=1;
		int n=6;
		for (int i = 0; i < n; i++) {
			System.out.println(num);
			num=(num*2)+1;
			
		}

	}

}
