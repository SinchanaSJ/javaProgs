package tyss.Strings;

public class PrimeNumInAnArray {

	public static void main(String[] args) {
		int[] a= {4,5,2,3,6,8,9,11};
		for (int j = 0; j < a.length; j++) {
			int num=a[j];
			int i=2;
			int count=0;
			while(i<=num/2) {
				if(num%i==0) {
					count++;
					break;
				}
				i++;
			}
			if(count==0) {
				
				System.out.println("Prime Number "+a[j]);
			}
			/*else {
				System.out.println("Prime Number "+a[j]);
			}*/
		}

	}

}
