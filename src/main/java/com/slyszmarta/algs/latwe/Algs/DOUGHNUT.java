package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DOUGHNUT {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // t - number of tests
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i<t; i++){
            String line = reader.readLine();
            String[] numbers = line.split( " " );
            // c - number of cats
            int c = Integer.parseInt( numbers[0] );
            // k - kilos Harry can carry
            int k = Integer.parseInt( numbers[1] );
            // w - weight of donut
            int w = Integer.parseInt( numbers[2] );
            if (k >= c*w){
                System.out.println("yes");
            } else if (k < c*w) {
                System.out.println("no");
            }
        }
    }
}
