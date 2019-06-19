package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TRN {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String firstLine = reader.readLine();
        String [] dimensions = firstLine.split( " " );
        // m - number of rows
        int m = Integer.parseInt(dimensions[0]);
        // n - number of columns
        int n = Integer.parseInt(dimensions[1]);
        String [][] array = new String[m][n];
        for (int i = 0; i<m; i++){
            String nextLine = reader.readLine();
            String[] arrayLine = nextLine.split( " " );
            for (int j = 0; j<n; j++){
                array[i][j] = arrayLine[j];
            }
        }
        for (int i = 0; i<n; i++){
            System.out.println();
            for (int j = 0; j<m; j++){
                System.out.print(new StringBuilder(array[j][i]).append( " " ));
            }
        }
    }
}
