package com.qa.learning;

public class ForControls {

	public static void main(String args[])
	{//i=i+1
    for (int i=1;i<10;i++) {
    	
    if(i%2==0) {
    	
    	System.out.println(i);
    
    }else if(i%3==0){
    	System.out.println(i+" i is divisible by 3");
    }
    else {
    	System.out.println( i +"i is not divible by 2");
    }
    
    }
	}
	
}
