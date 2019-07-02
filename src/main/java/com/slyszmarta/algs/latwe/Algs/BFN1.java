package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class BFN1 {
    public static void main(String[] args) {
        // t - number of tests
        Scanner scanner = new Scanner( System.in );
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int n = scanner.nextInt();
            int sum = n;
            int counter = 0;
            while (sum!=getNumberFromRightToLeft( sum )){
                sum += getNumberFromRightToLeft(sum);
                counter++;
            }
            System.out.println(sum+" "+counter);
        }
    }

    public static int getNumberFromRightToLeft(int number){
        int reversed = 0;
        while(number != 0) {
            reversed = reversed * 10 + number % 10;
            number = number / 10;
        }
        return reversed;
    }
}
