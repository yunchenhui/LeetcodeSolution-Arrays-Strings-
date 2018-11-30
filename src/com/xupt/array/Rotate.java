package com.xupt.array;


public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class RotateSolution{
	public void rotate(int[] nums,int k) {
		int count=k%nums.length;
		if(count<2)
			return;
		reverse(nums,0,nums.length-1);
		reverse(nums,0,count-1);
		reverse(nums,count,nums.length-1);
	}
	private void reverse(int[] nums,int start ,int end) {
		while(start<end) {
			int temp=nums[start];
			nums[start]=nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
}