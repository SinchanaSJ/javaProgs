package tyss.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class BubbleSortAscending {

	public static void main(String[] args) {
		int[] a= {5,3,1,4};
		/*int temp=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}*/
		for(int i=0;i<a.length;i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
