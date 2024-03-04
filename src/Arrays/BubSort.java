package Arrays;

public class BubSort {

	public static void main(String[] args) {
	int a[]= {12,34,43,10,9,21};
	int n=a.length;
	int temp=0;
	for(int pass=0;pass<(n-1);pass++)
	{
		for(int i=0;i<n-1-pass ;i++) {
			if(a[i]>a[i+1]) {
			temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
		}
	}
	for (int i = 0; i < (a.length); i++) {
		System.out.print(a[i]+" ");
	}
	}

}
