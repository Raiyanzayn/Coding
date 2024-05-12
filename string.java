//package demo;
//
//public class string {
//
//public static boolean palindrome(String str) {	
//	
//	for( int i=0 ; i<str.length()/2 ; i++) {
//		   int n =str.length();
//		if( str.charAt(i)  != str.charAt(n-i-1))
//		 return false ;
//	}
//	return true ;	
//}
//public static void main(String args[]) {
//	String str = "racecarw";
//	System.out.println(palindrome(str));
//}
//}
//
//package demo;
//
//public class string {
//
//public static String substring(String str, int si , int ei) {	
//
//	String substr= "";
//	for( int i=si ; i<ei ; i++) {
//		 substr += str.charAt(i);
//		
//		
//	}
//	return substr ;
//	
//	
//
//}
//public static void main(String args[]) {
//	
//	String str = "Hello world";
//	System.out.print(substring(str ,0 ,5));
//	
//}
//}
//
//
//
//package demo;
//
//public class string {
//
//public static String toUpper(String str) {	
//
//	StringBuilder sb = new StringBuilder("");
//	char ch = Character.toUpperCase(str.charAt(0)); 
//	sb.append(ch);
//	for( int i= 1; i<str.length() ; i++) {
//		if ( str.charAt(i)== ' ' && i<str.length()-1) {
//			sb.append(str.charAt(i)) ;
//			i++ ;
//			sb.append(Character.toUpperCase(str.charAt(i)));
//		} else {
//			sb.append(str.charAt(i));
//		}	
//	}
//	return sb.substring(0);
//}
//public static void main(String args[]) {
//	
//	String str = "hi i am raiyan";
//	System.out.println(toUpper(str));
//	
//}
//}


// swap number 
//package demo;
//
//public class string {
//
//
//public static void main(String args[]) {
//	int a = 5 , b = 10 ;
//	
//	a= a ^ b ;
//	b = a ^ b ;
//	a = a^ b ;
//	System.out.print(" b" + b);
//	System.out.print(" a" + a);
//}
//}

// reverse string
//package demo;
//import java.util.* ;
//public class practice{
//	 
//	    public static void main(String args[]){
//	    String s= "raiyan is talent";
//	    String[] arr = s.split(" ");
//	     int start = 0 ;
//	     int end = arr.length-1 ;
//	     
//	   while( start < end){
//	    String temp = arr[start];
//	    arr[start] = arr[end];
//	    arr[end]= (String)temp ;
//	   start ++ ;
//	   end -- ;
//
//	   }
//	    for( int i=0 ; i<arr.length ; i++) {
//	    	System.out.print(arr[i] + " ");
//	    }
//	    System.out.println();
//	    }
//	}
//



//
//package demo;
//import java.util.* ;
//public class practice{
//	
//	public static void remove(String str) {
//		
//		char[] arr= str.toCharArray();
//		LinkedHashSetSet<Character> arr1 = new LinkedHashSet<>();
//		for( char  array: arr) {
//			arr1.add(array);
//		}
//		System.out.println(arr1);
//		
//	}
//	 
//	    public static void main(String args[]){
//	    String str= "java";
//	    remove(str);
//	   }
//	    
//	}



//package demo;
//import java.util.* ;
//public class practice{
//	 
//	    public static String[] reverseWords(String s) {
//	        String[] arr = s.split(" ");
//	     int start = 0 ;
//	     int end = arr.length-1 ;
//	     
//	   while( start < end){
//	    String temp = arr[start];
//	    arr[start] = arr[end];
//	    arr[end] =(String) temp ;
//	   start ++ ;
//	   end -- ;
//
//	   }
//	    return arr ;
//	    }
//	    public static void main(String args[]){
//	    String s= "the sky is blue";
//	   String arr[]= reverseWords(s);
//	    for(int i=0 ; i<arr.length ; i++) {
//	      System.out.print(arr[i]);
//	    }
//	    System.out.println();
//	}
//}



