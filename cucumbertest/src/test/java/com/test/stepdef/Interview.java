package com.test.stepdef;

public class Interview {

	public Interview() {
		System.out.println("This is Interview constructor");
	}
	
	private void getValue() {
		System.out.println("Interview value");
	}
    

       
       public static void main(String[] args) {
		
    	   
    	   Questions q = new Questions();
    	   
    	   System.out.println();
    	   Interview i = new Questions();
    	   System.out.println();
    	   
    	   Interview i2 = new Interview();
    	   
    	  // Questions q2 = (Questions) new Interview();//Throws class casting exception
    	   
    	  q.getValue();
    	   System.out.println("-----------");
    	   i.getValue();System.out.println("-----------");
    	   i2.getValue();
    	   
    	   
	}
	
}

class Questions extends Interview{
	public Questions() {
		System.out.println("This is Questions constructor");
	}
	
	public void getValue() {
		System.out.println("Questions value");
	}
	
}