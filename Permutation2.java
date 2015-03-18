package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Permutation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Permutation2 per2 = new Permutation2();
		System.out.println(per2.solution(new int [] {1,2}));
	}
	
	public ArrayList<ArrayList<Integer>> solution(int [] num){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
		result.add(new ArrayList<Integer> ());
		for(int i=0; i< num.length; i++){
			Set<ArrayList<Integer>> listSet = new HashSet<ArrayList<Integer>> ();
			for(ArrayList<Integer> list : result){
				for(int j=0; j<list.size()+1; j++){
					list.add(j,num[i]);
					ArrayList<Integer> newList = new ArrayList<Integer> (list);
					listSet.add(newList);
					list.remove(j);
				}
			}
			result = new ArrayList<ArrayList<Integer>> (listSet);
		}
		return result;
	}

}
