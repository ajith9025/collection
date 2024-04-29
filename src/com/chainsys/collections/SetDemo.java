package com.chainsys.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class SetDemo {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("ajith");
		s.add("mani");
		s.add("vishnu");
		s.add("karthik");
		System.out.println(s);
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("C");
		System.out.println(s);
		System.out.println("intial hashset:" + s);
		s.remove("ajith");
		System.out.println("after the removing  element:" + s);

		Set<String> s1 = new HashSet<String>();
		s1.add("ajith");
		s1.add("kumar");
		s1.add("hari");
		System.out.println(s1);
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("ajith"));
		
		Set<Integer> s2 = new LinkedHashSet<Integer>();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(50);
		s2.add(60);
		System.out.println("Set: " + s2);


		s.clear();
		System.out.println(s);

		Queue<String> q = new LinkedList<>();
		q.add("c");
		q.add("a");
		q.add("b");
		System.out.println(q);
		q.remove("a");
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.peek());
		
		
		Map<Integer,String> hs=new HashMap<>();
		hs.put(1, "ajith");
		hs.put(2, "mani");
		hs.put(3, "vishnu");
		hs.put(4,"kishor");
		System.out.println("intial hashmap:" + hs);
		hs.remove(4);
		System.out.println("after removing the hashmap:"+hs);
	    System.out.println(hs.containsKey(2));
	    System.out.println(hs.get(2));
	    System.out.println(hs.containsValue("mani"));
	    System.out.println(hs.isEmpty());
	    System.out.println(hs.entrySet());
	    System.out.println(hs.keySet());
	    System.out.println(hs.values());
	    

		Map<Integer,String> ts=new TreeMap<>();
		ts.put(1, "ajith");
		ts.put(4, "mani");
		ts.put(3, "vishnu");
		ts.put(2,"kishor");
		System.out.println("intial treemap:" + ts);
		ts.remove(4);
		System.out.println("after removing the treemap:"+ts);
	    System.out.println(ts.containsKey(2));
	    System.out.println(ts.get(2));
	    System.out.println(ts.containsValue("mani"));
	    System.out.println(ts.isEmpty());
	    System.out.println(ts.entrySet());
	    System.out.println(ts.keySet());
	    System.out.println(ts.values());
		
		
		
	}

}
