package tyss.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxCountInArrayProg {

	public static void main(String[] args) {
		int[] a= {1,1,2,1,2,2,3,3,3,3,4,2,2,4,5,5,3};
		int maxCount=0;
		int maxNum=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					for(int k=0;k<a.length;k++) {
						map.put(a[i], count);
					}
				}
			}
		}
		System.out.println(map);
		for(Entry<Integer,Integer> e:map.entrySet()) {
			if(e.getValue()>maxCount) {
				maxCount=e.getValue();
				maxNum=e.getKey();
			}
		}
		System.out.println(maxNum+"-->"+maxCount);
	}
}