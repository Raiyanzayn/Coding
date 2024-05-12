package demo;

public class leaderofarray2{

		   
		public  static  void leaders(int[] arr ) {
		       int n = arr.length ;
		
		       for( int i=0 ; i<n ; i++) {
		    	   boolean leader = true ;
		    	   for( int j =i+1 ; j< n ; j++) {
		          		if ( arr[j] > arr[i]) {
		          			leader = false ;
		          			break ;
		          		}
		    		   
		    	   }
		    	   if ( leader) {
		    		   System.out.print(arr[i]);
		    	   }
		    	   
		       }
		    }   	
		    public static void main(String args[]){
		  
		    	int arr[] = {10,22,12,3,0,6} ;
		      leaders( arr); 
		}
		}
