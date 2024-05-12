package demo;

public class twosum {
	    public  static  boolean twosum(int[] arr , int target) {
	 int n = arr.length ;
	    for(int i=0 ; i<n ; i++) {
	    	for( int j=0 ; j<n ; j++) {
	    		if ( arr[i] + arr[j] == target) {
	    			return true ;
	    			
	    		}
	    		
	    	}
	    	
	    }
	    	
	    return false ;
	    	
	    	
	    }
	    public static void main(String args[]){
	    	 
	    	  int arr[]= {1,2,3,4,5};
	            int target = 111 ;
	            System.out.println(twosum(arr, target));
	}
	}

//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{}; // No solution found
//    }
//}