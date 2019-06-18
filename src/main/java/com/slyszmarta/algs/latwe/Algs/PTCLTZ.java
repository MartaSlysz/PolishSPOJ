package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTCLTZ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        //t - number of tests
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i< t; i++){
            // n - number in test
            int x = Integer.parseInt( reader.readLine() );
            // n - counter
            int n = 0;
            while (x != 1){
                if (x%2 ==0){
                    x = x/2;
                    n++;
                } else {
                    x = 3*x+1;
                    n++;
                }
            }
            System.out.println(n);
        }
    }
}
