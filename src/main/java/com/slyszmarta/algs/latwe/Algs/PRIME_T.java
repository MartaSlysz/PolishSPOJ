package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class PRIME_T {

    public static void main(String[] args) throws java.lang.Exception {
        Scanner inputScanner = new Scanner( System.in );
        int N = inputScanner.nextInt();
        for (int i = 0; i<N; i++){
            System.out.println(checkPrime(inputScanner.nextInt()));
        }
    }

    private static String checkPrime(int numberToCheck){
        if (numberToCheck < 2 ){
            return "NIE";
        } else {
            for (int i = 2; i < numberToCheck; i++){
                if (numberToCheck%i==0){
                    return "NIE";
                }
            }
            return "TAK";
        }
    }
}
