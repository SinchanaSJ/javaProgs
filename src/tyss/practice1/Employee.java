package tyss.practice1;

public class Employee {

	int sal;

	public Employee(int sal) throws NegativeSalaryException  {
		if(sal>0) {
			this.sal = sal;	
			System.out.println("salary " );
		}
		
		else {
			System.out.println("Exception Thrown");
			throw new NegativeSalaryException();
			
	}
	}
	 
}
