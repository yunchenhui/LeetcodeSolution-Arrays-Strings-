package com.xupt.array;

import java.util.ArrayList;

public class SolutionStrStr {

	public static void main(String[] args) {
		String haystack="hello";
		String needle="ll";
		System.out.println(new strStr().strStrSolution(haystack, needle));
	}

}
class strStr{
	public int strStrSolution(String haystack,String needle) {
		if(needle==null||needle.length()==0)
			return 0;
		ArrayList<Integer> list=new ArrayList<>();
		char[] hay=haystack.toCharArray();
		char[] nee=needle.toCharArray();
		char start=nee[0];
		int length=haystack.length();
		String str=null;
		for(int i=0;i<length;i++) {
			if(hay[i]==start) {
				list.add(i);
			}
		}
		for(int i=0;i<list.size();i++) {
			int location=list.get(i);
			if(location+needle.length()>haystack.length())
				return -1;
			str=haystack.substring(location, location+needle.length());
			if(str.equals(needle))
				return location;
		}
		return -1;
	}
}