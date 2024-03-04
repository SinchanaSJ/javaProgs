package Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a= {20,5,12,23,40,25};
		for (int i = 0; i < a.length-1; i++) {
			int pos=i;
			for (int j = i+1; j < a.length; j++) {
				if(a[pos]>a[j]) {
					pos=j;
				}
			}
			if(pos!=i) {
				int temp=a[pos];
				a[pos]=a[i];
				a[i]=temp;
			}
			
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}

	}

}
