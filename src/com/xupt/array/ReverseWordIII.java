package com.xupt.array;

public class ReverseWordIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class ReverseWordIIISolution{
	public String reverseWordsIIISolution(String s) {
		String[] result=s.split(" ");
		StringBuilder result2=new StringBuilder();
		for(int i=0;i<result.length;i++) {
			if(result[i]!=" ") {
				StringBuilder str=new StringBuilder(result[i]);
				str.reverse();
				result2.append(str);
				result2.append(" ");
			}
		}
		return result2.toString().trim();
	}
}