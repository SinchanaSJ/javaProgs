package Arrays;

public class Smallest {
public static void main(String[] args) {
	int[] a= {27,45,65,88,100,112,34,65};
	int small=a[0];
	for(int i=0;i<a.length;i++ )
	{
		
		if(a[i]<small)
		{
			small=a[i];
		}
	}
	System.out.println(small);
}
}
