package demo;

public class evenlength {

	public static void main(String args[]) {
		
     String input = " the sky is very high";
     String[] input1 = input.split(" ");
     for( String   output:input1) {
    	 if( output.length() %2 == 0) {
    		 System.out.println(output);
    	 }
     }
     
}
}




















