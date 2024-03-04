package tyss.practice;

public class OccuranceWithoutCollection {

	public static void main(String[] args) {
		int [] a= {10,20,15,30,10,15,35,40,10};
		boolean [] b= new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int count=1;
			if(b[i]==false) {
				for (int j = i+1; j < a.length; j++) {				
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(a[i]+"'s Frequency is "+count);
			}
		}

	}

}
