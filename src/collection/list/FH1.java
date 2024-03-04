
package collection.list;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class FH1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the path");
		String path=sc.nextLine();
		FileOutputStream fout=new FileOutputStream(path+"/F1.txt");
		
		System.out.println("Enter the input to be written");
		//char ch=sc.next().charAt(0);
		int ch=sc.nextInt();
		fout.write(ch);
		System.out.println("Character is written into a file..!");
		fout.close();
		//E://JavaEclipse/QA/src
	}

}
