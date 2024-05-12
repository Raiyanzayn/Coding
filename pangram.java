package demo;

public class pangram {

	public static boolean pangram(String input) {
		input.toLowerCase();
		if (input.length() < 26) {
			return false ;
		}
		
		for( char i ='a'; i<= 'z' ; i++) {
			if ( input.indexOf(i) < 0) {
				return false ;
			}
			
			
		}
		return true ;
	}
	public static void main(String args[]) {
	String input= "The quick brown fox jumps over a lazy dog ";
	System.out.println(pangram( input));
	}	
}





