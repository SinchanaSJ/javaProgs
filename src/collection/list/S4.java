package collection.list;
import java.util.*;
class Employee{
	int eid;
	String name;
	double sal;
	public Employee() {}
	public Employee(int eid, String name, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}


public class S4 {
	public static void main(String[] args) {
		
	ArrayList emp=new ArrayList();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the no of employee");
	int size=s.nextInt();
	System.out.println("Enter the details: ");
	while(size>0)
	{
		System.out.println("Enter Emp id: ");
		int eid=s.nextInt();
		s.nextLine();
		System.out.println("Enter the name: ");
		String name=s.nextLine();
		System.out.println("Enter the Salary: ");
		double sal=s.nextDouble();
		Employee e=new Employee(eid,name,sal);
		System.out.println("Employee Object created for States: "+eid+" "+name+" "+sal);
		emp.add(e);
		System.out.println("Employee object Created");
		size--;
	}
	System.out.println(emp);
	}

}
