package com.leetcode.xiaohui;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String reverseWords(String s) {
	       String[] str=s.split(" ");
	       StringBuilder builder=new StringBuilder();
	       for(int i=0;i<str.length;i++){
	    	   if(i==(str.length-1))
	    	   {
	    		   if(!(str[str.length-i-1].length()==0)){
	    		   builder.append(str[str.length-i-1]);
	    		   //System.out.println(str[str.length-i-1]+i);
	    		   }
	    	   }
	    	   else
	    	   {
	    		   if(!(str[str.length-i-1].length()==0)){
	    		   builder.append(str[str.length-i-1]+" ");
	    		   //System.out.println(str[str.length-i-1]+i);
	    		   }
	    	   }
	    }
	       String result=builder.toString();
	       //System.out.println("1"+builder.toString().charAt(builder.toString().length()-1)+"2");
	       if(result.length()!=0){
	       if((result.charAt(0)==' ')){
	    	   result=builder.toString().substring(1, builder.toString().length());
	       }
	       if((Character.isSpaceChar(result.charAt(builder.toString().length()-1)))){
	    	   result=builder.toString().substring(0, builder.toString().length()-1);
	       }
	       }
	       return result;
}

}
