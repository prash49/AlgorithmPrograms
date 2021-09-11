package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Range to Find Prime Numbers");
        int size = scanner.nextInt();
        int[] primeNumbersArray;
        primeNumbersArray = primeNumbers(size);
        primeAnagram(primeNumbersArray);
    }

    private static void primeAnagram(int[] primeNumbersArray) {
        int len = primeNumbersArray.length;
        boolean status = false;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                status = AnagramInteger(primeNumbersArray[i], primeNumbersArray[j]);

            }
        }
    }

    private static boolean AnagramInteger(int num1, int num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        boolean status = Anagram(str1, str2);
        return status;
    }

    private static boolean Anagram(String str1, String str2) {
        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();
        Arrays.sort(string1);
        Arrays.sort(string2);
        boolean isAnagram = false;
        isAnagram = Arrays.equals(string1, string2);
        if (isAnagram == true) {
            System.out.println(str1 + " , " + str2 + " are Anagram Strings");
            return isAnagram;
        } else
            System.out.println(str1 + " , " + str2 + " are not Anagram Strings");
        return isAnagram;

    }

    private static int[] primeNumbers(int size) {
        int a[] = new int[size];
        int k = 0;
        for (int i = 0; i < size; i++) {
            if (isPrime(i)) {
                a[k] = i;
                k++;
            }
        }
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0)
                len++;
        }

        int[] newArray = new int[len];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                newArray[j] = a[i];
                j++;
            }
        }
        return newArray;
    }

    private static boolean isPrime(int size) {
        for (int i = 2; i <= size / 2; i++) {
            if (size % i == 0) {
                return false;
            }
        }
        return true;
    }
}
