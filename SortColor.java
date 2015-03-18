package com.leetcode.xiaohui;

public class SortColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public void solution(int[] A){
		int red = 0;
		int white = 0;
		int blue = 0;
		int length = A.length;
		for(int i=0; i<length; i++){
			if(A[i]==0){
				red++;
			}else if(A[i]==1){
				white++;
			}else{
				blue++;
			}
		}
		for(int i=0; i<length; i++){
			if(i<=red-1){
				A[i]=0;
			}else if(i<=red+white-1){
				A[i]=1;
			}else{
				A[i]=2;
			}
		}
		
	}

}