// count of vowels,space,consonant
//package demo;
//import java.util.* ;
//public class practice{
//
//	public static void length(String str ) {
//                 int count =0 ;	
//                int count1 =0 ;
//                int count2=0 ;
//		for( int i=0 ; i<str.length() ; i++) {
//			 char ch = str.charAt(i);
//			if (str.charAt(i) == ' ') {
//				count ++ ;
//			} else if ( ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
//				count1 ++ ;
//			} else {
//				count2++ ;
//			}
//		}
//    System.out.println(" the space are" +" "+ count);
//    System.out.println(" the vowels are" +" "+ count1);
//    System.out.println(" the vowels are" +" "+ count2);
//	
//		
//	}
//	public static void main(String args[]) {
//	
//        String str = "raiyan is the talent";
//	length(str);
//	
//	
//	}
//}





//  remove vowels 
//
//package demo;
//import java.util.* ;
//public class practice{
//
//	public static void length(String str ) {
//       ArrayList<Character> temp = new ArrayList<>();
//       ArrayList<Character> temp1 = new ArrayList<>();
//		for( int i=0 ; i<str.length() ; i++) {
//			char ch = str.charAt(i);
//			if( ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ){
//			     	temp.add(ch);
//			} else {
//				    temp1.add(ch);
//			}
//			
//			
//		}
//		StringBuilder org= new StringBuilder();
//		for( int i=0 ; i<temp1.size() ; i++) {
//                   org.append(temp1.get(i));
//		}
//		  String org1 =org.toString();
//		
//		System.out.println(org1);
//
//		
//	}
//	public static void main(String args[]) {
//	
//        String str = "raiyan is the talent";
//	length(str);
//	}
//}
//
//   return only character
//package demo;
//import java.util.* ;
//public class practice{
//
//	public static void length(String str,int n ) {
//          StringBuilder sb= new StringBuilder();
//		
//          for(int i=0 ; i<n ;i++) {
//        	  int ascii= str.charAt(i);
//        	  if (ascii >= 65 && ascii<=90 || ascii>=97 && ascii <=192 ) {
//                  sb.append(str.charAt(i));    		  
//        	  }
//         
//          }
//		String org = sb.toString();
//		
//		System.out.println(org);
//	}
//	public static void main(String args[]) {
//	
//        String str = "take12% *&u ^$#forward";;
//        int n = str.length();
//	length(str,n);
//	}
//}
//
// remove brackets
//package demo;
//import java.util.* ;
//public class practice{
//
//	public static void length(String str ) {
//          StringBuilder sb= new StringBuilder();
//		
//          for(int i=0 ; i<str.length();i++) {
//        	  if (str.charAt(i) != '('  && str.charAt(i) != ')'   )
//        	  sb.append(str.charAt(i));
//          }
//          
//          String org = sb.toString();
//          System.out.println(org);     
//	}
//	public static void main(String args[]) {
//	
//        String str = " “a+((b-c)+d)”";
//	length(str);
//	}
//}



//
//User
//
//please fix this code don't do any alternative ont his code
//Given a string s, reverse only all the vowels in the string and return it.
//
//The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
//
// 
//
//Example 1:
//
//Input: s = "hello"
//Output: "holle"
//	class Solution {
//    public String reverseVowels(String s) {
//        int lengthOfString = s.length();
//        char ch[] = s.toCharArray();
//        int start = 0;
//        int end = lengthOfString - 1;
//        while(start < end) {
//            if(!isVowel(ch[start])) {
//                start++;
//            }
//            else if(!isVowel(ch[end])) {
//                end--;
//            }
//            else {
//                char temp = ch[start];
//                ch[start] = ch[end];
//                ch[end] = temp;
//                start++;
//                end--;
//            }
//        }
//        return String.valueOf(ch);
//        
//    }
//     public static boolean isVowel(char ch) {
//        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//            return true;
//        }
//        return false;
//        
//    }
//}




