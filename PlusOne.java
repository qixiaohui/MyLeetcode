package com.leetcode.xiaohui;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusOne plusOne = new PlusOne();
		plusOne.solution(new int[] {1,2,3});
	}
	
	public int [] solution(int[] digits){
		StringBuffer result = new StringBuffer();
		for(int i=0; i<digits.length; i++){
			result.append(Integer.toString(digits[i]));
		}
		int intRes = Integer.parseInt(result.toString());
		intRes++;
		int length = Integer.toString(intRes).length();
		System.out.println(intRes);;
		int [] sum = new int[length];
		for(int i=length-1; i>=0; i--){
			sum[i] = intRes%10;
		}
		return sum;
	}

}
