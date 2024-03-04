package tyss.practice;

public class AdditionOf2ArrayByTakingCarry {

	public static void main(String[] args) {
		int[]a= {4,8,5,9};//338,2,9,1
		int[]b= {333,4,1,22};
		int[]c=new int[b.length];
		int n=0;
		for(int i=c.length-1;i>=0;i--) {
			if(i>0) {
			int num=a[i]+b[i];
			int rem=num%10;
			if(n>0) {
				c[i]=rem+n;
			}
			else {
				c[i]=rem;
			}
			n=num/10;
			}
			else {
				 c[i]=a[i]+b[i]+n;
			}
		}
		for (int i = 0; i < c.length; i++) {
			if(i<c.length-1)
				System.out.print(c[i]+",");
			else
				System.out.print(c[i]);
		}
		System.out.println();
	}
}