package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class PP0604A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int t = scanner.nextInt();
        for (int i = 0; i< t; i++){
            int n = scanner.nextInt();
            int [] numbers = new int[n];
            float sum = 0;
            float average = 0;

            for (int j = 0; j< n; j++){
                numbers[j] = scanner.nextInt();
                sum += numbers[j];
            }

            average = sum/n;
            float min = sum;
            int closest = 0;
            for (int j = 0; j < n;j++){
                if (Math.abs( numbers[j]-average )<min){
                    min = Math.abs( numbers[j]-average );
                    closest = numbers[j];
                }
            }
            System.out.println(closest);
        }
    }
}
