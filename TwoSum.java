package com.leetcode.xiaohui;

import java.util.Hashtable;

public class TwoSum {

//	leetcode: https://leetcode.com/problems/two-sum/
//	Given an array of integers, find two numbers such that they add up to a specific target number.
//
//	The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
//
//	You may assume that each input would have exactly one solution.
//
//	Input: numbers={2, 7, 11, 15}, target=9
//	Output: index1=1, index2=2
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int[] twoSum(int[] numbers, int target)
    {
        int []a = new int[2];
        Hashtable<Integer, Integer> nums = new Hashtable<Integer, Integer>();
        for (int i=0; i<numbers.length; i++)
        {
            
            Integer n = nums.get(numbers[i]);
            if (n==null) nums.put(numbers[i], i); 
            n = nums.get(target-numbers[i]); 
            if (n!=null && n<i)
            {
                a[0]=n+1;
                a[1]=i+1;
                return a;
            }
        }
     return a;
    }

}
