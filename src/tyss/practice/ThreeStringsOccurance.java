package tyss.practice;

import java.util.Scanner;

public class ThreeStringsOccurance {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st sentance");
		String s= sc.nextLine();
		System.out.println("Enter 2nd sentance");
		String st= sc.nextLine();
		System.out.println("Enter a word");
		String w= sc.next();
		String s1=s.concat(" "+st);
		String[] str=s1.split(" ");
		
		int count=0;
		for (int i = 0; i < str.length; i++) {
			if(str[i].equals(w)) {
				count++;
			}
		}
		if(count>0)
			System.out.println(w+"-->"+count);
	}
}