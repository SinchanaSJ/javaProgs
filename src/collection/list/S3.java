package collection.list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class S3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ls=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of fruits: ");
		int n=sc.nextInt();
		System.out.println("Enter the Fruits: ");
		sc.nextLine();
		for(int i=0; i<n; i++)
		{
			ls.add(sc.nextLine());
		}
		System.out.println("Entered Fruits are: ");
		//for(int i=0; i<=n; i++)
		//{
			System.out.println(ls);
		//}
	}

}
