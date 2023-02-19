import java.util.*;
import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            String sc = s.nextLine().toLowerCase();
            int count = 0;
            for (int i = 0; i < sc.length(); i++) {
                char ch = sc.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            System.out.println("count of vowels is :" + count);
            s.close();
        }
        {/*
          * Search and read about
          * a. intern( ) method in String
          * b. StringBuffer
          */
            String str1 = "earth";
            String str2 = "heart";
            // Convert Strings to lowercase. Why? so that we don't have to check separately
            // for lower & uppercase.
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            // First check - if the lengths are the same
            if (str1.length() == str2.length()) {
                // convert strings into char array
                char[] str1charArray = str1.toCharArray();
                char[] str2charArray = str2.toCharArray();
                // sort the char array
                Arrays.sort(str1charArray);
                Arrays.sort(str2charArray);
                // if the sorted char arrays are same or identical then the strings are anagram
                boolean result = Arrays.equals(str1charArray, str2charArray);
                if (result) {
                    System.out.println(str1 + " and " + str2 + " are anagrams of each other.");
                } else {
                    System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
                }
            } else {
                // case when lengths are not equal
                System.out.println(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        }
    }
}