package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MWPZ06X {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        //D - number of data sets
        int D = Integer.parseInt( reader.readLine() );
        for (int i = 0; i<D; i++){
            // X = number of steps
            int X = Integer.parseInt( reader.readLine() );
            int X2 = (int) Math.pow(X, 2);
            System.out.println(X2);
        }
    }
}
