package com.leetcode.xiaohui;

public class JumpGame {
	
//	leetcode url: https://oj.leetcode.com/problems/jump-game/
//	Given an array of non-negative integers, you are initially positioned at the first index of the array.
//
//	Each element in the array represents your maximum jump length at that position.
//
//	Determine if you are able to reach the last index.
//
//	For example:
//	A = [2,3,1,1,4], return true.
//
//	A = [3,2,1,0,4], return false.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JumpGame jumpGame = new JumpGame();
		System.out.println(jumpGame.solution(new int [] {2,5,0,0}));
	}

	public boolean solution(int [] A){
		int range = 0;
		for(int i=0; i< A.length; i++){
			if(i<=range){
				if(range<A[i]+i){
					range = A[i]+i; //try to get the most right leap
				}
				if(range>=A.length-1){
					return true;
				}
			}
		}
		return false;
	}
}
