package collection.list;

import java.util.Scanner;

public class CalenderProg {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the month in the form of number");
		int mon = sc.nextInt();
		switch(mon)
		{
			case 1: System.out.println("January -- No. of days: 31");
			break;
			case 2: System.out.println("February -- No. of days: 28 or 29");
			break;
			case 3: System.out.println("March -- No. of days: 31");
			break;
			case 4: System.out.println("April -- No. of days: 30");
			break;
			case 5: System.out.println("May -- No. of days: 31");
			break;
			case 6: System.out.println("June -- No. of days: 30");
			break;
			case 7: System.out.println("July -- No. of days: 31");
			break;
			case 8: System.out.println("August -- No. of days: 31");
			break;
			case 9: System.out.println("September -- No. of days: 30");
			break;
			case 10: System.out.println("Octomber -- No. of days: 31");
			break;
			case 11: System.out.println("November -- No. of days: 30");
			break;
			case 12: System.out.println("December -- No. of days: 31");
			break;
		}

	}

}
