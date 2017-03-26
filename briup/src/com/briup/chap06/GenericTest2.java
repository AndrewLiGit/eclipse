package com.briup.chap06;

public class GenericTest2<K,V> {
	private K key;
	private V value;

	public void setKey(K key) {
		this.key = key;
	}
	public K getKey() {
		return key;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public V getValue() {
		return value;
	}
	public void put(K key,V value) {
		this.key = key;
		this.value = value;
	}
	public static void main(String args[]) {
		GenericTest2<Integer,String> gt = 
			new GenericTest2<Integer,String>();
		gt.put(1,"hello");
		Integer i = gt.getKey();
		String str = gt.getValue();
		System.out.println("key:"+i+" value:"+str);
	}
}
