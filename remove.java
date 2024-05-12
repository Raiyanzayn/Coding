package demo;

public class remove {

	public static void remove (int arr[] , int key) {
		
		int indexremove = -1 ;
		for( int i=0 ; i<arr.length ; i++) {
			if (arr[i] == key) {
				indexremove=i ;
				break ;
			}
		}
		int newArr[] = new int[arr.length -1 ];
		for( int sr=0 , dsr=0 ; sr < arr.length ; sr ++) {
			if ( sr != indexremove) {
				     arr[dsr] = arr[sr];
				     dsr ++ ;
			}
			
		}
	}
	
	
	public static void main(String args[]) {
		int arr[] = {1,2,3,4 } ;
		int key= 3 ;
		remove( arr , key);
		for( int i=0 ; i<arr.length-1 ; i++) {
		System.out.println(arr[i]);
	}
}
}
//
//package demo;
//import java.util.* ;
//public class practice {
//
//	public static void remove( int arr[] , int key) {
//	 
//		int indexremove = -1 ;
//		for( int i=0 ; i<arr.length ; i++) {
//			if (arr[i] == key ) {
//				indexremove = i;
//			}
//		}
//		int newArr[] = new int[arr.length -1];
//		for( int i=0 , j =0 ; i< arr.length ; i++) {
//			if ( indexremove != i) {
//				    newArr[j]= arr[i];
//				    j ++ ;
//				    
//			}
//			
//			
//		}
//		for( int i=0 ; i<newArr.length ; i++) {
//			System.out.print(newArr[i]);
//		}	
//	}
//	public static void main(String[] args) {
//    int arr[] = {1,2,3,4,5 } ;
//    int key = 4 ;
//    remove( arr , key);
//}
//}