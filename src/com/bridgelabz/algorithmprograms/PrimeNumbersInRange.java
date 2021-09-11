package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Nth term to find PrimeNumbers ");
        int num = scanner.nextInt();
         primeNumbers(num);
    }

    private static void primeNumbers(int num) {
        int a[]=new int[num];int k=0;
        for(int i=0;i<num;i++)
        {
            if(isPrime(i))
            {
                a[k]=i;
                k++;
            }
        }
        int len=0;
        for (int i=0; i<a.length; i++)
        {
            if (a[i] != 0)
                len++;
        }

        int [] newArray = new int[len];
        int j=0;
        for (int i=0; i<a.length; i++)
        {
            if (a[i] != 0) {
                newArray[j] = a[i];
                j++;
            }
        }
        System.out.print("Prime Numbers in the Range of  "+num+" are:");
                for (int integer : newArray) {
                    System.out.print("  "+integer);
                }
    }

    private static boolean isPrime(int num) {
        for(int i=2; i<=num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
