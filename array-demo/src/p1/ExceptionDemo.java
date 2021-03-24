package p1;

import java.util.Scanner;

public class ExceptionDemo {
	public static void main(String[] args) {		
		    //assuming there is only one duplicate number in the array
		        Scanner sc = new Scanner (System.in);
		        System.out.println("Plese enter the lengeth of your number list");
		        int num= sc.nextInt();
		        int[] number = new int[ num];
		        
		        for (int i= 0; i<num; i++) {
		        System.out.println("Please enter your list of numbers");
		        number [i]= sc.nextInt();
		        }
		        
		        int repeted = duplicate(number);
		        System.out.println("this number is duplicate" + repeted);
		    }
		    
		    public static int duplicate (int[] number) {
		        int j;
		        for (int i= 0; i<number.length-1; i++) {
		             for (j = i+1; j <=number.length-1; j++)
		                     if (number[i]==number[j]){
		                     return number[j];
		                     }
		            }
		        return -1;//if no duplicate found then return -1		        
		       
		        }
		}
		        
		 
	


