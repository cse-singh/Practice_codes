package AnmolCollection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	/* HashMap = An object that maps keys to values.
	 * a map cannot contain duplicate keys.
	 * each key can map atmost one value.
	 * 
	 * some map implementations, like the TreeMap class, make
	 * specific guarantee as to their order.
	 * 			others like HashMap class --> do not
	 * 
	 *  	TreeMap: It is sorted
	 *  	HashTable: it is synchronized + it is slow
	 *  	HashMap: does not synchronized
	 *  		HashTable does not allow null keys or values.
	 *  		HashMap allows one null key and any number of null values
	 *  
	 *  HashFunction -> = O(1)
	 */
	
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		 map.put("adamuser", "adamuser@gmail.com");
		 map.put("kevinuser", "kevin@gmail.com");
		 map.put("anna", "anna@gmail.com");
		 
		 System.out.println(map.get("adamuser"));
	}
}
