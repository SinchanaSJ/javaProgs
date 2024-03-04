package tyss.collections;

public class Find1st2ndMaxNumWithoutBsort {

	public static void main(String[] args) {
		int [] a= {100,100,5,20,18,3}; 
		int fmax=0;
		int smax=0;
		for (int i = 0; i < a.length; i++) {
			if(a[i]>=fmax) {
				if(a[i]!=fmax)
				smax=fmax;
				fmax=a[i];
			}
			else if(a[i]>smax||fmax==smax) {
				smax=a[i];
			}
		}
		System.out.println(fmax);
		System.out.println(smax);
	}
}