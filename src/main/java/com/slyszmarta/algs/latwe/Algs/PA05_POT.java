package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PA05_POT {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // D - number of tests
        int D = Integer.parseInt(reader.readLine());
        for (int i = 0; i<D; i++){
            String line = reader.readLine();
            String[] numbers = line.split( " " );
            double a = Integer.parseInt( numbers[0] );
            double b = Integer.parseInt( numbers[1] );
            System.out.println(String.format("%.0f",(unityDigit(a, b))));
        }
    }

    public static double unityDigit(double a, double b){
        double result = a%10;
        double rest = b%4;
        if (rest ==0){
            return Math.pow(a%10, 4)%10;
        }
        for (int j = 1; j < rest; j++)
            result = result * (a % 10);
        return result % 10;
    }
}
