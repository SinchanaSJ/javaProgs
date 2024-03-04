package tyss.Strings;

public class SumOf2Digits {

	public static void main(String[] args) {
		String s="a10b11c3";//10+11+3=24
		char[] ch = s.toCharArray();
		int sum=0;
		int tsum=0;
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				int num=ch[i]-48;
				tsum=tsum*10+num;
			}
			else {
				sum=sum+tsum;
				tsum=0;
			}
		}
		sum=sum+tsum;
		System.out.println(sum);
		
	}

}
