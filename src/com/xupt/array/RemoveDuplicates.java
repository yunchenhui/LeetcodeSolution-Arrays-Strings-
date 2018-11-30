package com.xupt.array;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class RemoveDuplicateSolution{
	public int removeDuplicatesSolution(int[] nums) {
		int number=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=nums[number]) {
				++number;
				nums[number]=nums[i];
			}
		}
		return ++number;
	}
}