package com.leetcode.xiaohui;

import java.util.LinkedHashMap;

public class LRUCache {

	LinkedHashMap<Integer, Integer> map;
	int max = 0;
	int tmp = 0;
	int size = 0;
	static int cap;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public LRUCache(int capacity) {
		cap = capacity;
		map = new LinkedHashMap<Integer, Integer>();
	}

	public int get(int key) {
		if (map.containsKey(key)) {
			int result = map.get(key);
			map.remove(key);
			map.put(key, result);
			return result;
		} else {
			return -1;
		}
	}

	public void set(int key, int value) {
		if (map.containsKey(key)) {
			map.remove(key);
			map.put(key, value);
		} else {
			if (size >= cap) {
				for (int keyset : map.keySet()) {
					map.remove(keyset);
					break;
				}
				map.put(key, value);
			} else {
				size++;
				map.put(key, value);
			}
		}
	}
}
