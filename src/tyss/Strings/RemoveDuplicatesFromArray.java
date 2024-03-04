package tyss.Strings;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] a= {2,3,3,5,4,1};
		
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (Integer integer : set) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(integer==a[i]) {
					count++;
				}
			}
			
			System.out.println(integer+"-->"+count);
		}
		ArrayList<Integer> list= new ArrayList<>();
		for(Integer i:set) {
			list.add(i);
			
		}
		System.out.println(list);
		
		
	}

}
