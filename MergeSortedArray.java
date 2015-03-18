package com.leetcode.xiaohui;

public class MergeSortedArray {
	
//	leetcode: https://leetcode.com/problems/merge-sorted-array/
//	Given two sorted integer arrays A and B, merge B into A as one sorted array.
//
//	Note:
//	You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. The number of elements initialized in A and B are m and n respectively.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public void merge(int A[], int m, int B[], int n) {
        int[] tmp=new int[m+n];
        int a=0;
        int b=0;
        for(int i=0;i<m+n;i++){
            if(a<m && b<n){
                if(A[a]<B[b]){
                    tmp[i]=A[a];
                    a++;
                }else{
                    tmp[i]=B[b];
                    b++;
                }
            }else{
                if(a<m){
                    tmp[i]=A[a];
                    a++;
                }
                if(b<n){
                    tmp[i]=B[b];
                    b++;
                }
            }
        }
        for(int j=0;j<m+n;j++){
            A[j]=tmp[j];
        }
    }

}
