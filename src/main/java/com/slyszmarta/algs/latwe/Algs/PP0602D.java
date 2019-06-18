package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PP0602D {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        String testLine = reader.readLine();
        String[] tests = testLine.split( " " );
        int n = Integer.parseInt( tests[0] );
        int k = Integer.parseInt( tests[1] );
        String numbersLine = reader.readLine();
        String[] numbers = numbersLine.split( " " );
        String [] result = numbers;
        for (int j = 0; j<k; j++){
            shiftLeft( result, n );
        }
        for (int i = 0; i< n; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static void shiftLeft(String[] arr, int n){
        //n - arr length, d- places to switch left
        String temp = arr[0];
        for (int i = 0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
}
