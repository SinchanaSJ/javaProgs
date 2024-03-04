package tyss.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Append0sAtTheLastINArray {

	public static void main(String[] args) {
		int[] a= {4,0,0,2,6,0,0};
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==0) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}*/
		
	/*	int[] b=new int[a.length];
		int m=0;
		int n=a.length-1;
		for (int i = 0; i < b.length; i++) {
			if(a[i]!=0) {
				b[m]=a[i];
				m++;
			}
			else {
				b[n]=a[i];
				n--;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
			
		}*/

		ArrayList<Integer> list=new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}
		int f=0;
		int l=a.length-1;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i)==0) {
				a[l--]=list.get(i);
			}
			else {
				a[f++]=list.get(i);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