//
//
//package demo;
//import java.util.* ;
//public class practice{
//	    public static void rearrange(String str1,String str2) {
//	    char arr1[]= str1.toCharArray();
//	    char arr2[]= str2.toCharArray();
//	    char arr[] =new char[6];
//	    ArrayList<Character> set1 = new ArrayList<>();
//	    ArrayList<Character> set2 = new ArrayList<>(); 
//	    ArrayList<Character> set = new ArrayList<>();
//
//	    	for( int i=0 ; i<arr1.length ; i++) {
//	    		set1.add(arr1[i]);
//	    	}
//	    	for( int i=0 ; i<arr2.length ; i++) {
//	    		set2.add(arr2[i]);
//	    	}
//	     for( int i=0 ; i<3 ; i++) {
//	    	  arr[i*2]= set1.get(i);
//	    	  arr[i*2+1]= set2.get(i);
//	    	 // arr1[i*2]= set2.get(i);
//	     }
//	    for( int i=0 ; i<arr.length ; i++) {	
//	    	System.out.println(arr[i]);
//	    }
//	     
//	     
//	    }
//
//	public static void main(String args[]) {
//      String str1 = "abc";
//      String str2= "pqr";
//	rearrange( str1 , str2);
//	}
//
//		}

//package demo;
//import java.util.* ;
//public class practice{
//
//		    public static String mergeAlternately(String word1, String word2) {
//		            String result = "";  
//		          char temp[] = new char[6];
//		      char[] c1 = word1.toCharArray();
//		       char[] c2 = word2.toCharArray();
//		    for(int i=0 ; i<word1.length() ; i++){
//		    	       temp[ i*2 ] =c1[i];
//		                temp[ i*2 +1] =c2[i];
//		    }
//		   for( char num: temp){
//		       result += num ;
//		   }
//
//
//
//		         return result ;
//		    }
//		    
//		
//
//	public static void main(String args[]) {
//		
//		String word1 = "abc";
//		String word2 = "pqr";
//	System.out.println(mergeAlternately( word1,  word2));
//
//	}
//	}
//











//package demo;
//import java.text.DecimalFormat;
//import java.util.* ;
//public class practice{
//	public static void main(String args[]) {
//		
//		DecimalFormat df2 =new DecimalFormat("0.00");
//		Scanner sc= new Scanner (System.in);
//
//		System.out.println("Enter the no of liters to fill the tank");
//		int ltt =sc.nextInt();
//		double lt= (ltt*1.00);
//
//		if(ltt<1){
//		System.out.println(ltt+" is an Invalid Input");
//		System.exit(0);
//		}
//		System.out.println("Enter the distance covered");
//		int diss =sc.nextInt();
//		double dis= (diss*1.00);
//
//		if(diss<1){
//		System.out.println(diss+" is an Invalid Input");
//		System.exit(0);
//		}
//
//		double hundered = ((lt/dis)*100);
//		System.out.println("Liters/100KM");
//		System.out.println(df2.format(hundered));
//
//		double miles = (dis*0.6214);
//		double gallons =(lt*0.2642);
//		double mg = miles/gallons;
//		System.out.println("Miles/gallons");
//		System.out.println(df2.format(mg));




//you hava an string array , i need  to add a  character which  present in an array , code in java code 
//  i /p :String arr[] = {"aabb11","12rtf345" , "qwc3344" } ;
//o/p :  aabbrtfqwc

//public class Main {
//    public static void main(String[] args) {
//        String[] arr = {"aabb11", "12rtf345", "qwc3344"};
//        String concatenated = concatenateNonDigits(arr);
//        System.out.println(concatenated);
//    }
//
//    public static String concatenateNonDigits(String[] arr) {
//        StringBuilder sb = new StringBuilder();
//        for (String str : arr) {
//            for (char ch : str.toCharArray()) {
//                if (!Character.isDigit(ch)) {
//                    sb.append(ch);
//                }
//            }
//        }
//        return sb.toString();
//    }
//}

// if speacial character present in the output = {abcdcvfer%$^&*)  use below code instead of 491 code line
//    	  if (!Character.isDigit(ch) && Character.isAlphabetic(ch) ) {
//              sb.append(ch);




//you hava an string array , i need  a sum of digit present in an array in java code 
//  i /p :String arr[] = {"aabb11","12rtf345" , "qwc3344" } ;
//o/p :  31 

