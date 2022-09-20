package com.qa.learning;

public class Variabletyps {
	String name ="Deeskhith";
	static int age=30;
	
	public void updateAge(int a) {//a=age====>a=30
		int m=5;
		age=a+1;//age= 30+1
		
	}
	String name2 ="Deeskhith";
	public static void main(String[] args) {
		Variabletyps s=new Variabletyps();
		System.out.println(s.name);
		System.out.println(s.age);
		s.updateAge(age);
		System.out.println(s.age);
		Variabletyps s2=new Variabletyps();
		System.out.println("line no 20"+s2.name);
		
	}

}
