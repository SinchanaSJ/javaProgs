package tyss.collections;

public class ReverseEvenPositionWords {

	public static void main(String[] args) {
		String s= "welcome to TYSS office banglore";
		String[] str=s.split(" ");
		String temp="";
		for(int i=0;i<str.length;i++){
		     String st=str[i];
		   if(i%2==0){
		    String rev="";
		    for(int j=st.length()-1;j>=0;j--){
		        rev=rev+st.charAt(j);
		    }
		    temp=temp+rev+" ";
		}
		else{
		     temp=temp+st+" ";
		}
	}
		System.out.print(temp);
	}
}