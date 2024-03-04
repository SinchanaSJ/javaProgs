package tyss.collections;

public class MaxElementWithoutBBsort {

	public static void main(String[] args) {
		int[] a= {5,3,1,4};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(max<a[i])
				max=a[i];
		}
		System.out.println(max);
	}

}