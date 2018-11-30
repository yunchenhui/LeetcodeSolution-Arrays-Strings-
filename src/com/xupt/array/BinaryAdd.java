package com.xupt.array;

public class BinaryAdd {

	public static void main(String[] args) {
		String a="1111";
		String b="1111";
		System.out.println(new BinaryAddSolution().addBinary(a, b));
	}

}
class BinaryAddSolution{
	public String addBinary(String a,String b) {
		int sizeA=a.length();
		int sizeB=b.length();
		StringBuilder A=new StringBuilder(a);
		StringBuilder B=new StringBuilder(b);
		StringBuilder result=new StringBuilder();
		int mark=0;
		if(sizeA>sizeB) {
			for(int i=0;i<sizeA-sizeB;i++) {
				B.insert(0,"0");
			}
		}
		if(sizeB>sizeA) {
			for(int i=0;i<sizeB-sizeA;i++) {
				A.insert(0,"0");
			}
		}
		for(int i=Math.max(sizeB, sizeA)-1;i>=0;i--) {
			char c=(char) (((A.charAt(i)-'0')+(B.charAt(i)-'0'))+'0');
			System.out.println(c);
			if(c=='2') {
				if(mark==0) {
					mark=1;
					result.insert(0,"0");
				}
				else if(mark==1) {
					result.insert(0, "1");
				}
			}
			else if(c=='1'){
				if(mark==0) {
					result.insert(0, "1");
				}
				else if(mark==1){
					result.insert(0, "0");
				}
			}
			else {
				if(mark==0) {
					result.insert(0, "0");
				}
				else if(mark==1){
					mark=0;
					result.insert(0, "1");
				}

			}
		}
		if(mark==1)
			result.insert(0, "1");
		return result.toString();
	}
	
}