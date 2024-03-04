package tyss.collections;

import java.util.Iterator;

public class AdditionOf2ArraysOfDiffLength {

	public static void main(String[] args) {
		int[] a= {5,2,6,7,3};
		int[] b= {2,1,7,4};
		int len=a.length;
		if(a.length<b.length) {
			len=b.length;
		}
		for (int i = 0; i < len; i++) {
			try {
			System.out.print(a[i]+b[i]+" ");
			}
			catch (Exception e) {
				if(a.length<b.length)
					System.out.println(b[i]);
				else
					System.out.println(a[i]);
			}
		}
	}
}
