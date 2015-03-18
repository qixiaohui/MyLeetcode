package com.leetcode.xiaohui;

import java.util.ArrayList;

public class EvaluateReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int evalRPN(String[] tokens) {
    	
    	ArrayList<Integer> array=new ArrayList<Integer>();
    	for(int i=0;i<tokens.length;i++){
    		if(tokens[i].equals("+")){			
    			array.set(array.size()-2,array.get(array.size()-2)+array.get(array.size()-1) );
    			array.remove(array.size()-1);
    			//System.out.println(array.get(array.size()-1));
    		}else if(tokens[i].equals("-")){
    			array.set(array.size()-2,array.get(array.size()-2)-array.get(array.size()-1) );
    			array.remove(array.size()-1);
    		}else if(tokens[i].equals("*")){
    			array.set(array.size()-2,array.get(array.size()-2)*array.get(array.size()-1) );
    			array.remove(array.size()-1);
    		}else if(tokens[i].equals("/")){
    			array.set(array.size()-2,array.get(array.size()-2)/array.get(array.size()-1) );
    			array.remove(array.size()-1);
    		}else{
    			array.add(Integer.parseInt(tokens[i]));
    			//System.out.println(array.get(array.size()-1));
    		}
    	}
		return array.get(0);
        
    }

}
