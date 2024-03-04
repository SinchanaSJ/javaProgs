package tyss.collections;

public class CheckAscenddingArray {

	public static void main(String[] args) {
		int a[]= {10,2,5,03,52,32};
		//int a[]= {10,20,30};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<=a[i+1]) {
				break;
			}
			else {
				count++;
				
			}
		}
		if(count==0) {
			System.out.println("Ascending");
		}
		else {
			System.out.println("Not");
		}

	}

}
