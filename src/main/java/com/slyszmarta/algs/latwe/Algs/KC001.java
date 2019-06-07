package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KC001 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        int a = Integer.parseInt( reader.readLine() );
        int b = Integer.parseInt( reader.readLine() );
        int c = Integer.parseInt( reader.readLine() );
        System.out.println(a+b+c);
    }
}
