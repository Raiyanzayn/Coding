// reverse arr

//package demo;
//
//public class reverse {
//
//	public static void reverse( int arr[]) {
//		
//		int start =0 ;
//		int end = arr.length-1 ;
//		while( start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp ;
//			start ++ ;
//			end -- ;	
//		}
//	}
//	
//	public static void main(String args[]) {
//	int arr[] = {1,2,3,4,5} ;
//	reverse( arr);
//	for( int i=0 ; i<arr.length; i++) {
//	System.out.println(arr[i]);
//	}
//}
//}
// reverse character 
//package demo;
//public class reverse {
//
//	public static void reverse( char arr[]) {
//		
//		int start =0 ;
//		int end = arr.length-1 ;
//		while( start < end) {
//			int temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = (char)temp ;
//			start ++ ;
//			end -- ;	
//		}
//	}	
//	public static void main(String args[]) {
//	char arr[] = {'h','e','l','l','o'} ;
//	reverse( arr);
//	for( int i=0 ; i<arr.length; i++) {
//	System.out.println(arr[i]);
//	}
//}
//}
// reverse string 
package demo;

public class reverse{

	public static void main(String[] args) {
		String data ="Raiyan";

 
		data = data.toLowerCase();
	   char[] arr= data.toCharArray();
	   int start =0 ;
	   int end =arr.length-1;
	   while( start < end) {
		   int temp =arr[start];
		   arr[start] = arr[end] ;
		   arr[end] = (char)temp ;
		   start++ ;
		   end --;
		   
	   }
	for( int i=0 ; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}




