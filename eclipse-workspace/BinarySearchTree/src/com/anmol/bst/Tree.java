package com.anmol.bst;

public interface Tree<T> {
	public void traversal();
	public void insert(T data);
	public void delete(T data);
	public T getMinValue();
	public T getMaxValue();

	
}
