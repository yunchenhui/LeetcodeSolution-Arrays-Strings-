package com.xupt.array;

import java.util.Arrays;

public class ArrayPairSum {

	public static void main(String[] args) {

	}

}
class ArrayPairSumSolution{
	public int arrayPairSum(int[] nums) {
		int sum=0;
		Arrays.sort(nums);
		for(int i=0;i<nums.length;i+=2)
			sum+=nums[i];
		return sum;
	}
}