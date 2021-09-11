package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AnagramDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String");
        String str1 = scanner.next().toLowerCase();
        System.out.println("Enter second String");
        String str2 = scanner.next().toLowerCase();
        anagram(str1, str2);
    }

    private static void anagram(String str1, String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isAnagram = false;
        isAnagram = Arrays.equals(string1, string2);
        if (isAnagram) {
            System.out.println(str1 + " , " + str2 + " are Anagram Strings");
        } else
            System.out.println(str1 + " , " + str2 + " are not Anagram Strings");


    }
}

