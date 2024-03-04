package tyss.Strings;

public class A {

	public static void main(String[] args) {
		int[] a= {100,10,12,5,4,15,16};
		int fmax=0;
		int smax=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>fmax) {
				
				smax=fmax;
				fmax=a[i];
			}
			else if(smax<a[i]) {
				smax=a[i];
				
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}

}
