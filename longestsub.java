package demo;

public class longestsub {
//	public class Main {
	    public static void main(String[] args) {
	        String input = "a1bcdefgh2ijklmnopq3rst4uvw5xyz"; // Example input string
	        String longestSequence = findLongestAlphabeticalSequence(input);
	        System.out.println("Longest alphabetical sequence: " + longestSequence);
	    }

	    public static String findLongestAlphabeticalSequence(String input) {
	        String longestSequence = "";
	        String currentSequence = "";

	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);

	            // Check if the character is an alphabet
	            if (Character.isAlphabetic(currentChar)) {
	                currentSequence += currentChar;
	            } else {
	                // Check if currentSequence is longer than longestSequence
	                if (currentSequence.length() > longestSequence.length()) {
	                    longestSequence = currentSequence;
	                }
	                // Reset currentSequence
	                currentSequence = "";
	            }
	        }

	        // Check if the last sequence is longer than longestSequence
	        if (currentSequence.length() > longestSequence.length()) {
	            longestSequence = currentSequence;
	        }

	        return longestSequence;
	    }
}













