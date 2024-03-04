package collection.list;

public class EvenOdd {

	public static void main(String[] args) {
	int n=11;
/*String [] s= {"Even","Odd"};

System.out.println(s[n%2]);*/
	
	
	int res=n%2;
	switch(res)
	{
	case 1: System.out.println("Odd");
	break;
	case 0: System.out.println("Even");
	}
	}
}
