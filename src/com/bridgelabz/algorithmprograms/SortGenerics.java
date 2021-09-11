package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortGenerics {
  static   Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter 1 to Sort String type (insertion  sort)");
        System.out.println("Enter 2 to sort Integer type(Bubble Sort)");
        switch(scanner.nextInt()){
            case 1:
                SortGenerics.stringSort();
                break;
            case 2:
                SortGenerics.integerSort();
                break;
        }

    }

    private static void integerSort() {
        List<Integer> list = new ArrayList<Integer>();
        System.out.println("Size of the list");
        int number = scanner.nextInt();
        System.out.println("Enter "+number+"  to Sort");
        for (int i = 0; i < number; i++){
            Integer input = scanner.nextInt();
            list.add(input);
        }
        Integer[] intArray= new Integer[list.size()];
        intArray=list.toArray(intArray);
        System.out.println("Before sorting:");
        for (int i = 0; i < intArray.length; i++)
        {
            System.out.print("  "+intArray[i]);
        }
        sorting(intArray);
    }

    private static void stringSort() {
        List<String> list = new ArrayList<String>();
        System.out.println("Size of the list");
        int number = scanner.nextInt();
        System.out.println("Enter "+number+"   Strings to Sort");
        for (int i = 0; i < number; i++){
            String input = scanner.next();
            list.add(input);
        }
        String[] stringArray= new String[list.size()];
        stringArray=list.toArray(stringArray);
        System.out.println("Before sorting:");
        for (int i = 0; i < stringArray.length; i++)
        {
            System.out.print("  "+stringArray[i]);
        }
        sorting(stringArray);

    }

    private static <T extends Comparable<T>> void sorting(T[] sortArray) {
        int length=sortArray.length;
        int j;
        T temp;
        for(int i=0;i<length;i++)
        {
            j=i;
            temp = sortArray[i];
            while(j>0&&temp.compareTo(sortArray[j-1])<0)
            {//
                sortArray[j]=sortArray[j-1];
                j=j-1;
            }
            sortArray[j]=temp;//insert unsorted element
        }
        System.out.println("\nSorted Array:");
        for (int i = 0; i < sortArray.length; i++)
        {
            System.out.print("  "+sortArray[i]);
        }
    }
}
