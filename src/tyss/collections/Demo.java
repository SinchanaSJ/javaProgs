package tyss.collections;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		int [] a= {2,0,7,8,9,13,20,24};
		int count=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				count++;
				System.out.print(a[i]+" ");
			}
			
		}
		System.out.println();
		System.out.println(count);
	}
}
