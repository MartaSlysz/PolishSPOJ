package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EUCGAME {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // t - number of rounds
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i<t; i++){
            String line = reader.readLine();
            String [] numbers = line.split( " " );
            int a = Integer.parseInt( numbers[0] );
            int b = Integer.parseInt( numbers[1] );
            while (a !=b){
                if (a<b){
                    b -=a;
                } else if (b<a) {
                    a -=b;
                }
            }
            System.out.println(a+b);
        }
    }
}
