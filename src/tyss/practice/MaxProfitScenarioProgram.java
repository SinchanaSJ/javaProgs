package tyss.practice;

public class MaxProfitScenarioProgram {

	public static void main(String[] args) {
		int[] a= {7,1,5,3,6,4};
		int ind=0;
		int min=a[ind];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min) {
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
			System.out.println("Minimum CP "+min+ ", Maximum SP "+max+" leads to the Profit of "+num);
		}
		else {
			System.out.println("No Profit");
		}
	}
}