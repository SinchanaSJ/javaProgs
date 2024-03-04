package collection;

import java.util.ArrayList;


class Book{
	int bid;
	String title;
	double price;
	public Book() {
		super();
	}
	public Book(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}
	/*@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}*/
	public void display() {
		System.out.println("Details of book");
		System.out.println("ID: "+bid);
		System.out.println("Name: "+title);
		System.out.println("Price: "+price);
		System.out.println("***********************************************************");
	}
}

public class BookList {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(new Book(1,"Manual",500));
		l.add(new Book(2,"Java",800));
		l.add(new Book(3,"SQL",300));
		l.add(new Book(4,"Selenium",400));
		l.add(new Book(5,"API",200));
		System.out.println(l);
		for (int i = 0; i < l.size(); i++) {
			Object o=l.get(i);
			Book b1=(Book)o;
			b1.display();
		}
	}

}

