package tyss.practice;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxOccuranceScenario {

	public static void main(String[] args) {
		int[]a= {10,20,20,10,50,30,30};
		int count1=0;
		int max=0;
		HashMap<Integer,Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					if(i>j)
						break;
					else
						count++;
				}
			}
			if(count>=1)
			{ 
				if(count1<count)
				{
					count1=count;
					//max=a[i];
				}
				map.put(a[i], count);
			}
		}
           // System.out.println(max+" "+count1);
		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if(entry.getValue()==count1)
			{
				if(max<entry.getKey())
				{
					max=entry.getKey();
				}
			}
		} 
		System.out.println(max);
	}
}