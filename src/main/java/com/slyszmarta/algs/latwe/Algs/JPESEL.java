package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JPESEL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i< t; i++){
            String PESEL = reader.readLine();
            int[] digits = new int[PESEL.length()];
            for (int j = 0; j< PESEL.length(); j++){
                digits[j] = Integer.parseInt(String.valueOf( PESEL.charAt( j ) ) );
            }
            int validation = digits[0] + 3*digits[1] + 7*digits[2]+9*digits[3]+digits[4] + 3*digits[5] + 7*digits[6]+9*digits[7]+digits[8]+3*digits[9]+digits[10];
            if (validation >0){
                int a = 0;
                if (validation%10>0){
                    a = validation%10;
                }
                if (a ==0){
                    System.out.println("D");
                }
                else System.out.println("N");
            }
        }

    }
}
