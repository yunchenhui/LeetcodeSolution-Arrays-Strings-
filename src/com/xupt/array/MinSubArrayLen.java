package com.xupt.array;

public class MinSubArrayLen {

	public static void main(String[] args) {
		int[] nums= {2,3,1,2,4,3};
		System.out.println(new MinSubSolution().minSubArrayLen(7, nums));
	}

}
class MinSubSolution{
	public int minSubArrayLen(int s,int[] nums) {
		if(nums==null||nums.length==0)
			return 0;
		int x=Integer.MAX_VALUE;
		for(int i=0;i<nums.length;i++) {
			int sum=0;
			int j=i;
			while(j<nums.length){
				if(sum<s) {
					sum+=nums[j];
					j++;
				}
				else
					break;
			}
			if(sum>=s) {
				x=Math.min(j-i, x);
			}		
		}
		if(x==Integer.MAX_VALUE)
			return 0;
		return x;
	}
}