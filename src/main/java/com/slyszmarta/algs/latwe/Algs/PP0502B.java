package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PP0502B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // t - number of tests
        String line = "";
        String[] numbers;
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i<t; i++){
            line = reader.readLine();
            numbers = line.split( " " );
            int n = Integer.parseInt(numbers[0]);
            for (int j = n; j>0; j--){
                System.out.print(numbers[j]+" ");
            }
        }
    }
}
