package com.leetcode.xiaohui;

public class ClimbingStair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbingStair climbStairs = new ClimbingStair();
		System.out.println(climbStairs.climbStairs(44));
	}
	
	public int climbStairs(int n){
		if(n==1) return 1;
		if(n==2) return 2;
		return climbStairs(n-1)+climbStairs(n-2);
	}

}
