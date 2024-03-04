package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		 int [] a = {10,20,30,40,50,60};  
		 System.out.println("Given array:");
		 
		 int n=a.length;
	     int start = 0, end = n-1;
	     for(int i=0; i<n; i++)
		       System.out.print(a[i]+" "); 
	     System.out.println();
	     
	     while(start<end){
	        int temp = a[start];
	        a[start]=a[end];
	        a[end]=temp;
	        start++;
	        end--;
	     }
	     System.out.println("Reversed array:");
	    for(int i=0; i<n; i++)
	       System.out.print(a[i]+" "); 
	}

}
