package com.qa;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input String: - My Name is Santhosh
		String s="My Name is Santhosh";
		String[] s2=s.split(" ");
		for(int i=0;i<s2.length;i++) {
			System.out.print(s2[s2.length-1-i]+" ");
			
		}

	}

}
