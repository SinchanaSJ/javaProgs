package tyss.practice;

public class PrintLongestConsecutiveSubStringProg {

	public static void main(String[] args) {
		String s="11001011000111110011";
		int max=0;
		int min=0;
		int maxCount=0;
		int j=0;
		boolean[] b=new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			int count=0;
			if(b[i]==false) {
			for (j = i; j < s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
					b[j]=true;
				}
				else
					break;
				
			}
			if(count>maxCount) {
				min=i;
				maxCount=count;
				max=j;
			}
			
		}
		}
		System.out.println(s.substring(min,max));
	}

}
