package Arrays;

public class A8 {
	public static void main(String[] args) {	
	int [] a= {10,25,20,30,35,45};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]%2==0)
		sum=sum+a[i];
	}
	System.out.println(sum);

}

}
