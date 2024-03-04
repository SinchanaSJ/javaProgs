package tyss.collections;

import java.util.Scanner;

public class ColourProg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the colour");
		   String st=sc.nextLine();
		   String s=st.toLowerCase();
		   /*switch(s){
		       case "red":System.out.println("#f00"); break;
		       case "green":System.out.println("#0f0"); break;
		       case "blue":System.out.println("#00f"); break;
		       case "cyan":System.out.println("#0ff");
		   }*/
		   if(s.equals("red")) {
			   System.out.println("#f00");
		   }
		   else if(s.equals("green")) {
			   System.out.println("#0f0");
		   }
		   else if(s.equals("blue")) {
			   System.out.println("#00f");
		   }
		   else if(s.equals("cyan")) {
			   System.out.println("#0ff");
		   }
		   
	}
}
