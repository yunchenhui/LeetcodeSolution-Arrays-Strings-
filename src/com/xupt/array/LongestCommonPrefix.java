package com.xupt.array;

import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
	}

}
class PrefixSolution{
	public String longestCommonPrefix(String[] strs) {
		if(strs==null||strs.length==0)
			return "";
		Arrays.sort(strs);
		int i=0;
		int length=Math.min(strs[0].length(), strs[strs.length-1].length());
		while(i<length&&strs[0].charAt(i)==strs[strs.length-1].charAt(i))
			i++;
		return strs[0].substring(0, i);
	}
}