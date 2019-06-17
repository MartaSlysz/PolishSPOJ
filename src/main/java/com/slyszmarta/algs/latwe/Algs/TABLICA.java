package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TABLICA {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String line = reader.readLine();
        String[] numbers = line.split( " " );
        for (int i = numbers.length-1; i>= 0; i--){
            System.out.print(numbers[i]+" ");
        }
    }
}
