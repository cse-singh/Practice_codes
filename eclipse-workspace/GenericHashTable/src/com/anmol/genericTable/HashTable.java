package com.anmol.genericTable;

@SuppressWarnings("unchecked")

public class HashTable<Key, Value> {

	private Key[] keys;
	private Value[] values;
	private int numOfItems;
	private int capacity; // it is the max number of items that can be inserted in the table

	public HashTable() {
		this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
		this.values = (Value[]) new Object[Constants.TABLE_SIZE];
		this.capacity = Constants.TABLE_SIZE;
		this.numOfItems = 0;
	}

	public HashTable(int newCapacity) {
		this.keys = (Key[]) new Object[newCapacity];
		this.values = (Value[]) new Object[newCapacity];
		this.capacity = newCapacity;
		this.numOfItems = 0;
	}

	// O(1)
	public int size() {
		return this.numOfItems;
	}

	// 0(1)
	public boolean isEmpty() {
		return this.numOfItems == 0;
	}

	public void remove(Key key) {

		if (key == null)
			return;

		int index = hash(key);

		if (keys[index] == null) 
		{
			System.out.println("no key found at the index");
			return;
		}
		
			while (!keys[index].equals(key)) {
				index = (index + 1) % capacity;
			}

		keys[index] = null;
		values[index] = null;
		numOfItems--;

		while (keys[index] != null) {
			Key tempKey = keys[index];
			Value tempValue = values[index];

			keys[index] = null;
			values[index] = null;
			
			numOfItems--;
			put(tempKey, tempValue);

			index = (index + 1) % capacity;
		}
		

		if (numOfItems <= capacity / 3) {
			System.out.println("Resizing the table halfing the size");
			resize(capacity / 2);
		}
	}

	public void put(Key key, Value value) {

		if (key == null || value == null)
			return;

		if (numOfItems >= capacity * 0.75) {// O(1) --> O(N)
			System.out.println("Doubling the size of the hashTable");
			resize(2 * capacity);
		}

		int index = hash(key);

		while (keys[index] != null) {

			// update
			if (keys[index].equals(key)) {
				values[index] = value;
			}

			index = (index + 1) % capacity;
		}

		keys[index] = key;
		values[index] = value;
		numOfItems++;

	}

	// O(N) conclusion we have to make sure we minimize number of resize operation
	private void resize(int newCapacity) {
		HashTable<Key, Value> newTable = new HashTable<>(newCapacity);

		for (int i = 0; i < capacity; ++i) {
			if (keys[i] != null) {
				newTable.put(keys[i], values[i]);
			}
		}

		keys = newTable.getKeys();
		values = newTable.getValues();
		capacity = newTable.getCapacity();

	}

	public Key[] getKeys() {
		return keys;
	}

	public void setKeys(Key[] keys) {
		this.keys = keys;
	}

	public Value[] getValues() {
		return values;
	}

	public void setValues(Value[] values) {
		this.values = values;
	}

	public int getNumOfItems() {
		return numOfItems;
	}

	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Value get(Key key) {
		if (key == null)
			return null;
		int index = hash(key);

		while (keys[index] != null) {
			if (keys[index].equals(key)) {
				return values[index];
			}
			index = (index + 1) % capacity;
		}

		return null;
	}

	private int hash(Key key) {
		return ((key.hashCode()) % capacity);
	}

}
