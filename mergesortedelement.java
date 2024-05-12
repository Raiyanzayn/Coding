package demo;
import java.util.*;
public class mergesortedelement {


//class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
  int n = nums1.length ;
  int m = nums2.length ;
  int temp []=new int[n+m];
  int k =0 ;
  for( int i=0 ;i<n ; i++){
      temp[k++]= nums1[i];
  }
for( int j=0 ; j<m ; j++){
    temp[k++] = nums2[j] ;
}
  Arrays.sort( temp) ;
  int total = temp.length;
if ( total %2 == 1){
      return (double) temp[total /2];
} else {
  int middle1= temp[total/2-1];
  int middle2= temp[total/2];
  return ((double) middle1 + (double)middle2) / 2;  
}

    }
    public static void main(String args[]){
        int nums1[] = {1,3};
        int nums2[]= { 2};
        System.out.println(findMedianSortedArrays( nums1 , nums2));
    }
}

