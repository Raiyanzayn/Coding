package demo;
import java.util.*;
public class returntype {

public static void print(int k){
 int nums[]= {1,1,2};
 k = removeDuplicates(nums) ;
for( int i=0 ; i<k ; i++){
    System.out.println(nums[k]);
}
}


    public static int removeDuplicates(int[] nums) {

LinkedHashSet<Integer> set =new LinkedHashSet<>(); 
int cnt=0;
for( int i=0 ; i<nums.length ; i++){
      set.add(nums[i]);
      cnt ++ ;
}
  return set.size();
    }
		}