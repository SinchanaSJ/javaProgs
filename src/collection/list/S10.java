package collection.list;
import java.util.*;

class Laptop{
	int id;
	String name;
	double price;
	
	Laptop(){}

	public Laptop(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class S10 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Laptop> ls=new ArrayList<>();
		//Pen p=new Pen();
		ls.add(new Laptop(101,"Dell",59999));
		ls.add(new Laptop(102,"HP",69999));
		ls.add(new Laptop(103,"Lenovo",49999));
		ls.add(new Laptop(104,"MAC",199999));
		System.out.println("Before: "+ls);
		
		// to access elements using get()
		
		/*for(int i=0; i<ls.size();i++)
		{
			Pen p=(Pen) ls.get(i);
			System.out.println(p.price*1.2);
		}*/
		//for(int i=0;i<ls.size();i++)
		//{
			
			Iterator it=ls.iterator();
			
			while(it.hasNext())
			{
				 Laptop l=(Laptop)it.next();	
				 if(l.price==59999)
				 {
					 it.remove();
				 }
				 
					//System.out.println(ls.remove(it.next()));			
			}
		//}
		System.out.println("After removal:"+ls);
		}

}
