package collection.list;
import java.util.*;


public class HM1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> map=new HashMap<>();
		map.put(1, "Smith");
		map.put(2, "Miller");
		map.put(3, "King");
		map.put(4, "Jonas");
		
		System.out.println(map);
		System.out.println();
		Set entries = map.entrySet();
		for (Object object : entries) {
			System.out.println(object);
			
		}
		System.out.println();
		//using iterator
		Iterator i = entries.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println();
		//to access all the values of map using keys
		
		Set s=map.keySet();
		Iterator i1 = s.iterator();
		while(i1.hasNext())
		{
			int a=(int)i1.next();
			System.out.println(a+":"+map.get(a));
		}
		
		//System.out.println(map.entrySet());
		
		

	}

}
