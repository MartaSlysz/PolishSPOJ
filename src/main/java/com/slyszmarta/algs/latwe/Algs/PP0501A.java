package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PP0501A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int t = Integer.parseInt( reader.readLine() );
        String line = "";
        int[] results = new int[t];
        for (int i = 0; i<t; i++){
            line = reader.readLine();
            String [] numbers = line.split( " " );
            int a = Integer.parseInt( numbers[0] );
            int b = Integer.parseInt( numbers[1] );
            results[i]= nwd(a, b);
        }
        for (int j = 0; j<t; j++){
            System.out.println(results[j]);
        }
    }

    //method based on Euclid's algorithm
    public static int nwd(int a, int b){
        while (a != b){
            if (a>b){
                a-=b;
            } else {
                b-=a;
            }
        }
        return a;
    }
}
