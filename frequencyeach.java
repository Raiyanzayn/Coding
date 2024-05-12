//package demo;
//import java.util.*;
//public class frequencyeach {
//	 
//	
//	public static void frequency(int arr[]) {
//		int n = arr.length ;
//	boolean visited[]= new boolean[n];	
//		for( int i=0 ; i< n ; i++) {
//			
//			if ( visited[i] == true) {
//				continue ;
//			}
//			int count =1 ;
//			for(int j = i+1 ; j< n ; j++) {
//				if ( arr[i]==arr[j]) {				
//					visited[j] =true ;
//					count ++ ;
//				}
//				
//			}
//			System.out.println(arr[i] +" "+ count);
//		}
//	}
//	public static void main(String args[]){  
//	  int arr[] = {10,15,15,10,15,5} ;
//	  frequency(arr);
//	}
//}


package demo;
import java.util.*;
public class frequencyeach {
	 
	
	public static void frequency(String data) {
		char[] arr= data.toCharArray();
		int n = arr.length ;
		boolean visited[]= new boolean[n];	
			for( int i=0 ; i< n ; i++) {
				
				if ( visited[i] == true) {
					continue ;
				}
				int count =1 ;
				for(int j = i+1 ; j< n ; j++) {
					if ( arr[i]==arr[j]) {				
						visited[j] =true ;
						count ++ ;
					}
					
				}
				System.out.println(arr[i] +" "+ count);
				
	}
	}
	
	public static void main(String args[]){  
	  String data = "ehello";
	    frequency(data);
	}
}
// reverse string 
//package demo;
//import java.util.* ;
//public class practice {
//
//	public static void main(String[] args) {
//
//		String str= "raiyan";
//		char[] data = str.toCharArray();
//		int start =0 ;
//		int end = data.length -1;
//		while ( start < end) {
//			int temp = data[start];
//			data[start]= data[end];
//			data[end]= (char)temp ;
//			start ++ ;
//			end -- ;
//			
//		}
//				for( int i=0 ; i<data.length ; i++) {
//					System.out.print(data[i]);
//				}
//		
//}
//}
//
//
//
