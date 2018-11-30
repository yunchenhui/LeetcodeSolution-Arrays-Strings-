package com.xupt.array;

public class AddTwoNumber {

	public static void main(String[] args) {
		
	}

}
class AddTwoNumberSolution{
	public int[] twoSum(int[] numbers,int target) {
		int[] result=new int[2];
		int length=numbers.length;
		for(int i=1;i<=length;i++) {
			int n=target-numbers[i-1];
			int j=biSearch(numbers,n);
			if(j==i||j==-1)
				continue;
			else if(i<j){
				result[0]=i;
				result[1]=j;
				break;
			}
			else {
				result[0]=j;
				result[1]=i;
				break;
			}
		}
		return result;
	}
	public static int biSearch(int[] numbers,int target) {
		int low=0;
		int high=numbers.length-1;
		int mid;
		while(low<=high) {
			mid=(low+high)/2;
			if(numbers[mid]==target)
				return mid+1;
			else if(numbers[mid]>target)
				high=mid-1;
			else 
				low=mid+1;
		}
		return -1;
	}
}