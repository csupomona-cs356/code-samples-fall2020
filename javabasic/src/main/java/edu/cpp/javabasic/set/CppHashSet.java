package edu.cpp.javabasic.set;

import java.util.Collection;
import java.util.HashSet;

public class CppHashSet<E> extends HashSet<E> {
	
	private int counter = 0;

	@Override
	public boolean add(E e) {
		counter++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		counter += c.size();
		return super.addAll(c);
	}

	public int getCounter() {
		return counter;
	}

}
