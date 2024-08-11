package com.upskill.assignment_4;

import java.util.Arrays;

public class Assignment_4_5 {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Example usage of the areAnagrams method with an array of strings
        String[] stringArray = {"listen", "silent", "enlist", "google", "inlets", "banana"};

        // Checking for anagram pairs in the array
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if (areAnagrams(stringArray[i], stringArray[j])) {
                    System.out.println("\"" + stringArray[i] + "\" and \"" + stringArray[j] + "\" are anagrams.");
                }
            }
        }
    }
}
