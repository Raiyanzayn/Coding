package demo;
import java.util.* ;
public class reaarrangeelement {

	    public  static  void rearrange(int[] arr) {
	       int n = arr.length ;
	  ArrayList<Integer> pos = new ArrayList<>();
	  ArrayList<Integer> neg = new ArrayList<>();
	  for( int i=0 ; i< n ; i++) {
		if ( arr[i] < 0) {  
			neg.add(arr[i]);
		} else {
			pos.add(arr[i]);
		}
	  }
	  for( int i=0 ; i<n/2 ; i++ ) {  
		   arr[2*i] = pos.get(i);
		  arr[ 2*i+1] = neg.get(i);
		  
	  }
	  for( int i=0 ; i<n ; i++) {
	  System.out.println(arr[i]);
	  }
	    }   	
	    public static void main(String args[]){
	  int arr[] = {1,2,-4,-5} ;
	      rearrange( arr);
	}
	}
// optimized method
//package demo ;
//import java.util.* ;
//public class practice {
//    public  static ArrayList<Integer> rearrange(ArrayList<Integer> arr) {
//     int  n = arr.size();
//     ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n , 0)); n size ans(arr) ,all initialize with zero like (0,0,0,0,0,0) in chatgpt     
//      int pos = 0 , neg = 1 ;
//    for( int i=0 ; i< n ; i++) {	
//    if ( arr.get(i) < 0) {	
//    	ans.set(neg, arr.get(i));
//    	 neg += 2 ;
//    } else {
//    	ans.set(pos ,arr.get(i));
//    	pos += 2 ;
//    }	
//    }
//    return ans ;
//    }   	
//    public static void main(String args[]){
//    	ArrayList<Integer> arr =new ArrayList(Arrays.asList(1,2,-4,-5,3,4));
//    	ArrayList<Integer>  ans = rearrange( arr);
//    	for( int i=0 ; i<ans.size() ; i++) {
//    		System.out.println( ans.get(i));
//    	}
//}
//}




//  input = 1,2,-4,-5,3,4 ;
//    output=1 -4 2 -5 3 4


//package demo ;
//import java.util.* ;
//public class practice {
//    public  static void rearrange(int[] arr) {
//
//        int n = arr.length ;
//  	  ArrayList<Integer> pos = new ArrayList<>();
//  	  ArrayList<Integer> neg = new ArrayList<>();
//    	for( int i=0 ; i<n ;i++) {
//    		if (arr[i] < 0 ) {
//    			neg.add(arr[i]);
//    		} else {
//    			pos.add(arr[i]);
//    		}
//    		
//    	}
//    	for( int i=0 ; i< neg.size() ; i++) {
//    		      arr[i*2]  = pos.get(i);
//    		      arr[i*2 + 1] = neg.get(i);
//    	}
//    int	index = 4 ;
//    	for( int i=2 ; i<pos.size() ; i++) {
//                 arr[index] =  pos.get(i);
//                 index++ ;
//    		
//    		
//    	}
//    	for( int i=0 ; i<arr.length ; i++) {
//    	System.out.println(arr[i]);
//    	
//    	
//    	}
//    }   	
//    public static void main(String args[]){
//     int arr[] = {1,2,-4,-5,3,4};
// rearrange(arr);   	
//}
//}


















