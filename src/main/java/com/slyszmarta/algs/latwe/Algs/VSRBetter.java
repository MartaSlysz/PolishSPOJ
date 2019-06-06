package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VSRBetter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );
        int t = Integer.parseInt( bufferedReader.readLine());
        String line = "";
        int[] result = new int[t];
        for (int i = 0; i<t; i++){
           line = bufferedReader.readLine();
           String [] numbers = line.split( " " );
           int v1 = Integer.parseInt( numbers[0] );
           int v2 = Integer.parseInt( numbers[1] );
           result[i] = (2*v1*v2)/(v1+v2);
        }
        for (int j = 0; j<t; j++){
            System.out.println(result[j]);
        }
    }
}
