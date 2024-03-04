package tyss.Strings;

import java.util.LinkedHashSet;

public class StringProg {

	public static void main(String[] args) {
		int[] a={10,11,12,13,11,10};
		   LinkedHashSet<Integer> set=new LinkedHashSet<>();
		   for(int i=0; i<a.length;i++){
		       set.add(a[i]);
		   }
		   for(Integer s: set){
		       int count=0;
		       for(int i=0;i<a.length;i++){
		    	   if(a[i]==s){
		               count++;
		           }
		       }
		           if(count==1){
		              System.out.print(s+" --> "+count+" ");
		           }
		        
}
	}
}
