package com.anmol.map;

public class HashTable {

	private HashItem[] hashTable;

	public HashTable() {
		hashTable = new HashItem[Constants.TABLE_SIZE];
	}

	public int get(int key) {

		int generatedArrayIndex = hash(key);

		if (hashTable[generatedArrayIndex] == null) {
			return -1;
		} else {

			HashItem hashItem = hashTable[generatedArrayIndex];

			while (hashItem != null && hashItem.getKey() != key) {
				hashItem = hashItem.getNextHasItem();

			}

			if (hashItem == null) {
				return -1;
			} else {
				return hashItem.getValue();
			}
		}
	}

	public void put(int key, int value) {

		int hashArrayIndex = hash(key);

		if (hashTable[hashArrayIndex] == null) {
			System.out.println("No Collision Simple insertion into hash table.");
			hashTable[hashArrayIndex] = new HashItem(key, value);
		} else {
			System.out.println("Collision with key" + key);
			HashItem hashItem = hashTable[hashArrayIndex];

			while (hashItem.getNextHasItem() != null) {
				hashItem = hashItem.getNextHasItem();
				System.out.println("Considering the next value in linked list" + hashItem.getValue());
			}
			System.out.println("Finally we have found the place to insert.....");
			hashItem.setNextHasItem(new HashItem(key, value));
		}
	}

	private int hash(int key) {
		return key % Constants.TABLE_SIZE;
	}
}
