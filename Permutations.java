package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
	List<ArrayList<Integer>> perms = new ArrayList<ArrayList<Integer>> ();
	
//  leetcode url:https://oj.leetcode.com/problems/permutations/
//	Given a collection of numbers, return all possible permutations.
//
//			For example,
//			[1,2,3] have the following permutations:
//			[1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutations perm = new Permutations();
		System.out.println(perm.solution(new int [] {1,2,3}));
	}

	public List<ArrayList<Integer>> solution(int [] num){
		ArrayList<ArrayList<Integer>> returnList = new ArrayList<ArrayList<Integer>>();
		returnList.add(new ArrayList<Integer>());//initialize a {} to add the first digit 1
	 
		for (int i = 0; i < num.length; i++) {
			Set<ArrayList<Integer>> currentSet = new HashSet<ArrayList<Integer>>();
			for (List<Integer> l : returnList) {
				for (int j = 0; j < l.size() + 1; j++) {//size()+1 in order to place new digit in every position
					l.add(j, num[i]);//add the new digit to all position in the current arraylist{1,2}, {2,1} sepreately
					System.out.println(l);
					ArrayList<Integer> T = new ArrayList<Integer>(l);//assign the current arraylist to new arraylist to put in set
					l.remove(j); //looping in returnList so have to keep l the same in this inner for loop
					System.out.println(l);
					currentSet.add(T);//for 1,2 add {{1,2},{2,1}} seperately
				}
			}
			System.out.println(currentSet);
			returnList = new ArrayList<ArrayList<Integer>>(currentSet);//give current set to current returnList and keep unique using hashset avoid case like{1,2,1} 
		}
	 
		return returnList;
	}
	
}
