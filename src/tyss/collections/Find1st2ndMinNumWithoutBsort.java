package tyss.collections;

public class Find1st2ndMinNumWithoutBsort {

	public static void main(String[] args) {
		int [] a= {0,5,20,18,3}; 
		int fmin=a[0];
		int smin=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<fmin) {
				if(a[i]!=0)
				smin=fmin;
			fmin=a[i];
			}
			else if(smin==fmin||a[i]<smin) {
				smin=a[i];
			}
		}
		System.out.println(fmin);
		System.out.println(smin);
		
	}

}
