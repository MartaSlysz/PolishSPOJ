package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class POTSAM {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String line = reader.readLine();
        String[] numbers = line.split( " " );
        int n1 = Integer.parseInt( numbers[0]);
        int k1 = Integer.parseInt( numbers[1]);
        int n2 = Integer.parseInt( numbers[2]);
        int k2 = Integer.parseInt( numbers[3]);
        int result = n1*k1+n2*k2;
        System.out.println(result);
    }
}
