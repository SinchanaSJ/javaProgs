package tyss.Strings;

public class PrimeNumberRange {

	public static void main(String[] args) {
		for (int j = 2; j < 100; j++) {
			

		int num=j;
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
			
			System.out.println("Prime Number "+j);
		}
		/*else {
			System.out.println("Prime Number "+a[j]);
		}*/
	}
	}
	}


