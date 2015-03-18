package com.leetcode.xiaohui;

public class MinimiumInRoatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int findMin(int[] num) {
        int temp=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]<temp){
                temp=num[i];
            }
        }
        return  temp;
    }
}
