package com.leetcode.xiaohui;

//leetcode url: https://oj.leetcode.com/problems/search-for-a-range/
//Given a sorted array of integers, find the starting and ending position of a given target value.
//
//Your algorithm's runtime complexity must be in the order of O(log n).
//
//If the target is not found in the array, return [-1, -1].
//
//For example,
//Given [5, 7, 7, 8, 8, 10] and target value 8,
//return [3, 4].

public class SearchRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchRange range = new SearchRange();
		int [] results = range.search(new int [] {5,7,7,8,8,10}, 8);
		for(int result : results){
			System.out.println(result);
		}
	}

	public int[] search(int[] A, int target){
		int [] result = new int []{-1,-1};
		for(int i=0; i<A.length ; i++){
			if(A[i] == target){
				if(result[0] == -1){
					result[0] = i;
					result[1] = i;
				}else{
					result[1] = i;
				}
			}
		}
		return result;
	}
}
