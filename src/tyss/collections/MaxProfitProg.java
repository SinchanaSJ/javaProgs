package tyss.collections;

public class MaxProfitProg {

	public static void main(String[] args) {
		int a[]= {7,1,5,3,6,4};
		int ind=0;
		int min=a[ind];
		for (int i = 0; i < a.length; i++) {
			if(min>a[i]) {
				min=a[i];
				ind=i;
			}
		}
		int max=a[ind];
		for (int i = ind; i < a.length; i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		int num=max-min;
		if(num>0) {
			System.out.println("Minimum CP "+a[ind]+" leads to the Profit of "+num);
		}
		else {
			System.out.println("No Profit");
		}
		
		}

}
