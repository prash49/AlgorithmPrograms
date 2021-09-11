package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        System.out.println("Enter the Size of the Array");
        int size = scanner.nextInt();
        System.out.println("Enter Values into the List ");
        for (int i = 0; i < size; i++) {
            String input = scanner.next();
            list.add(input);
        }
        String[] stringArray = new String[list.size()];
        stringArray = list.toArray(stringArray);
        System.out.println("\nBefore insertion sort");
        display(stringArray);
        insertionSort(stringArray);
        System.out.println("\nafter Insertion Sort");
        display(stringArray);

    }


    private static void insertionSort(String[] stringArray) {
        int length = stringArray.length;
        int j;
        String temp;
        for (int i = 0; i < length; i++) {
            j = i;
            temp = stringArray[i];
            while (j > 0 && temp.compareTo(stringArray[j - 1]) < 0) {//
                stringArray[j] = stringArray[j - 1];
                j = j - 1;
            }
            stringArray[j] = temp;//insert unsorted element
        }
    }

    private static void display(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print("\t"+stringArray[i]);
        }
    }
}
