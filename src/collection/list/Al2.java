package collection.list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
class Book{}
class Student{}
class Marker{}

public class Al2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		System.out.println(ls.add(20));
		System.out.println(ls.add(20.25));
		System.out.println(ls.add('k'));
		System.out.println(ls.add(true));
		System.out.println(ls.add(new Book()));
		System.out.println(ls.add(new Student()));
		System.out.println(ls.add(new Marker()));
		System.out.println(ls.add(new Scanner(System.in)));
		
		System.out.println(ls);
		/*System.out.println(ls.size());
		System.out.println(ls.add(10));//int to Integer to Object
		System.out.println(ls.add(20));
		System.out.println(ls.add(30));
		
			System.out.println(ls);

		//System.out.println(ls.contains(20));
		System.out.println(ls.size());*/
		
		
		/*ArrayList ls1=new ArrayList();
		System.out.println(ls);
		System.out.println(ls1.size());
		
		Collection c=new ArrayList();
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c.isEmpty());*/
	}

}
