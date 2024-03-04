package Arrays;

public class StudentDriver {

	public static void main(String[] args) {
		
		Student [] s=new Student[5];
		s[0]= new Student(10,"ABC",20);
		s[1]= new Student(11,"XYZ",21);
		s[2]= new Student(12,"PQR",20);
		s[3]= new Student(13,"MNO",22);
		s[4]= new Student(40,"JKL",23);
		for (int i = 0; i < s.length; i++) {
			s[i].display();
		}
	}
	

}
