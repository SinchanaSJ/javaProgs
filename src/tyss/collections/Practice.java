package tyss.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;



public class Practice {
public static void main(String[] args) {
	List<Object> li=new ArrayList<Object>();
	li.add("abc");
	li.add(2);
	li.add("abc");
	li.add(2);
	li.add(null);
	System.out.println(li);
	System.out.println();
	
	ArrayList al = new ArrayList<>();
	al.add("xyz");
	al.add(5);
	al.add(null);
	al.add(5);
	al.add(null);
	System.out.println("Iterator");
	Iterator<Object> it= al.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println();
	System.out.println(al);
	System.out.println(al.size());
	System.out.println();
	
	LinkedList<Object> ll=new LinkedList<Object>();
	ll.add("xyz");
	ll.add(5);
	ll.add("pond");
	ll.add(null);
	ll.add(51);
	ll.add(15);
	ll.add(21);
	ll.add(22);
	System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	
	System.out.println();
	PriorityQueue<Object> pq = new PriorityQueue<Object>();
	//pq.add("xyz");
	pq.add(5);
	//pq.add("pond");
	//pq.add(null);
	pq.add(51);
	pq.add(15);
	pq.add(21);
	pq.add(22);
	System.out.println(pq);
	System.out.println(pq.peek());
	System.out.println(pq);
	System.out.println(pq.poll());
	System.out.println(pq);
	
System.out.println();
	HashSet<Object> hs = new HashSet<>();
	System.out.println("Hash set");
	hs.add("xyz");
	hs.add(5);
	hs.add("pond");
	hs.add(null);
	hs.add(51);
	hs.add(15);
	hs.add(51);
	hs.add(15);
	hs.add(21);
	hs.add(22);
	System.out.println(hs);
	System.out.println();
	
	LinkedHashSet<Object> lhs= new LinkedHashSet<>();
	lhs.add("xyz");
	lhs.add(5);
	lhs.add("pond");
	lhs.add(null);
	lhs.add(51);
	lhs.add(15);
	lhs.add(51);
	lhs.add(15);
	lhs.add(21);
	lhs.add(22);
	System.out.println(lhs);
	System.out.println();
	
	TreeSet<Object> ts = new TreeSet<>();
	ts.add(20);
	ts.add(5);
	ts.add(10);
	ts.add(30);
	ts.add(51);
	System.out.println(ts);
	
	System.out.println();
	Hashtable<Object, Object> ht = new Hashtable<>();
	ht.put(1, "ABC");
	ht.put(2, "XYZ");
	ht.put(3, "PQR");
	ht.put(4, "UVW");
	System.out.println(ht);
	for (Entry<Object, Object> m : ht.entrySet()) {
		System.out.println(m.getKey()+"-->"+m.getValue());
		
	}
	
	System.out.println();
	
	HashMap<Object, Object> h = new HashMap<>();
	h.put(1, "hi");
	h.put(4, "hello");
	h.put(3, "bye");
	h.put(null, "good bye");
	h.put(null, "good bye");
	h.put("hell", "get lost");
	h.put(8, "get lost");
	System.out.println(h);
	for (Entry<Object, Object> s : h.entrySet()) {
		System.out.println(s.getKey()+"-->"+s.getValue());
		
	}
	
	TreeMap<Object, Object> hm = new TreeMap<Object, Object>();
	hm.put(1, "hi");
	hm.put(4, "hello");
	hm.put(3, "bye");
	//hm.put(null, "good bye");
	//hm.put(null, "good bye");
	hm.put(0, "get lost");
	hm.put(8, "get lost");
	System.out.println(hm);
	for (Entry<Object, Object> s : hm.entrySet()) {
		System.out.println(s.getKey()+"-->"+s.getValue());
		
	}
}
}
