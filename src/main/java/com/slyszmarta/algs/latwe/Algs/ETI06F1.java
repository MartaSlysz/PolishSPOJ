package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Formatter;
import java.util.Locale;

public class ETI06F1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String line = reader.readLine();
        String[] data = line.split( " " );
        double r = Double.parseDouble(data[0]);
        double d = Double.parseDouble(data[1]);
        double x = (Math.pow(r, 2)-(Math.pow(d,2)/4));
        double field = 3.141592654*x;
        System.out.println(new Formatter( Locale.US).format("%.2f", field));
    }
}
