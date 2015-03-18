package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	
//	leetcode: https://leetcode.com/problems/3sum/
//	Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
//
//			Note:
//			Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
//			The solution set must not contain duplicate triplets.
//			    For example, given array S = {-1 0 1 2 -1 -4},
//	
//			    A solution set is:
//			    (-1, 0, 1)
//			    (-1, -1, 2)

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>> ();
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            int start=i+1;
            int end=num.length-1;
            int target=num[i];
            if(i==0 || num[i]!=num[i-1]){
                target=num[i];
                while(start<end){
                    if(num[start]+num[end]+target==0){
                        int val1=num[start];
                        int val2=num[end];
                        ArrayList<Integer> tmp=new ArrayList<Integer> ();
                        tmp.add(target);
                        tmp.add(val1);
                        tmp.add(val2);
                        result.add(tmp);
                        start++;
                        end--;
                        while(start<end && val1==num[start]){
                            start++;
                        }
                        while(start<end && val2==num[end]){
                            end--;
                        }
                    }else if(num[start]+num[end]+target<0){
                        start++;
                    }else if(num[start]+num[end]+target>0){
                        end--;
                    }
                }
            }
        }
    return result;
    }

}
