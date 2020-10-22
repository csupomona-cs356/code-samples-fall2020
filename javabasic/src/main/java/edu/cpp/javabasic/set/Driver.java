package edu.cpp.javabasic.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Driver {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("a");
		myList.add("d");
		myList.add("e");
		
		Set<String> mySet = new CppHashSet2<>(); // new CppHashSet<>(); //new HashSet<>();
		mySet.add("a");
		mySet.add("a");
		mySet.add("b");
		mySet.add("c");
		
		mySet.addAll(myList);
		
		System.out.println(mySet);
		System.out.println(((CppHashSet2)mySet).getCounter());

	}

}
