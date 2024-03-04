package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



class Employee{
	int eid;
	String ename;
	double sal;
	
	public Employee() {}
	
	public Employee(int eid, String ename, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + "]";
	}
	
	
	
}

public class EmployeeAccess {

	public static void main(String[] args) {
		ArrayList l=new ArrayList<>();
		l.add(new Employee(1,"ABC",30000));
		l.add(new Employee(2,"PQR",30000));
		l.add(new Employee(3,"XYZ",30000));
		l.add(new Employee(4,"MNO",30000));
		l.add(new Employee(5,"STU",30000));
		
		//using get int index 
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		System.out.println();
		//using for each
		for (Object object : l) {
			System.out.println(object);
		}
		System.out.println();
		//using iterator
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			//it.remove();
		}
		//
		//System.out.println(l);
		System.out.println();
		ListIterator li = l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next()); 
		}
		
	}

}
