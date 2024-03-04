package collection.list;
import java.util.*;
public class S12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		System.out.println(ls);
		Object[] o=ls.toArray();
		System.out.println(ls);
		for (Object object : o) {
			System.out.println(object);
			
		}

	}

}
