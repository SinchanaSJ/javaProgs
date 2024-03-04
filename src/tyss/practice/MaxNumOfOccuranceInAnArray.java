package tyss.practice;

import java.util.ArrayList;

public class MaxNumOfOccuranceInAnArray {
	public static void main(String[] args) {
		int[] a= {1,1,2,1,2,2,3,3,3,3,4,2,2,4,5,5,3};
		int maxCount=0;
		int maxNum=0;
		for (int i = 0; i < a.length; i++) {
			int count=0;
			for (int j = 0; j < a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxCount) {
				maxCount=count;
				maxNum=a[i];
			}
		}
		System.out.println("Number "+maxNum+" has repeated for "+maxCount+" number of times");
	}
} 