package tyss.collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class ReverseStringWithoutLoops {
 //recursion concept
	public static void main(String[] args) {
		String s="abcd";
		//int count=s.length()-1;
		rev(s,s.length()-1);
				
	}
	public static void rev(String s, int i) {
		if(i>=0) {
			System.out.print(s.charAt(i--));
			rev(s,i);
		}
		
//		String str="O9 Solutions";
//        String st=str.toLowerCase();
//        String s=st.replace(" ", "");
//        LinkedHashMap<Character, Integer> map= new LinkedHashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//			if(map.containsKey(s.charAt(i))) {
//				map.put(s.charAt(i), map.get(s.charAt(i))+1);
//			}
//			else {
//				map.put(s.charAt(i),1 );
//			}
//		}
//     //   System.out.println(map);
//        for(Entry<Character,Integer> e: map.entrySet()) {
//        	if(e.getValue()==1) {
//        		System.out.println(e.getKey()+" ");break;
//        		
//        	}
////        	if(e.getValue()>1) {
////        		System.out.println(e.getKey());
////        	}
//        }
//        for(Entry<Character,Integer> e: map.entrySet()) {
//        	if(e.getValue()>1) {
//        		System.out.println(e.getKey());
//        		break;
//        	}
//        }
        
	}

}
