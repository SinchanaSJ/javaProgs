package collection.list;
import java.util.*;

class Employee1{
	int eid;
	String name;
	double sal;
	double comm;
	String desg;
	public Employee1() {
		super();
	}
	public Employee1(int eid, String name, double sal, double comm, String desg) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.comm = comm;
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", name=" + name + ", sal=" + sal + ", comm=" + comm + ", desg=" + desg + "]";
	}
	public String Add() {
		return "Employee1 [eid=" + eid + ", name=" + name + ", sal=" + sal+(sal*comm/100) + ", comm=" + comm + ", desg=" + desg + "]";
	}
	
	
	
	

}

public class S13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> ls=new ArrayList<>();
Employee1 emp=new Employee1();
		
		ls.add(new Employee1(101,"Smith",20000,8,"Salesman"));
		ls.add(new Employee1(102,"Miller",50000,10,"Manager"));
		ls.add(new Employee1(103,"Jones",350000,0,"Clerk"));
		ls.add(new Employee1(104,"Blake",25000, 7,"Analyst"));
		System.out.println("Before: "+ls);
		
		ListIterator <Employee1> li=ls.listIterator();
	
	//}
	//System.out.println("After removal:"+ls);
	// to add 250 price 
	
	
	while(li.hasNext())
	{
		Employee1 b=li.next();	
		 if(b.desg=="Manager")
		 {
			 li.add(new Employee1(105,"Scott",65000,10,"CEO"));
		 }
		 	//System.out.println(ls.remove(it.next()));			
	}
	System.out.println("After Adding:"+ls);
	
	//to delete java book	
			/*while(li.hasPrevious())
			{
				 Book1 b=li.previous();	
				 if(b.title.equalsIgnoreCase("java"))
				 {
					 li.remove();
				 }
				 	//System.out.println(ls.remove(it.next()));			
			}
		System.out.println("After Removing:"+ls);*/
		
		//to modify id 103 to 108
		while(li.hasPrevious())
		{
			Employee1 b=li.previous();	
			 if(b.comm==0)
			 {
				 li.set(new Employee1(102,"Miller",50000,12,"Manager"));
			 }
			 	//System.out.println(ls.remove(it.next()));			
		}
	
	System.out.println("After Modifying:"+ls);
	
	/*while(li.hasPrevious())
	{
		 Employee1  b=li.previous();	
		 Employee1 b1=li.next();	
		if(b.comm==b1.comm)
		 {
			//li.retainAll(comm);
		 }
		 	//System.out.println(ls.remove(it.next()));			
	}*/
//System.out.println("After Removing:"+ls);
emp.Add();
System.out.println(ls);

	}
}


