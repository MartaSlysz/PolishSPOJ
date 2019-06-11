package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class POL {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader( new InputStreamReader( System.in ) );
        int t = Integer.parseInt( reader.readLine() );
        for (int i =0; i< t; i++){
            String line = reader.readLine();
            String output = line.substring( 0, median(line.length())+1 );
            System.out.println(output);
        }
    }

    private static int median(int a){
        int middle = a/2;
        if (a%2 ==0){
            return (middle+(middle-1))/2;
        } else {
            return middle;
        }
    }
}
