package collection.list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		System.out.println(ls.add("Smith"));
		System.out.println(ls.add("Adams"));
		System.out.println(ls.add("John"));
		System.out.println("List of TE's: "+ls);
		System.out.println(ls.size());
		
		List ls1=new ArrayList();
		System.out.println(ls1.add("Miller"));
		System.out.println(ls1.add("King"));
		System.out.println(ls1.add("Jacob"));
		System.out.println("List of Developers: "+ls1);
		System.out.println(ls.size());
		System.out.println(ls1.addAll(0,ls));
		System.out.println("List of Engineers: "+ls1);
		
	}

}

