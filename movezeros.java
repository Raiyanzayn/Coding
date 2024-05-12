package demo;
import java.util.*;
public class movezeros {

	public class leaderofarray {

	}

	public static int[] movezero( int arr[]) {
		
		ArrayList<Integer> temp = new ArrayList<>();
		for( int i=0; i<arr.length ;i++) {
			if ( arr[i] != 0) {
				  temp.add(arr[i]);
			}	
		}
		int nz = temp.size() ;
		for( int i=0 ; i<nz ; i++) {
		arr[i]=	temp.get(i);
		}
		
		for( int i=nz ; i<arr.length ; i++) {
			arr[i] =0 ;
		}		
		return arr ;
	}
	
	public static void main(String args[]) {
		int arr[] = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
		int[] ans = movezero(arr);
		for( int i=0 ; i<ans.length ; i++) {
			System.out.print(ans[i]);
		}
		System.out.println();
	}
}



