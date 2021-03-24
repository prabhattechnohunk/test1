package p1;

import java.util.Arrays;

public class ArrayDemo1 {
	
	
	public static void main(String[] args) {
		
		//first way
		int[] numbers1=new int[5];//array are static		
		numbers1[0]=5;//first element
		numbers1[1]=9;
		numbers1[2]=3;
		numbers1[3]=15;
		numbers1[4]=20;
		//System.out.println(numbers1.length);
		//iterating using classical for loop
		
		/*for(int i=0;i<=numbers1.length-1;i++){
			
			System.out.println(numbers1[i]);
			
		}*/
		
		//iterate using for each loop
		
		/*for(int element  : numbers1 ){
			
			System.out.println(element);
		}*/
		
		
		System.out.println(Arrays.toString(numbers1));
		
		
		//second way of declaring array
		
		int[] numbers2=new int[]{6,9,1};
		
		//third way
		
		int[] numbers3={6,9,1};//better
		
		
		//sort
		
		Arrays.sort(numbers3);
		System.out.println("after sorting the elements are "+Arrays.toString(numbers3));
		
		//we can declare the array like following also
		int numbers4[]={6,9,1};
		
		//write a method to find the max element in an array
		
		
		
		
		
		int array[] = {10, 20, 25, 63, 96, 57};
	      int size = array.length;
	      int value = 60;
           int i;
	      for ( i=0 ;i<= size-1; i++){
	    	  System.out.println( i);
	         if(array[i]==value){
	            System.out.println("Element found index is :"+ i);
	            break;
	         }/*else{
	            System.out.println("Element not found");
	         }*/
	      }
	      if(i==size){
	    	  System.out.println("Element not found ");  
	      }
		
		
		
	}
	
	
}
