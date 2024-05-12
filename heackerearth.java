package demo;

public class heackerearth {
// product of subarray
//	  int product=1;
//      int sum=0;
//      for(int i=0 ; i<N ; i++){
//          for( int j=i ; j<N ; j++){
//              for( int k=i ; k<=j; k++){
//                 product*=num[k];  
//              }
//             System.out.println(product);
//           product=1; 
//          }
//      }
//	Explanation
	//   arr=2 4 6 36
//	Three subarrays with product of elements as a perfect cube are:
//	(2,4) product is 8(2^3)
//	 (6,36)product is 216(6^3)
//	(2 4 6 36) product is 1728(2^3)

//	int product=1;
//    int sum=0;
//    int cnt=0;
//    for(int i=0 ; i<N ; i++){
//        for( int j=i ; j<N ; j++){
//            for( int k=i ; k<=j; k++){
//               product*=num[k];  
//            }
//         int cuberoot=(int)Math.cbrt(product);
//         if( cuberoot*cuberoot*cuberoot == product){
//            cnt++;
//         }
//         product=1;
//        }
//    }
//System.out.println(cnt);	
	
	
	
	//Largest Number ,num=3412 
//	o/p
//	After removing exactly 
//	 1 digit, we can make
//	412
//	312
//	342
//	341
//	Among, them 412
//	 is the largest possible number.
//	 Scanner s = new Scanner(System.in);
//     int N=s.nextInt(); 
//     int K=s.nextInt();
//     String str="";
//     int max=0;
//char arr[]=Integer.toString(N).toCharArray();
//for( int i=0 ; i<arr.length ; i++){
// for( int j=0 ; j<arr.length ; j++){
//     if(arr[i] != arr[j]){
//         str+=arr[j];
//         
//     }
// }
// int ans=Integer.parseInt(str);
//  max=Math.max(max ,ans);
//
//    str="";
//}         
//
//System.out.println(max);
//
// }
//}
	
	
	
//
//	The first line represents the number of test cases, T=1.
//
//			S = "andadds"
//			k = "d"
//			Approach
//
//			Since the number of occurrences of "d" in S is 3, the answer is 3.
//	static int solve(String S, char k){
//	       // Write your code here
//	       HashMap<Character,Integer> map=new HashMap<>();
//	        int result = 0;
//	        for( int i=0 ; i<S.length() ; i++){
//	            char ch =S.charAt(i);
//	            map.put( ch , map.getOrDefault( ch , 0)+1 );
//	        }
//	       for(Map.Entry<Character,Integer> entry : map.entrySet()) {
//	            if(entry.getKey() == k) {
//	                return entry.getValue();
//	        }
//	      }
//
//
//	        return result;


//	n = 7
//			s = "babbaaa" (without quotes)
//			Approach:
//
//			Choose 3rd character in the string for 1st operation, this will delete the 1st character and 4th character in string s, the string becomes "abaaa".
//			Choose 3rd character in the string for 2nd operation, this will delete the 1st character and 4th character in string s, the string becomes "baa".
//			Choose 3rd character in the string for 3rd operation, this will delete the 2nd character in string s, the string becomes "ba".
//			The length of the string s can not be reduced further.
//			Hence, the minimum number of operations needed to reduce the length of the string s to a minimum is 3.
//	 static int Minimum_Operations(int n, String s){
//	       // Write your code here
//	        int result = 0;
//	        ArrayList<Character> arr=new ArrayList<>();
//	        for(int i=0 ; i<s.length() ; i++){
//	            char ch =s.charAt(i);
//	            arr.add(ch);
//	        }
//	        int cnt=0;
//	        int i=0;
//	        int j=arr.size()-1;
//	        int choose=arr.get(2);
//	        while( i < j){
//	            char ch1= s.charAt(i);
//	            char ch2=s.charAt(j);
//	           if(ch1 != choose){
//	             i++;
//	           } else if( ch2 != choose){
//	            j--;
//	            if( arr.size() == 3) {
//		            	cnt++;
//		            }
//	           } else{
//	            arr.remove((Character)ch1);
//	            arr.remove((Character)ch2);
//	            cnt++;
//	            
//	            i=0;
//	         j=arr.size()-1;
//	          if (arr.size() > 2) {
//	                    choose = arr.get(2);
//	                } else{
//	                    cnt++;
//	                }
//	           }
//	     
//	        }
//
//
//
//
//	        return cnt;
//	    
//	    }
//	}











}
