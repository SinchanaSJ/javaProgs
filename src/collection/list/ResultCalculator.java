package collection.list;
import java.util.Scanner;

public class ResultCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter physics marks");
		int p=sc.nextInt();
		System.out.println("enter chemistry marks");
		int c=sc.nextInt();
		System.out.println("enter maths marks");
		int m=sc.nextInt();
		System.out.println("enter biology marks");
		int b=sc.nextInt();
		if(p>=35 && c>=35 && m>=35 && b>=35)
		{
			double per=(p+c+m+b)/4;
			if(per>=85)
			{
				System.out.println("Distinction");
			}
			else if(per>=70)
			{
				System.out.println("First class");
			}
			else if(per>=60)
			{
				System.out.println("Second class");
			}
			else
			{
				System.out.println("Just pass");
			}
			
		}
		else {
			System.out.println("fail");
		}
	}

}