//public class Main {
//    public static void main(String[] args) {
//        String arr[] = {"aabb11", "12rtf345", "qwc3344"};
//        int sum = sumOfDigits(arr);
//        System.out.println("Sum of digits: " + sum);
//    }
//
//    public static int sumOfDigits(String[] arr) {
//        int sum = 0;
//        for (String str : arr) {
//            for (char ch : str.toCharArray()) {
//                if (Character.isDigit(ch)) {
//                    sum += Character.getNumericValue(ch);
//                }
//            }
//        }
//        return sum;
//    }
//}

// if i want to get output only special character 
// o/p : +_(*%$#@#**&&

//public class practice{ 
//	
//	public static String check(String[] arr) {
//     String temp = "";
//     StringBuilder sb = new StringBuilder();
//    for(String str:arr) {
//    	for(char num:str.toCharArray()) {
//    		int k =0 ;
//    		if(!Character.isDigit(num) && !Character.isAlphabetic(num) ) {
//    		 sb.append(num);
//    		}
//    	}
//    }
//		
//		return sb.toString() ;
//		
//}
//	
//public static void main(String[] args) {
//	String arr[] = {"aabb11+_(*","12rtf345%$#@#" , "qwc3344**&&" } ;
//	System.out.println(check(arr));
//	
//}
//}







//package demo;
//
//import java.util.* ;
//
//
//public class practice{
//  public static void removevowels(int num) {
//	 
//for(int i=1 ; i<16 ; i++) {
//	if  (i %3 ==0 && i%5==0) {
//		System.out.println ( i + " " + "FizzBuzz");
//	} else if ( i%3 ==0) {
//		System.out.println (i + " " +"Fizz");
//	} else if (i%5==0) {
//		System.out.println ( i + " " + "Buzz");
//	} else {
//		System.out.println (i + " ");
//	}
//	
//	}
//}
//	  
//  
//
//	    public static void main(String[] args) {
//	    	int num = 3;
//	    	 removevowels(num);
//  }
//}



//Write a program that prints the numbers from 1 to n. But for multiples of three,
//print "Fizz" instead of the number, and for the multiples of five, print "Buzz".
//For numbers which are multiples 
//of both three 
//and five, print "FizzBuzz".




//package demo;
//
//public class longestsub {
////	public class Main {
//	    public static void main(String[] args) {
//	        String input = "a1bcdefgh2ijklmnopq3rst4uvw5xyz"; // Example input string
//	        String longestSequence = findLongestAlphabeticalSequence(input);
//	        System.out.println("Longest alphabetical sequence: " + longestSequence);
//	    }
//
//	    public static String findLongestAlphabeticalSequence(String input) {
//	        String longestSequence = "";
//	        String currentSequence = "";
//
//	        for (int i = 0; i < input.length(); i++) {
//	            char currentChar = input.charAt(i);
//
//	            // Check if the character is an alphabet
//	            if (Character.isAlphabetic(currentChar)) {
//	                currentSequence += currentChar;
//	            } else {
//	                // Check if currentSequence is longer than longestSequence
//	                if (currentSequence.length() > longestSequence.length()) {
//	                    longestSequence = currentSequence;
//	                }
//	                // Reset currentSequence
//	                currentSequence = "";
//	            }
//	        }
//
//	        // Check if the last sequence is longer than longestSequence
//	        if (currentSequence.length() > longestSequence.length()) {
//	            longestSequence = currentSequence;
//	        }
//
//	        return longestSequence;
//	    }
//}


//package demo;
//public class practice {
//	
//	public static String prefix(String input ) {
//		
//	String longest = " ";
//	int n = input.length(); 
//	
//	for(int i=0 ; i<n ; i++) {
//		String prefix = input.substring(0,i);
//		String suffix =input.substring(n-i);
//		if (prefix.equals(suffix)) {
//			longest = prefix;
//		}
//	}
//	
//		return longest ;
//		
//	}
//	public static void main(String args[]) {
//		String input = "ababcbabab";
//		System.out.println(prefix(input));
//	}
//}








































