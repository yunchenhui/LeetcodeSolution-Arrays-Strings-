package com.xupt.array;

public class ReverseWords {

	public static void main(String[] args) {
		String s=" 1";
		System.out.println(new ReverseWordsSolution().reverseWords(s));
	}

}
class ReverseWordsSolution{
	public String reverseWords(String s) {
		String[] result=s.split(" ");
		if(result==null||result.length==0)
				return "";
		StringBuilder str=new StringBuilder();
		for(int i=result.length-1;i>=0;i--) {
			if (!"".equals(result[i])) {
				str.append(" ");
				str.append(result[i]);
			}
		}
//		str.deleteCharAt(0);
//		if(str.charAt(str.length()-1)==' ')
//			str.deleteCharAt(str.length()-1);
		return str.toString().trim();
	}
}