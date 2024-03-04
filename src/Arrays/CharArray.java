package Arrays;

import java.util.Scanner;

public class CharArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		char [] ch=new char[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			ch[i]=sc.next().charAt(0);
			
		}
		for (int i = 0; i < ch.length; i++) {
			
			System.out.println(ch[i]);
		}

	}

}
