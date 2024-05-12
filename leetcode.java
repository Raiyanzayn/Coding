package demo;

public class leetcode {

}


//public static String longestCommonPrefix(String[] strs) {
//    LinkedHashSet<Character> set = new LinkedHashSet<>();
//    String temp = "";
//
//    // Flag to track if a common prefix is found
//    boolean prefixFound = false;
//
//    for (String str : strs) {
//        if (!prefixFound) {
//            set.clear(); // Clear the set before processing each string
//            for (char num : str.toCharArray()) {
//                if (num == 'f' || num == 'l') {
//                    set.add(num);
//                }
//            }
//
//            // Check if the set contains both 'f' and 'l'
//            if (set.contains('f') && set.contains('l')) {
//                for (char num1 : set) {
//                    temp += num1;
//                }
//                prefixFound = true; // Set flag to true once prefix is found
//            }
//        }
//    }
//    return temp;
//}
//
//public static void main(String[] args) {
//    String[] strs = {"flower", "flow", "flight"};
//    System.out.println(longestCommonPrefix(strs)); // Output: fl
//}
//}