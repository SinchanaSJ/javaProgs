package Arrays;

import java.util.Arrays;

public class LargestSmallestElement {

	public static void main(String[] args) {
		int [] a= {50,10,46,50,30,45,31,70,60,70,46,5};
		Arrays.sort(a);
		System.out.println("Smallest number: "+a[0]);
		System.out.println("Smallest number: "+a[a.length-1]);
	}

}
