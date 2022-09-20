package com.qa.learning;

public class Student {
	static String inst="QAhub";
	
	int age=15;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student rajesh= new Student();
		System.out.println(" before update rajesh.age "+rajesh.age);
		rajesh.age=32;
		System.out.println("rajesh.age "+rajesh.age);
		System.out.println("before update inst rajesh.inst "+rajesh.inst);
		
		
		System.out.println("===============================================================");
		Student odelu= new Student();
		System.out.println(" before update odelu.age "+odelu.age);
		odelu.age=33;
		System.out.println(" odelu.age "+odelu.age);
		System.out.println("odelu.inst "+odelu.inst);
		
		Student.inst="Wepros";
		System.out.println("after update inst rajesh.inst "+rajesh.inst);
		
		

	}

}
