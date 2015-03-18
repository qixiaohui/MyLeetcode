package com.leetcode.xiaohui;

import java.util.ArrayList;

public class RemoveElement {
	
//	leetcode: https://leetcode.com/problems/remove-element/
//	Given an array and a value, remove all instances of that value in place and return the new length.
//
//	The order of elements can be changed. It doesn't matter what you leave beyond the new length.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int removeElement(int[] A, int elem) {
        ArrayList<Integer> list=new ArrayList<Integer> ();
        for(int i=0;i<A.length;i++){
            if(A[i]!=elem){
                list.add(A[i]);
            }
        }
        int size=list.size();
        for(int j=0;j<size;j++){
            A[j]=list.get(j);
        }
        return size;
    }

}
