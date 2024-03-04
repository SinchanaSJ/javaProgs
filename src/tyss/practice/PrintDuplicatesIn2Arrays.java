package tyss.practice;

public class PrintDuplicatesIn2Arrays {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int []b= {20,90,100,60,70,10};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
