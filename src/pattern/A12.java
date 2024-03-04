package pattern;

public class A12 {
public static void main(String[] args) {
	int[] a= {27,45,65,88,100,112,34,65};
	int lar=a[0];
	for(int i=0;i<a.length;i++ )
	{
		
		if(a[i]>lar)
		{
			lar=a[i];
		}
	}
	System.out.println(lar);
}
}
