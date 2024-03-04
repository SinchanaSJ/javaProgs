package collection;

import java.util.ArrayList;
import java.util.Iterator;

class Book1{
	int bid;
	String title;
	double price;

	public Book1() {}

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
class Library{
	ArrayList l=new ArrayList<>();
	public void add(Book1 b) {
		l.add(b);
		System.out.println(b);
	}
	public void removeBook(int bid) {
		Iterator i = l.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			Book1 b1=(Book1)o;
			if(b1.bid==bid) {
				System.out.println("removed book");
				System.out.println(b1);
				i.remove();
			}
		}
	}

	public void removeBook(String title) {
		Iterator i = l.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			Book1 b1=(Book1)o;
			if(b1.title.equalsIgnoreCase(title)) {
				System.out.println("removed book");
				System.out.println(b1);
				i.remove();
			}
		}
	}

	public void removeBook(double price) {
		Iterator i = l.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			Book1 b1=(Book1)o;
			if(b1.price==price) {
				System.out.println("removed book");
				System.out.println(b1);
				i.remove();
			}
		}
	}

}
public class LibraryApplication {

	public static void main(String[] args) {
		//ArrayList l=new ArrayList<>();
		Library l=new Library();
		l.add(new Book1(1,"java",500));
		l.add(new Book1(2,"manual",400));
		l.add(new Book1(3,"selenium",300));
		l.add(new Book1(4,"SQL",200));
		Library li =new Library();
		for (Object o : li.l) {
			System.out.println(o);
		}
		System.out.println("removed book");
		l.removeBook(1);
		l.removeBook("manual");
		l.removeBook(200.0);
		for (Object o : li.l) {
			System.out.println(o);
		}
		
		
	}

}
