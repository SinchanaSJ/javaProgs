package collection.list;
import java.util.*;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1. for Addition");
		System.out.println("Enter 2. for Subtraction");
		System.out.println("Enter 3. for Multiplication");
		System.out.println("Enter 4. for Division");
		System.out.println("Enter 5. for Exit");
		int i=sc.nextInt();
		System.out.println("Enter the one value ");
		int a=sc.nextInt();
		System.out.println("Enter the another value ");
		int b=sc.nextInt();
		int f=1;
		
		while(f==1)
		{
			int res=0;
		switch(i)
		{
		case 1: res=a+b;
				break;
		case 2: res=a-b;
		break;
		case 3: res=a*b;
		break;
		case 4: res=a/b;
		break;
		case 5: f=f++;
		break;
		default: System.out.println("please enter from 1 to 5");
		//return;
		}
		System.out.println(res);
	
	}
		
		
	}
	//System.out.println();

}
