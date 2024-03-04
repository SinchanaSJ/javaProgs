package collection.list;
import java.util.*;

class Pen{
	int id;
	String name;
	double price;
	
	Pen(){}

	public Pen(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class S9 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Pen> ls=new ArrayList<>();
		//Pen p=new Pen();
		ls.add(new Pen(101,"ClassMate",20));
		ls.add(new Pen(102,"Cello",10));
		ls.add(new Pen(103,"Reynolds",30));
		ls.add(new Pen(104,"Bright Gel",5));
		System.out.println("Before: "+ls);
		
		// to access elements using get()
		
		/*for(int i=0; i<ls.size();i++)
		{
			Pen p=(Pen) ls.get(i);
			System.out.println(p.price*1.2);
		}*/
		for(int i=0;i<ls.size();i++)
		{
			Pen p=ls.get(i);
			if(p.name.equals("cello"))
			{
				ls.remove(p);
				
			}
			
		}
		System.out.println("After removal:"+ls);
		
	}

}
