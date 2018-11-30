package com.xupt.array;



public class FindMaxConsecutiveOnes {

	public static void main(String[] args) {
		int[] nums= {1,1,0,1,1,1};
		System.out.println(new FindMaxSolution().findMaxConsecutiveOnes(nums));
	}

}
class FindMaxSolution{
	public int findMaxConsecutiveOnes(int[] nums) {
//		LinkedList<Integer> queue=new LinkedList<>();
//		int max=0;
//		for(int i=0;i<nums.length;i++)
//			queue.offer(nums[i]);
//		while(!queue.isEmpty()) {
//			int temp=queue.poll();
//			if(temp==1) {
//				int i=1;
//				while((!queue.isEmpty())&&queue.peek()==1) {
//					queue.poll();
//					i++;
//				}
//				max=Math.max(max, i);
//			}
//		}
//		return max;
		if(nums==null)
			return 0;
		int max=0;
		int temp=0;
		for(int num:nums) {
			if(num==1)
				temp++;
			else {
				max=Math.max(temp, max);
				temp=0;
			}
		}
		return Math.max(max, temp);
	}
}