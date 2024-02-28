package string;

import java.util.Arrays;

public class anagram {
	 public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        
	        boolean areAnagrams = checkAnagram(str1, str2);
	        
	        if (areAnagrams) {
	            System.out.println("The strings are anagrams.");
	        } else {
	            System.out.println("The strings are not anagrams.");
	        }
	    }
	    
	    public static boolean checkAnagram(String str1, String str2) {
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();
	        
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        return Arrays.equals(charArray1, charArray2);
	    }
}
