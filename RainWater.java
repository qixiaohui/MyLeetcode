package com.leetcode.xiaohui;

public class RainWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainWater rainWater = new RainWater ();
		System.out.println(rainWater.solution(new int [] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}
	public int solution(int[] A){
		//check empty
		if(A.length==0 || A.length==1){
			return 0;
		}
		//set the initial bar
		int bar = A[0];
		int container1 = 0;
		int tmpContainer = 0;
		for(int i=1; i< A.length; i++){
			if(A[i]<bar){
				tmpContainer += bar-A[i];
			}
			if(A[i]>=bar){
				container1 += tmpContainer;
				tmpContainer = 0;
				bar = A[i];
			}
		}
		
		if(tmpContainer == 0){
			
		}
		
		bar = A[A.length-1];
		tmpContainer = 0;
		int container2 = 0;
		for(int i=A.length-2; i>= 0; i--){
			if(A[i]<bar){
				tmpContainer += bar-A[i];
			}
			if(A[i]>=bar){
				container2 += tmpContainer;
				tmpContainer = 0;
				bar = A[i];
			}
		}
		//System.out.println(container1+""+container2);
		return container1+container2;
	}

}
