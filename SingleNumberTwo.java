package com.leetcode.xiaohui;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumberTwo {
	
// leetcode: https://leetcode.com/problems/single-number-ii/
//	Given an array of integers, every element appears three times except for one. Find that single one.
//
//	Note:
//	Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int singleNumber(int[] A) {
    	HashMap<Integer, Integer> map=new HashMap<Integer,Integer>();
    	for(int i=0;i<A.length;i++){
    		if(!map.containsKey(A[i])){
    			map.put(A[i], 1);
    		}else
    		{
    			map.put(A[i], map.get(A[i])+1);
    			if(map.get(A[i])==3){
    				map.remove(A[i]);
    			}
    		}
    	}
    	Iterator it = map.entrySet().iterator();
    	Map.Entry pairs = (Map.Entry)it.next();
		return (int)pairs.getKey();
        
    }

}
