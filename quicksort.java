package demo;

public class quicksort {

public static void quicksort( int arr[] , int si , int ei) {
  if( si >= ei) {
	  return ;
  }
	int pIndx = partition(arr, si ,ei);
	quicksort( arr, si ,pIndx-1);
	quicksort( arr, pIndx+1, ei);
}
public static int partition( int arr[] , int si , int ei) {
     	
	int pivot = arr[ei];
	int i = si-1 ;
	for( int j=si ; j<ei ; j++) {
		if (arr[j] <= pivot) {
			i++;
			int temp =arr[i];
			arr[i]= arr[j];
			arr[j] = temp ;
		}
	}
	i++ ;
	int temp = pivot ;
	arr[ei] =arr[i]	;
	arr[i] = temp ;
	return i ;
}
	public static void main(String args[]) {
	
		int arr[]= {6,3,9,8,2,5};
	    quicksort(arr ,0 , arr.length-1);
	    for ( int i=0 ;i<arr.length ; i++) {
	    	System.out.println(arr[i] );	    
	    	}		
}
}