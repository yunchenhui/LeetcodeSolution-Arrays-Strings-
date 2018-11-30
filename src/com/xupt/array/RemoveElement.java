package com.xupt.array;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class RemoveSolution{
	public int removeElement(int[] nums,int val) {
		int res=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=val)
				nums[res++]=nums[i];
		}
		return res;
	}
}