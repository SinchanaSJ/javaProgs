package Arrays;
//import strings.ConcatProg;
import java.util.Scanner;

public class A1 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the size");
	int size=sc.nextInt();
	int [] a=new int [size];
	System.out.println("Enter the elements");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Entered elements");
	for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		
	}
	sc.close();
}
}
