package com.chainsys.collections;

import java.util.ArrayList;
import java.util.List;


public class PracticeList {

	public static void main(String[] args) {

		
		List<Integer> alist = new ArrayList<>();
		for (int i = 1; i <= 10; i++)
		alist.add(i);
		alist.remove(4);
		System.out.println(alist);

		List<String> alist1 = new ArrayList<>();
		alist1.add("java");
		alist1.add("language");
		alist1.add(1, "is");
		for (int i = 0; i < alist1.size(); i++) {
			System.out.print(alist1.get(i) + " ");
		}	
	}

}
