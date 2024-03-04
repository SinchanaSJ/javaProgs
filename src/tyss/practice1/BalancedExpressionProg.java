package tyss.practice1;

public class BalancedExpressionProg {

	public static void main(String[] args) {
		String s="{a+[b+c-n]/(d+[e+f])}";
		char[] ch = s.toCharArray();
		int c1=0;
		int c2=0;
		int c3=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='(') {
				c1++;
			}
			if(ch[i]=='{') {
				c2++;
			}
			if(ch[i]=='[') {
				c3++;
			}
			if(ch[i]==')') {
				c1--;
			}
			if(ch[i]=='}') {
				c2--;
			}
			if(ch[i]==']') {
				c3--;
			}
		}
		if(c1==0 && c2==0 && c3==0) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Not Balanced");
		}
	}

}
