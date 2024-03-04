package collection.list;
import java.util.*;

class Book1{
	int bid;
	String title;
	double price;
	public Book1() {
		super();
	}
	public Book1(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book1 [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}
	
	

}

public class S11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book1> ls=new ArrayList<>();
		
		ls.add(new Book1(101,"Manual",200));
		ls.add(new Book1(102,"Java",500));
		ls.add(new Book1(103,"Selenium",350));
		ls.add(new Book1(104,"SQL",250));
		System.out.println("Before: "+ls);
		
		ListIterator <Book1> li=ls.listIterator();
	
	//}
	//System.out.println("After removal:"+ls);
	// to add 250 price 
	
	
	while(li.hasNext())
	{
		 Book1 b=li.next();	
		 if(b.price==250)
		 {
			 li.add(new Book1(105,"Project",650));
		 }
		 	//System.out.println(ls.remove(it.next()));			
	}
	System.out.println("After Adding:"+ls);
	
	//to delete java book	
			while(li.hasPrevious())
			{
				 Book1 b=li.previous();	
				 if(b.title.equalsIgnoreCase("java"))
				 {
					 li.remove();
				 }
				 	//System.out.println(ls.remove(it.next()));			
			}
		System.out.println("After Removing:"+ls);
		
		//to modify id 103 to 108
		while(li.hasNext())
		{
			 Book1 b=li.next();	
			 if(b.bid==103)
			 {
				 li.set(new Book1(108,"selenium",350));
			 }
			 	//System.out.println(ls.remove(it.next()));			
		}
	
	System.out.println("After Modifying:"+ls);
	}
}


