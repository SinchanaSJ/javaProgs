package tyss.Strings;

public class TestProg {

	public static void main(String[] args) {
		int num=19;
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
			System.out.println(num);
		}
	}

}
