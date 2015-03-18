package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution(6,4));
	}
	
	public static ArrayList<ArrayList<Integer>> Solution(int n, int k){
		//to make sure all the combinations are unique
		HashSet<ArrayList<Integer>> holder = new HashSet<ArrayList<Integer>> ();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for(int i=1; i<=k; i++){
			ArrayList<Integer> item = new ArrayList<Integer> ();
			findResult(holder,i,k,n,item);
		}
		for(ArrayList<Integer> item :holder){
			result.add(item);
		}
		return result;
	}
	
	public static void findResult(HashSet<ArrayList<Integer>> holder,int current, int remain,int max,ArrayList<Integer> item){
		//reach the end of the node
		if(remain == 0){
			holder.add(item);
			return;
		}
		for(int i=current;i<=max;i++){
			int remain1;
			ArrayList<Integer> item1 = new ArrayList<Integer> (item);
			item1.add(i);
			remain1 = remain-1;
			System.out.println(remain);
			findResult(holder,i+1,remain1,max,item1);
		}
	}

}
