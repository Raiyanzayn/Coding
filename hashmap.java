package demo;
import java.util.*;
public class hashmap {
	
	
	
	
	
	
	public static void main(String args[]) {
	
	}
}

//public static void print(String[] arr,String query[]) {
//	HashMap<String ,Integer> map=new HashMap<>();
//	int result[]=new int[query.length];
//	for(String str:arr) {
//		map.put(str, map.getOrDefault(str, 0)+1);
//	}
//	
//	for(int i=0 ;i<query.length ; i++ ) {
//	  	result[i]=map.getOrDefault(query[i], 0);
//	  	System.out.println(result[i]);
//	}
//	
//}
//
// public static void main(String args[] )  {
//	String arr[]= {"ab","ab","abc"};
//	String query[]= {"ab","abc"};
//	 print(arr, query);
//     
//      }
//}

	// is Anagram 
//	public static boolean isAnagram(String s , String t) {
//	
//		HashMap<Character , Integer> map=new HashMap<>();
//		for( int i=0 ; i<s.length() ; i++) {
//			char ch=s.charAt(i);
//			map.put(ch, map.getOrDefault(ch, 0)+1);
//		}
//		for( int i=0 ; i<t.length() ; i++) {
//			char ch=t.charAt(i);
//			if( map.get(ch) != null) {
//				if(map.get(ch) == 1) {
//					map.remove(ch);
//				} else {
//					map.put(ch, map.get(ch)-1);
//				}
//			} else {
//				return false ;
//			}
//			
//		}
//		return map.isEmpty();
//		
//	}
//	
//	public static void main(String args[]) {
//  String s="race";
//  String t="care";
//	System.out.print(isAnagram(s , t));
//	}	
//}
	// alternative way
//	public static void main(String args[]) {
//		HashMap<Integer , Integer> map=new HashMap<>();
//		int arr[]= {1,3,2,5,1,3,1,5,1};
//		for( int i=0 ;i<arr.length ; i++) {
//			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
//			
//		}
//		for( int  ans:map.keySet()) {
//			if(map.get(ans) == 1) {
//				System.out.println(ans);
//			}
//		}
//	}	
//	
//
//}
// calculate frequency
//	public static void main(String args[]) {
//		
//		int arr[]= {1,3,2,5,1,3,1,5,1};
//		HashMap<Integer , Integer> map=new HashMap<>();
//		for( int i=0 ; i<arr.length ; i++) {
//			if( map.containsKey(arr[i])) {
//				map.put(arr[i], map.get(arr[i]) +1);
//			} else {
//				map.put(arr[i], 1);
//			}
//		}
//		Set<Integer> arr1= map.keySet();
//		for(Integer ans:arr1) {
//			if( map.get(ans) > arr.length /3)
//		System.out.println(ans);
//	}
//}
















//}