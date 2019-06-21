package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PP0504B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // t - number of tests
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i< t; i++){
            String line = reader.readLine();
            String [] words = line.split( " " );
            if (words[0].length() >= words[1].length()){
                for (int j = 0; j<words[1].length(); j++){
                    System.out.print(string_merge(words[0].charAt( j ), words[1].charAt( j )));
                }
            } else if (words[0].length()< words[1].length()){
                for (int j = 0; j< words[0].length(); j++){
                    System.out.print(string_merge( words[0].charAt( j ), words[1].charAt( j ) ));
                }
            }
            System.out.println();
        }
    }
    public static String string_merge (char a, char b){
        StringBuilder result = new StringBuilder(  );
         return result.append( a ).append( b ).toString();
    }
}
