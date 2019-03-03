package anmol.avl;

public class App {

	public static void main(String[] args) {
		
		Tree<String> avl = new AvlTree<>();
		
		avl.insert("a");
		avl.insert("c");
		avl.insert("b");
//		avl.insert();
		
//		avl.delete();
		
		avl.traverse();
		
		
	}
	
}
