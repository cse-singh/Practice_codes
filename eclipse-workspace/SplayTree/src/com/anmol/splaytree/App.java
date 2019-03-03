package com.anmol.splaytree;

public class App {

	public static void main(String[] args) {
		
		Tree<Integer> splaytree = new SplayTree<>();
		
		splaytree.insert(10);
		splaytree.insert(-5);
		splaytree.insert(0);
		splaytree.insert(20);
		splaytree.insert(30);
		
		((SplayTree) splaytree).printRoot();
		System.out.println(splaytree.getMax());
	}
}
