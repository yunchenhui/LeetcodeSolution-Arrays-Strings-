package com.xupt.array;

import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] matrix=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		List<Integer> array=new ArrayList<>();
		array=new SpiralOrder().spiralSolution(matrix);
		System.out.println(array);
	}

}
class SpiralOrder{
	public List<Integer> spiralSolution(int[][] matrix){
		List<Integer> array=new ArrayList<Integer>();
		int rows=matrix.length;
		int cols=matrix[0].length;
		int top=0;
		int bottom=rows-1;
		int left=0;
		int right=cols-1;
		if(matrix==null||rows==0||cols==0)
			return array;
		while(left<=right&&top<=bottom) {
			for(int i=left;i<=right;i++) {
				array.add(matrix[top][i]);
			}
			for(int i=top+1;i<bottom;i++) {
				array.add(matrix[i][right]);
			}
			if(top!=bottom) {
				for(int i=right;i>=left;i--) {
					array.add(matrix[bottom][i]);
				}
			}
			if(right!=left) {
				for(int i=bottom-1;i>top;i--) {
					array.add(matrix[i][left]);
				}
			}
			top++;
			left++;
			bottom--;
			right--;
		}
		return array;
	}
} 