package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GLUTTON {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        // t - number of tests
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i< t; i++){

            // b - number of cake boxes to buy
            double b = 0;

            // x - time of eating one cake in seconds
            int x = 0;

            // int s - summary of eaten cakes
            double s = 0;

            String line = reader.readLine();
            String[] numbers = line.split( " " );
            // N - number of invited eaters
            int N = Integer.parseInt( numbers[0] );
            // M - number of cakes per box
            int M = Integer.parseInt( numbers[1] );
            for (int j = 0; j< N; j++){
                x = Integer.parseInt( reader.readLine());
                // c - number of cakes eaten in 24h
                double c = 0;
                c = 86400/x;
                s+=c;
            }
            b = s/M;
            if (b%1 != 0){
                b -= b%1;
                b ++;
            }
            System.out.println((int)b);
        }
    }
}
