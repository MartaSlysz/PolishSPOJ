package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PP0601B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // t - number of tests
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i< t; i++){
            String line = reader.readLine();
            String[] numbers = line.split( " " );
            // n - boundary number
            int n = Integer.parseInt( numbers[0] );
            // x - number to divide
            int x = Integer.parseInt( numbers[1] );
            // y - number not to divide
            int y = Integer.parseInt( numbers[2] );
            for (int j = 0; j < n; j++){
                if (j%x == 0 && j%y !=0){
                    System.out.print(j+" ");
                }
            }
        }
    }
}
