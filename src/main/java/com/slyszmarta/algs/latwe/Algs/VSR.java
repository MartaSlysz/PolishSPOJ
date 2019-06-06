package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class VSR {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner( System.in);
        // t - number of tests
        int t = inputScanner.nextInt();
        int[] result = new int[t];
        inputScanner.nextLine();
        for (int i = 0; i < t; i++){
            String [] numbers = inputScanner.nextLine().split( " " );
            int v1 = Integer.parseInt(numbers[0]);
            int v2 = Integer.parseInt(numbers[1]);
            result[i] = (2*v2*v1)/(v1+v2);
        }
        for (int j = 0; j< t; j++){
            System.out.println(result[j]);
        }
    }
}
