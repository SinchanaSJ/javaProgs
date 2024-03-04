package tyss.Strings;

public class ReverseString {
public static void main(String[] args) {
	String s="Banglore";
	String s1="";
	/*
	 * 1. char[] ch=s.toCharArray();
	 
	for (int i = ch.length-1; i>= 0; i--) {
		s1=s1+ch[i];
	}*/
	
	/*
	 * 2. using charAt
	 * for (int i = ch.length-1; i>= 0; i--) {
		System.out.print(s.charAt(i));
	}
	System.out.println();
	System.out.println(s1);*/
	
	
	
	//3. Third variable and by using charAt
/*	for (int i = s.length()-1; i>= 0; i--) {
		s1=s1+s.charAt(i);
	}
	System.out.println(s1);*/
	
	//4. using count variable
	char [] st=s.toCharArray();
	int count=0;
	for (char c : st) {
		count++;
	}
	for (int i = count-1; i >=0; i--) {
		System.out.print(st[i]);
	}
	System.out.println();
	//5. using string buffer
	StringBuffer sb=new StringBuffer("Banglore");
	System.out.println(sb.reverse());
}
}
