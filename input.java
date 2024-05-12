package demo;
import java.util.*;
public class input {
	
//	    public static void main(String[] args) {
//	        Scanner scanner = new Scanner(System.in);
//
//	        // Read input
//	        int N = scanner.nextInt();
//	        scanner.nextLine(); // Consume the newline character
//	        String S = scanner.nextLine();
//
//	        // Process input and print output
//	        System.out.println(N * 2);
//	        System.out.println(S);
//	    }
//	}

	 public static void main(String args[] ) throws Exception {
         Scanner s = new Scanner(System.in);
//        int N = s.nextInt(); 
//         int K=s.nextInt();
//         s.nextLine();
        String st=s.nextLine();
  String str="";
  char arr[]=st.toCharArray();
for( int i=0 ; i<arr.length ;i++){
    if( arr[i] != '6'){
        str+= arr[i];
    }
}

 int num = Integer.parseInt(str); // Convert string to integer
        int ans = num % K; // Calculate the modulus
        
        System.out.println(ans );
    }
}