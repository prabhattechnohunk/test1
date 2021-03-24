package p1;

public class Test {	
	
	//array program
	 public static void main(String[] args) {	        
	        int[] array = { 3, 4, 6, 5 };
	        
	        for (int i = 0; i < array.length; i++) {	        
	        int factorialCalc= factorial(array[i]);
	        System.out.println("the factorials of the array are " + factorialCalc);
	        }	       
	    
	    }	        
	        public static int factorial(int num) { 
	        int fact = 1;	      
	           
	            for (int j = 1; j <= num; j++) {
	                fact = fact * j;
	              
	            }
	            return fact;
	       
	    }	    
	}

	


