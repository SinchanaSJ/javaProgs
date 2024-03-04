package tyss.collections;

import java.util.Arrays;

public class MinElementWithoutBBsort {

	public static void main(String[] args) {
		int[] a= {5,3,1,4};
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(min>a[i])
				min=a[i];
		}
		System.out.println(min);
	}

}
