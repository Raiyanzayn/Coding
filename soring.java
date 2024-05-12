package demo;

public class soring {
	    public  static  void  sorting(int[] arr) {
	         int n = arr.length ;
	    	for( int i=0 ; i< n-1 ; i++) {  
	    		for( int j =0 ; j<n-1-i ; j++) {
	    			if ( arr[j] > arr[j+1]) {
	    				int temp = arr[j] ;
	    				arr[j] = arr[j+1];
	    				arr[j+1] = temp ;	
	    			}	
	    		}
	    		
	    	}
	    	
	    }
	    	
	    public static void main(String args[]){
	    	 
	    	  int arr[]= {0, 2, 1, 2, 0, 1};
	            sorting( arr);
	            for ( int i=0 ; i< arr.length ; i++) {
	      		   System.out.println(arr[i]);
	      	}
	         	
	}
	}








//package demo ;
//import java.util.* ;
//public class practice {
//  public  static  void  sorting(int[] arr) {
//       int n = arr.length;
//  	int cnt1 =0 , cnt2 =0 , cnt3 =0 ;
//  	for( int i=0 ; i< n ;i++) {
//  		if ( arr[i] == 0) {
//  			cnt1 ++;
//  		} else if ( arr[i] == 1) {
//  			cnt2++ ;
//  		} else {
//  			cnt3++ ;
//  		}
//  	}
//  	for( int i=0 ; i<cnt1 ; i++) {
//  		arr[i] =0 ;
//  	}
//  	for( int i=cnt1 ; i<cnt1 + cnt2 ; i++) {
//  		arr[i] = 1 ;
//  	}
//  	for( int i= cnt1 + cnt2  ; i< n ; i++) {
//  		arr[i] = 2 ;
//  	}
//  	for( int i=0 ; i< n ; i++) {
//  		System.out.println( arr[i]);
//  	}
//  	
//  }
//  	
//  public static void main(String args[]){
//
//	  int arr[]= {0, 2, 1, 2, 0, 1};
//	  sorting( arr);
//  	 
//       	
//}
//}

//try same question by using ArrayList
//package demo ;
//import java.util.* ;
//public class practice {
//  public  static  void  sorting(ArrayList<Integer> arr) {
//       int n = arr.size();
//  	int cnt1 =0 , cnt2 =0 , cnt3 =0 ;
//  	for( int i=0 ; i< n ;i++) {
//  		if ( arr.get(i) == 0) {
//  			cnt1 ++;
//  		} else if ( arr.get(i) == 1) {
//  			cnt2++ ;
//  		} else {
//  			cnt3++ ;
//  		}
//  	}
//  	for( int i=0 ; i<cnt1 ; i++) {
//  		arr.set(i, 0) ;
//  	}
//  	for( int i=cnt1 ; i<cnt1 + cnt2 ; i++) {
//  		arr.set(i, 1) ;
//  	}
//  	for( int i= cnt1 + cnt2  ; i< n ; i++) {
//  		arr.set(i, 2) ;
//  	}
//  	for( int i=0 ; i< n ; i++) {
//  		System.out.println( arr.get(i));
//  	}
//  	
//  }
//  	
//  public static void main(String args[]){
//
//	ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));       
//  	 sorting( arr);
//  	 for( int i=0 ; i< arr.size() ; i++) {
//System.out.println(arr.get(i));
//  	 }
//       	
//}
//}
