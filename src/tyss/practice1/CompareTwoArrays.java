package tyss.practice1;

public class CompareTwoArrays {

	public static void main(String[] args) {
		int[] a= {10,20,30,30};
		int[] b= {30,10,20};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}
			}
		}
		if(count==a.length) {
			System.out.println("Array has same elements");
		}
		else {
			System.out.println("Array doesn't have same elements");
		}
	}

}
