package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class PrimeNum {

	public static void main(String[] args) {
		ArrayList l=new ArrayList<>();
		for (int j = 1; j < 100; j++) {
			int n=j;
			int i=2;
			int count=0;
			while(i<=n/2) {
				if(n%i==0) {
					count++;
					break;
				}
				i++;
			}
			if(count==0 && n!=1) {
				l.add(n);
			}
			for(Object o:l) {
				System.out.println(o);
			}
		}
	}

}
