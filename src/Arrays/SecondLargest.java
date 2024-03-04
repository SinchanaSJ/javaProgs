package Arrays;

public class SecondLargest {
public static void main(String[] args) {
	int[] a= {27,45,65,88,100,112,34,65};
	int temp=0;
	for(int i=0;i<a.length;i++ )
	{
		for (int j = i+1; j < a.length; j++) {
			
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
		}
	}
		
	}
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println(a[a.length-3]);
}
}
