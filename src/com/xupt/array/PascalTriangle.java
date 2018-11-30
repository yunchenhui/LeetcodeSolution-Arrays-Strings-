package com.xupt.array;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

	public static void main(String[] args) {

	}

}
class TriangleSolution{
	public List<List<Integer>> generate(int numRows){
		List<List<Integer>> triangle=new ArrayList<List<Integer>>();
		if(numRows<1)
			return triangle;
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(1);
		triangle.add(list1);
		for(int i=2;i<=numRows;i++) {
			List<Integer> list=new ArrayList<>();
			list.add(1);
			for(int j=1;j<numRows-1;j++) {
				list.add(triangle.get(i-2).get(j)+triangle.get(i-2).get(j-1));
			}
			list.add(1);
			triangle.add(list);
		}
		return triangle;
	}
}
