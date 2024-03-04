package Arrays;

public class Student {
	int sid;
	String Sname;
	int age;
	int count=0;
	Student(){}

	public Student(int sid, String sname, int age) {
		super();
		this.sid = sid;
		Sname = sname;
		this.age = age;
	}
	public void display() {
		System.out.println("***Student Details***");
		//System.out.println("Student "+count++);
		System.out.println("Student id: "+sid);
		System.out.println("Student name: "+Sname);
		System.out.println("Student age: "+age);
		System.out.println("=====================================================");
	}
}
