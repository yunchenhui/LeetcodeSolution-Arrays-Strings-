package com.xupt.array;

import java.util.*;

public class YangHuiTriangleII {

	public static void main(String[] args) {
		new YangHuiTriangleSolution().getRowII(3);

	}

}
class YangHuiSolution{
	public List<Integer> getRow(int rowIndex){
		rowIndex++;
		ArrayList<List<Integer>> triangle=new ArrayList<List<Integer>>();
		for(int i=0;i<rowIndex;i++) {
			ArrayList<Integer> row=new ArrayList<>();
			triangle.add(row);
		}
		for(int i=0;i<rowIndex;i++) {
			triangle.get(i).add(1);
		}
		for(int i=2,count=0;i<rowIndex;i+=2,count++) {
			for(int j=i;j<rowIndex;j++) {
				if(j==i) {
					triangle.get(j).add(triangle.get(j-1).get(count)*2);
				}
				else
					triangle.get(j).add(triangle.get(j-1).get(count)+triangle.get(j-1).get(count+1));
			}
		}
		ArrayList<Integer> result=(ArrayList<Integer>) triangle.get(rowIndex-1);
		int size=result.size();
		if (size==rowIndex/2) {
			for (int k = size - 1; k >= 0; k--) {
				result.add(result.get(k));
			} 
		}
		else
			for(int k=size-2;k>=0;k--) {
				result.add(result.get(k));
			}
		return result;
	}
}
class YangHuiTriangleSolution{
	public List<Integer> getRowII(int rowIndex){
		ArrayList<Integer> triangleRow=new ArrayList<>();
		triangleRow.add(1);
		for(int i=1;i<rowIndex;i++) {
			triangleRow.add(0);
		}
		for(int i=1;i<rowIndex;i++)
			for(int j=i;j>0;j--) {
				System.out.println(1);
				triangleRow.set(j, triangleRow.get(j)+triangleRow.get(j-1));
			}
		return triangleRow;
	}
}