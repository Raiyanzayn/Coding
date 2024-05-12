package demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class main {
    public static void main(String args[])throws Exception {
       
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          
            System.out.println("Enter an integer:");

           
            String input_from_question = br.readLine();
            //int N = Integer.parseInt(input_from_question);

            
            
            
            input_from_question  =  prefix( input_from_question);
             
            
         //  System.out.println("Reversed integer: " + reversed);
            System.out.println(input_from_question);
            
    }
  
    public static String prefix(String input ) {
		
	String longest = " ";
	int n = input.length(); 
	
	for(int i=0 ; i<n ; i++) {
		String prefix = input.substring(0,i);
		String suffix =input.substring(n-i);
		if (prefix.equals(suffix)) {
			longest = prefix;
		}
	}
	
		return longest ;
		
	}
}

