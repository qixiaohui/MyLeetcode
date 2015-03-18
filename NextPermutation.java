package com.leetcode.xiaohui;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input = {2,3,1};
		NextPermutation per = new NextPermutation();
		int[] output = per.nextPermutation(input);
		for(int digit : output){
			System.out.println(digit);
		}
	}
	
	public int[] nextPermutation(int [] num){
		List<Integer> numList = new ArrayList<Integer> ();
		for(int i=0; i<num.length; i++){
			numList.add(num[i]);
		}
		for(int j=numList.size()-1;j>=0;j--){
			if(j!=0){
				if(numList.get(j)>numList.get(j-1)){
					if(j!=numList.size()-1){
						for(int c=j+1; c<=numList.size()-1;c++){
							if(numList.get(c)<numList.get(j-1)){
								numList.add(j,numList.get(c-1));
								numList.remove(c-1);
								break;
							}
							if(c == (numList.size()-1)){
								numList.add(j-1,numList.get(c));
								numList.remove(c+1);
							}
						}
					}else{
						int tmp = numList.get(j);
						numList.set(j, numList.get(j-1));
						numList.set(j-1, tmp);
					}
					break;
				}
			}else{
				Collections.sort(numList);
			}
		}
		for(int j=0;j<numList.size();j++){
			num[j] = numList.get(j);
		}
		return num;
	}
	
//    public int[] nextPermutation(int[] num) {
//        for(int i=0; i<num.length;i++){
//            List<Integer> numList = new ArrayList<Integer> ();
//            int number = num[i];
//            while(number/10>=1){
//                int reminder = number%10;
//                numList.add(0,reminder);
//                number = number/10;
//            }
//            numList.add(0,number);
//            for(int j=numList.size()-1;j>=0;j--){
//                if(j!=0){
//                    if(numList.get(j)>numList.get(j-1)){
//                        Integer tmp = numList.get(j);
//                        numList.set(j,numList.get(j-1));
//                        numList.set(j-1,tmp);
//                        break;
//                    }
//                }else{
//                    //Lowest order
//                    Collections.sort(numList);
//                }
//            }
//            System.out.println(numList);
//            int count = 0;
//            num[i] = 0;
//            for(int j=numList.size()-1;j>=0;j--){
//                num[i] += ((Math.pow(10, count))*numList.get(j));
//                count++;
//            }
//        }
//        return num;
//    }

}
