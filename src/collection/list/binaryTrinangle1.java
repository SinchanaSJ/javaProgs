package collection.list;;

public class binaryTrinangle1 {

	public static void main(String[] args) {
int n=5; 
for(int i=1;i<=n;i++) {
	for(int j=1;j<=n-i;j++) {
		System.out.print("  ");
	}char ch='A';
	for(int j=1;j<=(2*i)-1;j++) {
		if(j%2==1)
			System.out.print("0 ");
		else 
			System.out.print("1 ");
	}
	System.out.println();
}
	}

}
