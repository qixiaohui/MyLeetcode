package com.leetcode.xiaohui;

public class ContainMostWater {
	
//	leetcode: https://leetcode.com/problems/container-with-most-water/
//	Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//	Note: You may not slant the container.

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxArea(int[] height) {  
        int tmp=0;
        int max=0;
        int i=0;
        int j=height.length-1;
        int lh=height[0];
        int rh=height[j];
        while(i<j){
            if(rh<lh){
                tmp=(j-i)*rh;
            }else{
                tmp=(j-i)*lh;
            }
            if(tmp>max){
                max=tmp;
            }
            if(rh<lh){
                while(i<j&&height[j]<=rh){
                    j--;
                }
                if(i<j){
                    rh=height[j];
                }
            }else{
                while(i<j&&height[i]<=lh){
                    i++;
                }
                if(i<j){
                    lh=height[i];
                }
            }
        }
    return max;    
    } 

}
