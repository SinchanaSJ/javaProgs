package tyss.practice1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RandomAlphaNumericComb {
	public static void main(String[] args) {
		String s="je12nni56";
		List<String> list = Arrays.asList(s.split(""));
		Collections.shuffle(list);
		String ran="";
		for(String m:list) {
			ran=ran+m;
		}
		System.out.println(ran);
	}
}