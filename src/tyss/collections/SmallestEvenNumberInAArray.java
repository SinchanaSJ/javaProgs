package tyss.collections;

import java.util.TreeSet;

public class SmallestEvenNumberInAArray {

	public static void main(String[] args) {
		int a[]= {10,2,5,03,52,32};
		TreeSet<Integer> set=new TreeSet<>();
		for(int i=0; i<a.length;i++) {
			if(a[i]%2==0) {
				set.add(a[i]);
			}
		}
		for(Integer s:set) {
			System.out.println("Smallest Even No:"+s);
			break;
		}
//		int min=a[0];
//		   for(int i=0;i<a.length;i++){
//		       if(a[i]%2==0){
//		           if(min>a[i]){
//		              min=a[i]; 
//		           }
//		       }
//		   }
//		   System.out.println(min);
	}
}