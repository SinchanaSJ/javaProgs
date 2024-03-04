package tyss.practice;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class PrintReversed2DigitNumInAString {
	public static void main(String[] args) {
		String s="Aabb1235dd45ee1ff44";
		ArrayList <Integer> list= new ArrayList<>();//1235 45
		int num=0;//1235 //0 //45 //0 //44
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				int n=s.charAt(i)-48;
				num=(num*10)+n; //1235 //45 //44
			}
			else if(num>0) {
				list.add(num);
				num=0;
			}
		}
		if(num>0) {
			list.add(num);
		}
		for (int i = list.size()-1; i>=0; i--) {
			if(i>0)
			System.out.print(list.get(i)+",");
			else
				System.out.println(list.get(i));
		}
	}
}