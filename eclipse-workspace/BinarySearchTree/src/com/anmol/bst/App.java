package com.anmol.bst;

public class App {

	public static void main(String[] args) {
		
//		Tree<Integer> bst = new BinarySearchTree<>();
//		
//		bst.insert(10);
//		bst.insert(5);
//		bst.insert(15);
//		bst.insert(3);
//		bst.insert(7);
//		
//		bst.delete(10);
//		bst.traversal();
		
		Tree<Person> bst = new BinarySearchTree<>();
		
		bst.insert(new Person("Adam", 27));
		bst.insert(new Person("Kevin", 13));
		bst.insert(new Person("Joe", 67));
		bst.insert(new Person("Micheal", 2));
		bst.insert(new Person("Smith", 11));
				
		bst.traversal();
	}

}
