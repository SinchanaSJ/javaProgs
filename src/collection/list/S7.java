package collection.list;
import java.util.*;
public class S7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ls= new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		
		ArrayList ls1= new ArrayList();
		ls1.add(20);
		ls1.add(40);
		ls1.add(60);
		ls1.add(80);
		System.out.println(ls1);
		
		//to clear elements in a list
		ls.clear();
		System.out.println("After clearing: ");
		System.out.println(ls);
		System.out.println(ls1);
	}

}