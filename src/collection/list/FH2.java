
package collection.list;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class FH2 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the path");
		String path="E://JavaEclipse/QA/src/F1.txt";
		FileOutputStream fout=new FileOutputStream(path);
		String data="All the best";
		byte[] b=data.getBytes();
		//char ch=sc.next().charAt(0);
		//int ch=sc.nextInt();
		fout.write(b);
		System.out.println("Done!!!!!");
		//fout.close();
		//E://JavaEclipse/QA/src
	}

}
