package tyss.collections;

import java.util.LinkedHashMap;

public class OccuranceInInteger {

	public static void main(String[] args) {
//		int n=123123123;
//		HashMap<Integer, Integer> map= new HashMap<>();
//		while(n>0) {
//			int rem=n%10;
//			if(map.containsKey(rem)) {
//				map.put(rem, map.get(rem)+1);
//			}
//			else {
//				map.put(rem, 1);
//			}
//			n=n/10;
//		}
//		for (Entry<Integer, Integer> s : map.entrySet()) {
//			System.out.println(s.getKey()+"-->"+s.getValue());
//			
//		}
		
		int [] a={10,20,10,50,40,20,10};
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
               map.put(a[i], map.get(a[i])+1); 
            }
            else{
                map.put(a[i],1);
            }
        }
        System.out.println(map);
	}

}
