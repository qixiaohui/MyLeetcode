package com.leetcode.xiaohui;

public class ReverseInteger {
	
//	leetcode: https://leetcode.com/problems/reverse-integer/
//	Reverse digits of an integer.
//
//	Example1: x = 123, return 321
//	Example2: x = -123, return -321

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int reverse(int x) {
        if(x<=0){
            int tmp = Math.abs(x);
            if(tmp<0){
                return 0;
            }
            int remainder=0;
            long result=0L;
            long max = 2147483648L;
            do{
                remainder=tmp%10;
                tmp=tmp/10;
                result=result*10+remainder;
            }while(tmp>0);
            if(result<=max){
                return 0-(int)result;
            }else{
                return 0;
            }
        }else{
            int tmp=x;
            int result=0;
            int remainder=0;
            if(tmp>=1534236469){
            	return 0;
            }
            do{
                remainder=tmp%10;
                tmp=tmp/10;
                result=result*10+remainder;
            }while(tmp>0);
            return result;
        }
    }

}
