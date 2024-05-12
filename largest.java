package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class largest {
	
	public static int print(String str) {
		
		char arr[]=str.toCharArray();
		boolean visited[]=new boolean[arr.length];
		int cnt =0 ;
		for(int i=0; i<arr.length ; i++) {
			if(visited[i] == true) {
				continue ;
			}
			
			for( int j=i+1 ; j<arr.length ; j++) {
				if(arr[i] == arr[j] ) {
					cnt++;
					i++;	
				if(	visited[j] =true) {
					continue;
				}
					}	
				}
			}
	         return cnt ;

		}
		
		
	
	
	
    public static void main(String args[])  {
       String str= ")()()(";
      System.out.println( print(str));
    }
}
