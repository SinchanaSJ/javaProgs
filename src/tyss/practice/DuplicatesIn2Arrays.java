package tyss.practice;

import java.util.TreeMap;
import java.util.Map.Entry;

public class DuplicatesIn2Arrays {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int []b= {20,90,100,60,70,10};
		//int [] res= new int [a.length+b.length];
//		for (int i = 0; i < a.length; i++) {
//			res[i]=a[i];
//		}
//		for (int i = 0; i < b.length; i++) {
//			res[a.length+i]=b[i];
//		}
		TreeMap<Integer, Integer> map1=new TreeMap<>();
		TreeMap<Integer, Integer> map2=new TreeMap<>();
		for(int i=0;i<a.length;i++) {
			map1.put(a[i], i);
		}
		
		for(int i=0;i<b.length;i++) {
			map2.put(b[i], i);
		}
		System.out.println("Duplicate values: ");
		for(Entry<Integer,Integer> e1: map1.entrySet()) {
			for(Entry<Integer,Integer> e2: map2.entrySet()) {
				if(e1.getKey()==e2.getKey()) {
					System.out.println(e1.getKey());
				}
			}
		}
	}
}