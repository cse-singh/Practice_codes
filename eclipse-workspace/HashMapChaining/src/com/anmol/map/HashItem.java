package com.anmol.map;

public class HashItem {

	private int key;
	private int value;
	private HashItem nextHashItem;
	
	
	public int getKey() {
		return key;
	}


	public void setKey(int key) {
		this.key = key;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public HashItem getNextHasItem() {
		return nextHashItem;
	}


	public void setNextHasItem(HashItem nextHashItem) {
		this.nextHashItem = nextHashItem;
	}


	public HashItem(int key, int value) {
	
		this.key = key;
		this.value = value;
	}
	
}
