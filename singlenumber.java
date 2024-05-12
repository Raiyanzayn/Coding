package demo;

public class singlenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= { 1,1,2,2,3,3,4} ;
     int result =0 ;
     for( int i=0 ; i<arr.length ; i++) {
    	 result = result ^ arr[i];
    	
     }
     System.out.println(result);
	}

}
