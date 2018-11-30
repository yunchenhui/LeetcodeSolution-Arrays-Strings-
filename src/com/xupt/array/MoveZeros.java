package com.xupt.array;

public class MoveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class MoveZerosSolution{
	public void moveZeros(int[] nums) {
		int number=0;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				++number;
				nums[number]=nums[i];
			}
			else
				count++;
		}
		for(int i=nums.length-1;i>nums.length-1-count;i--) {
			nums[i]=0;
		}
	}
}