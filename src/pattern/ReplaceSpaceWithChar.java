package pattern;
import java.util.Scanner;

public class ReplaceSpaceWithChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Strings");
		String s=sc.nextLine();
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		char[] c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]==' ') {
				c[i]=ch;
			}
		}
		s=new String(c);
		System.out.println(s);
		
	}

}
