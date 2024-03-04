package strings;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Password");
		String s=sc.nextLine();
		int up = 0; int low=0; int digit=0;
		int sp=0;int space=0;
		char[] ch = s.toCharArray();
		if(s.length()>=8 && s.length()<=15) {
			for (int i = 0; i < ch.length; i++) {
				char c=ch[i];
				if(c>='A' && c<='Z')
					up++;
				else if(c>='a' && c<='z')
					low++;
				else if(c>='0' && c<='9')
					digit++;
				else if(c==' ')
					space++;
				else if(c=='!'||c=='#'||c=='@'||c=='$')
					sp++;
				
			}
			if(up>=1 && low>=1 && space==0 && sp>=1)
				System.out.println("Correct password");
			else
				System.out.println("Incorrect password");
		}
		else {
			System.out.println("Incorrect password");
			System.out.println("Password should contain 8 to 15 characters");
		}
		
			
		
	}

}
