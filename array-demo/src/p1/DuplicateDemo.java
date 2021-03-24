package p1;

public class DuplicateDemo {

	public static void main(String[] args) {
		
		int[] arr={10,20,10,30,10,10,10};		
		
		System.out.println(arr.length);
		for(int i=0 ; i<3 ; i++){			
			
			for(int j=i+1;j<=arr.length-1;j++ ){				
				if(arr[i]==arr[j]){					
					System.out.println(" the duplicate is "+ arr[i]);
					break;
				}				
				
			}
		}
	}
}
