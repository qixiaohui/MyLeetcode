package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePath uniquePath = new UniquePath();
		System.out.println(uniquePath.solution(11,11));
	}
	
	public int solution(int m, int n){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
		ArrayList<Integer> base = new ArrayList<Integer> ();
		for(int i=1; i<=m; i++){
			base.add(i);
		}
		result.add(base);
		for(int i=m+1; i<=m+n; i++){
			Set<ArrayList<Integer>> paths = new HashSet<ArrayList<Integer>> ();
			for(ArrayList<Integer> list : result){
				for(int j=0; j<list.size()+1; j++){
					if(i == m+1 || j > list.indexOf(i-1)){
						list.add(j, i);
						//System.out.println(list);
						ArrayList<Integer> deepCopy = new ArrayList<Integer> (list);//this is necessry, otherwise path.add() add the reference of list, so need to deepcopy the value
						paths.add(deepCopy);
						list.remove(j);
					}
				}
			}
			result = new ArrayList<ArrayList<Integer>> (paths);
		}
		return result.size();
	}

}
