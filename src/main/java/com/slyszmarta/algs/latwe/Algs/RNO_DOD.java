package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class RNO_DOD {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner( System.in );
        // t = number of tests
        int t = inputScanner.nextInt();
        int[] result = new int[t];
        String[] numbersTable;
        for (int i = 0; i< t; i++){
            // n - number of numbers per test
            int n = inputScanner.nextInt();
            inputScanner.nextLine();
            numbersTable = inputScanner.nextLine().split( " " );
            int sum = 0;
            for (int j = 0; j< n; j++){
                sum += Integer.parseInt(numbersTable[j]);
            }
            result[i] = sum;
        }

        for (int k = 0; k< t; k++){
            System.out.println(result[k]);
        }
    }
}

