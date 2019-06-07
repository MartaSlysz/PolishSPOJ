package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PRZEDSZK {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        //N - number of sets
        int N = Integer.parseInt( reader.readLine() );
        for (int i = 0; i<N; i++){
            String line = reader.readLine();
            String[] numbers = line.split( " " );
            int a = Integer.parseInt( numbers[0] );
            int b = Integer.parseInt( numbers[1] );
            System.out.println(scm( a, b ));
        }
    }

    //we have to get the smallest common multiple
    public static int scm(int a, int b){
       return (a*b)/nwd( a, b );
    }
    // we use method based on Euclid's algorithm from PP0501A
    public static int nwd(int a, int b){
        while (a != b){
            if (a>b){
                a-=b;
            } else {
                b-=a;
            }
        }
        return a;
    }

}
