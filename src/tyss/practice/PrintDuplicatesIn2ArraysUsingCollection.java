package tyss.practice;

import java.util.Map.Entry;
import java.util.TreeMap;

public class PrintDuplicatesIn2ArraysUsingCollection {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int []b= {20,90,100,60,70,10,100};
		int [] res= new int [a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			res[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			res[a.length+i]=b[i];
		}
		
		TreeMap<Integer,Integer> map=new TreeMap<>();
		
		for (int i = 0; i < res.length; i++) {
			if(map.containsKey(res[i])) {
				map.put(res[i], map.get(res[i])+1);
			}
			else {
				map.put(res[i], 1);
			}
		}
		
		for(Entry<Integer,Integer> e:map.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey());
			}
		}
	}

}
