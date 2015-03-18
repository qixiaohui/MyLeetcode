package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PremutationSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PremutationSequence perSeq = new PremutationSequence();
		System.out.println(perSeq.solution(3, 2));
	}

	public String solution(int n, int k){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
		List<Integer> queue = new ArrayList<Integer> ();
		result.add(new ArrayList<Integer> ());
		int [] num = new int[n];
		for(int i=1; i<=n; i++){
			num[i-1] =  i;
		}
		for(int i=0; i<num.length;i++){
			Set<ArrayList<Integer>> element = new HashSet<ArrayList<Integer>> ();
			for(ArrayList<Integer> list : result){
				for(int j=0; j<list.size()+1; j++){
					list.add(j,num[i]);
					ArrayList<Integer> tmp = new ArrayList<Integer> (list);
					element.add(tmp);
					list.remove(j);
				}
			result = new ArrayList<ArrayList<Integer>> (element);
			}
		}
		
		for(int i=0; i<result.size(); i++){
			ArrayList<Integer> sequence = result.get(i);
			int sum = 0;
			for(int j=0; j<sequence.size();j++){
				sum+=sequence.get(j)*Math.pow(10, (sequence.size()-j-1));
			}
			queue.add(sum);
		}
		
		Collections.sort(queue);
		
		return Integer.toString(queue.get(k-1)); 
		
	}
}
