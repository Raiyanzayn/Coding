package demo;
import java.util.* ;
public class sagent {

		public static void sort(int arr[] ) {
		int n = arr.length ;
		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> temp1 = new ArrayList<>();
		for( int i=0 ; i<n ; i++) {
			
			if ( arr[i] %2 != 0) {
		         temp.add(arr[i]);		
			} else {
				temp1.add(arr[i]);
			}	
		}
		int n1 = temp.size();
			for( int i=0 ; i<n1-1; i++) {
				for( int j=0 ;j<n1-1-i ; j++) {
					if (temp.get(j) < temp.get(j+1)) {
					int temp2 = temp.get(j);
					temp.set(j, temp.get(j+1));
					temp.set(j+1, temp2);	
				}
				}		
			}
			int n2 = temp1.size();
			for( int i=0 ; i<n2-1; i++) {
				for( int j=0 ;j<n2-1-i ; j++) {
					if (temp1.get(j) > temp1.get(j+1)) {
					int temp3 = temp1.get(j);
					temp1.set(j, temp1.get(j+1));
					temp1.set(j+1, temp3);	
				}
				}		
			}
			for( int i=0 ; i<4; i++) {
				               arr[i] = temp.get(i);
			}
			for( int i=0 ; i<2;i++) {
				arr[i+4] = temp1.get(i);
			}
			for(int i=0 ; i<n ; i++) {
				System.out.println(arr[i]);
			}
		}
		public static void main(String args[]) {
		
		int arr[] = {1,2,3,5,4,7,10} ;
		sort(arr);
		}
	}


//package demo;
//import java.util.* ;
//public class practice{
//	public static int length(int arr1[], int arr2[]) {
//  
//   HashSet <Integer> set =new HashSet<>();
//   for( int  num:  arr1) {
//	   set.add(num);
//   }
//		for( int num1 : arr2) {
//			if ( !set.contains(num1)) {
//				return 0 ;
//			}
//		}
//		
//		return 1 ;
//		
//      }
//	
//	public static void main(String args[]) {
//	int arr1[]= {8,77,2,4,5,42,0};
//	int arr2[]= {2,4,5,77,8,0};
//	System.out.println(length(arr1, arr2));
//
//	}


//
//package demo;
//import java.util.* ;
//public class practice{
//	public static void length(String str) {
//  
//		String[] arr= str.split(" ");
//		for( int i=arr.length-1 ; i>=0 ;i-- ) {
//				System.out.print(arr[i]);
//				System.out.print(".");
//			}
//			
//		}
//		
//      
//	
//	public static void main(String args[]) {
//		
//		String str ="World is my country";
//		length(str);
//
//	}
//}
//
//
//package demo;
//import java.text.DecimalFormat;
//import java.util.* ;
//public class practice{
//	
//	public static String rearrange(String str) {
//		ArrayList<Character> arr1= new ArrayList<>();
//		ArrayList<Character> arr2= new ArrayList<>();
//		ArrayList<Character> arr3= new ArrayList<>();
//		ArrayList<Character> arr4= new ArrayList<>();
//	     String temp = "";	
//		char arr[]= str.toCharArray();
//		for(int i=0 ; i<5 ; i++) {
//			   arr1.add(arr[i]);
//		}
//		Collections.sort(arr1);
//		
//		for(char num : arr1) {
//		       temp += num; 
//		}
//		//char arr[]= str.toCharArray();
//		for(int i=5 ; i<10 ; i++) {
//			   arr2.add(arr[i]);
//		}
//		Collections.sort(arr2);
//		
//		for(char num : arr2) {
//		       temp += num; 
//		}
//		//char arr[]= str.toCharArray();
//		for(int i=10 ; i<15 ; i++) {
//			   arr3.add(arr[i]);
//		}
//		Collections.sort(arr3);
//		
//		for(char num : arr3) {
//		       temp += num; 
//		}
//		//char arr[]= str.toCharArray();
//		for(int i=15 ; i<arr.length ; i++) {
//			   arr4.add(arr[i]);
//		}
//		Collections.sort(arr4);
//		
//		for(char num : arr4) {
//		       temp += num; 
//		}
//		return temp ;
//	}
//	public static void main(String args[]) {
//       String str= "32453985637426374532";
//      System.out.println(rearrange(str));
//		}
//		}



//package demo;
//import java.util.* ;
//public class practice{
//	
//	public static int remove(String[] arr) {
//		//String arr1=arr.split("");
//		//char[] str = arr.toCharArray();
//		int sum =0 ;
//		for( String str:arr) {
//		   for (char ch : str.toCharArray()) {
//	     if (Character.isDigit(ch) ) {
//	    	 sum += Character.getNumericValue(ch);
//	     }
//		   }
//	}
//		return sum ;
//	}
//	    public static void main(String args[]){
//	  String arr[] = {"aabb11","12rtf345" , "qwc3344" } ;
//	  System.out.println(remove(arr));
//	  
//	   }
//	    
//}
//
//

//package demo;
//import java.util.*;
//public class practice {
//	public static void reverse(int nums[], int start, int end){
//
//		while( start < end){
//		 int temp = nums[start];
//		 nums[start] = nums[end] ;
//		 nums[end] = temp ;
//		   start++ ;
//		   end-- ;
//		}
//		}
//
//		    public static void rotate(int[] nums, int k) {
//		      //   k %= nums.length ;
//		  reverse(nums, 0, nums.length-1);
//		   reverse(nums, 0, k-1);
//		 reverse(nums, k, nums.length-1);
//		 for(int i=0 ; i<nums.length ; i++) {
//		System.out.print(nums[i] + " ");
//		    }
//		    }
//		    public static void main(String args[]){  
//            int nums[] = {1,2,3,4,5,6,7};
//            int k=3 ;
//            rotate( nums,k);
//		  	}
//		    
//		}


