package demo;

public class leftrotatearr {


	    public  static  void seperate(int[] arr) {

	    	int n = arr.length ;
	    	int temp[] = new int[n];
	    	int k =0 ;
	    	for(int i=1 ; i<arr.length ; i++) {
	    		     temp[k++] = arr[i];
	    	}
	    	temp[n-1] = arr[0];
	    	for( int i=0 ; i< n ;i++) {
	    		System.out.print(temp[i] + " ");
	    	}
	    	
	    }
	    public static void main(String args[]){
	    	 
	    	  int arr[]= {1,2,3,4,5};
	    	  seperate(arr);
	}
	}

	
	
	
	