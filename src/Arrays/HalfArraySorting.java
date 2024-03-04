package Arrays;

import java.util.Arrays;

public class HalfArraySorting {
public static void main(String[] args) {
	int [] a= {50,10,46,50,30,45,31,70,60,70,46,5};
	Arrays.sort(a,a.length/2,a.length);
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
}
