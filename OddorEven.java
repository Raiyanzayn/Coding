//package demo;
//
//public class OddorEven {
//	
//	public static void Odd( int n) {
//		int bitmask = 1 ;
//		if ((n & bitmask) == 0) {
//		  System.out.println( " this is even");	
//		} else {
//			 System.out.println( " this is odd");	
//		}
//			
//	}
//	
//	
//public static void main(String args[]) {
//	
//	Odd(3);
//	
//}
//}




//package demo;
//
//public class practice {
//
//	public static boolean odd(int n) {
//	
//			return ( n & 1)== 1;
//	}
//	public static void main(String[] args) {
//		int n =67 ;
//		System.out.println(odd(n));
//
//}
//}

// To find Unique element 
//package demo;
//
//public class practice {
//
//	public static int unique( int arr[]) {
//	
//		int unique =0 ;
//		for ( int i=0;i< arr.length ; i++) {
//			
//			unique =unique ^ arr[i] ;
//			
//		}
//		
//		return unique ;
//	}
//	public static void main(String[] args) {
//   int arr[]= {2,3,3,4,2,6,4} ;
//   System.out.println(unique(arr));
//
//}
//}

package demo;

public class OddorEven {
	
	public static int get( int n, int i) {
	    
		int bitmask =~( 1 << i) ;
		return  n & bitmask  ;
		
	}
		
public static void main(String args[]) {
	System.out.println(get(10 ,2));
	
	
}
}

//swap number 
//package demo;
//
//public class string {
//
//
//public static void main(String args[]) {
//	int a = 5 , b = 10 ;
//	
//	a= a ^ b ;
//	b = a ^ b ;  b = a^b^b
//	a = a^ b ; a^a^b  
//	System.out.print(" b" + b);
//	System.out.print(" a" + a);
//}
//}

















