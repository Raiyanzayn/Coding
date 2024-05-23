package demo;




// ex , i/p:str="abbacdfgcesdfeemn";
// there are 2 characters present between 'a'
//  there are 3 characters present between 'c'
// the maximum is 4 ; the o/p is 4
// 4( there are 4 characters present between 'e')
//public class practice {
//	
//    public static void isValid(String str) {
//    	
//    	int input=0;
//    	String temp="";
//    for(int i=0 ;i<str.length() ; i++) {
//    	
//    	for( int j=i+1 ; j<str.length() ; j++) {
//    		if( str.charAt(i) == str.charAt(j)) {
//    			if( input < str.substring(i+1, j).length()) {
//    				temp=str.substring(i+1, j);
//    				 input=temp.length();
//    				 i=j-1;// after comparing a i will not go to second index 
//    				 break; //it will go to 2 index, after the loop updated to 3rd index 
//    			}
//    		}
//    	}
//    
//    }
//	System.out.println(input);
//    }
//    public static void main(String args[]) {
//        // Write your code here
//    	String str="abbacdfgcesdfeemn";
//    	isValid( str);
//          
//    }
//}
  // i/p : String str="b3c6d15";
  // o/p : bbbccccccddddddddddddddd

//public static void isValid(String str) {
//	
//	char ch[]=new char[str.length()];
//	for( int i=0 ; i<str.length() ;i++) {
//		       ch[i]=str.charAt(i);
//		     //  System.out.print(ch[i]);
//	}
//	
//	for( int i=0 ; i<ch.length ; i++) {
//		int num=0;
//		if( ch[i] >='0' && ch[i]<='9') {
//			char temp=ch[i-1];	
//		
//		for(int j=i ; j<ch.length ; j++) {
//			if( ch[i] >='0' && ch[j]<='9') {
//				num=num*10+ch[i]-48;
//			} else {
//				break;
//			}
//			i++;
//		}
//	for( int k=0; k<num ; k++) {
//		System.out.print(temp);
//	}
//	}
//	}
//}
//public static void main(String args[]) {
//    // Write your code here
//	String str="b3c6d15";
//	isValid( str);
//      
//}
//}


//String s="AdamEve";
// s.length=7;
// flames.length=6;
// its flames game we are playing in childhood

//public class practice {
//	
//    public static void isValid(String str1 , String str2) {
//    	
//    	
//    	for(int i=0 ; i<str1.length() ; i++) {
//    		for( int j=0 ; j<str2.length() ; j++) {
//    			if( str1.charAt(i) == str2.charAt(j)) {
//    				str1=str1.replaceFirst("" + str1.charAt(i), " ");
//    				str2=str2.replaceFirst("" + str2.charAt(j), " ");
//    				break;
//    			}
//    			
//    		}
//    		
//    	}
//    	String actual_input=str1.replaceAll(" ", "")+str2.replaceAll(" ", "");
//    String flames="FLAMES";
//    	while( flames.length() != 1) {
//    		int rmv_ch=7%flames.length();
//    		if(rmv_ch != 0) {
//    			flames=flames.substring(rmv_ch)+ flames.substring(0,rmv_ch-1);
//    		}
//    		
//    	}
//    	System.out.println(flames);	
//    }
//    
//    public static void main(String args[]) {
//        String str="FLAMES";
//       String str1="Adam";
//    	String str2="Eve";
//        isValid(str1,str2);
//          
//    }
//}


//
//   i/p:"occurrence"
//     sub="car";
//     character is 'car' is present in input so output will be "ouene"
//
//public class practice {
//		
//    public static void isValid(String str, String sub) {
//    
//    	for( int i=0 ; i<str.length() ; i++) {
//    		for( int j=0 ; j<sub.length() ; j++) {
//    			if(str.charAt(i) == sub.charAt(j)) {
//    			 str= str.replaceFirst(""+ str.charAt(i), " ");
//    				break;
//    			}
//    		}
//    	}
//    	
//    	str= str.replaceAll(" ", "");
//    	System.out.println(str);
//    }
//    
//    public static void main(String args[]) {
//       String str="occurrence";
//       String sub="car";
//       isValid(str, sub);
//    }
//}


//
//  i/p : 4
//   o/p: 2 , the sqrt of 2 is 4
//  i/p : 5
//  o/p : 2 is nearby value ;the sqrt of 2 is 4 , but not 3  the sqrt of 3 is 9
//public static int isValid(int N) {
//	
//    int start=1;
//    int end=N;
//    int ans=0;
//    
//    while( start < end) {
//    	
//    int mid=(start+end)/2;
//    if( mid*mid == N) {
//    	return mid;
//    } else if( mid*mid < N) {
//    	start=mid+1;
//    	ans=start;
//    } else {
//    	end=mid-1;
//    }
//    }
//    return ans;
//    }
//    
//    public static void main(String args[]) {
//    	int N=4;
//    	System.out.println(isValid(N));
//    	 
//    }
//}


























