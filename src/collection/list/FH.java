package collection.list;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class FH {
	public static void main(String[] args) throws IOException {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the path");
		String path="E://JavaEclipse/QA/src/F1.txt";
		FileInputStream fin=new FileInputStream(path);
		int data=fin.read();
		char finalData=(char)data;
		System.out.println(finalData);
		//char ch=sc.next().charAt(0);
		//int ch=sc.nextInt();
		//fout.write(ch);
		//System.out.println("Character is written into a file..!");
		//fout.close();
		//E://JavaEclipse/QA/src
	}

}
