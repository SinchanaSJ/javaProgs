package tyss.practice;

import java.util.Arrays;

public class RemoveDuplicatesAndSortWithoutCollection {

	public static void main(String[] args) {
		String s="sinchana";
		char[] a=s.toCharArray();
		boolean[] b=new boolean[a.length];
		String str="";
		for(int i=0;i<b.length;i++) {
			if(b[i]==false) {
				str=str+a[i];
				for(int j=i+1;j<b.length;j++) {
					if(a[i]==a[j]) {
						b[j]=true;
					}
			}	
		}
	}
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}
}