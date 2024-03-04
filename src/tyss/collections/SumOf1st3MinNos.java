package tyss.collections;

public class SumOf1st3MinNos {

	public static void main(String[] args) {
		int[] a= {5,3,1,4};
		int temp=0;
		int sum=0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];
			
		}
		System.out.println(sum);
	}

}
