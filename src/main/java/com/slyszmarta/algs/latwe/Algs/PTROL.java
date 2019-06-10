package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PTROL {

    public static void shiftLeft(String []arr,int d,int n) {
        String temp =  arr[0];
        for(int i=0;i<n-d;i++) {
            arr[i] = arr[i+d];
        }
        arr[n-1] = temp;
    }

        public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        //t - number of tests
        String line = "";
        String[] numbers;
        String temp = "";
            int t = Integer.parseInt(reader.readLine());
            for (int i = 0; i < t; i++){
            line = reader.readLine();
            numbers = line.split( " " );
            int n = Integer.parseInt(numbers[0]);
            String[] result = new String[n];
            for (int j = 0; j<n; j++){
                temp = numbers[j+1];
                result[j] = temp;
            }
            shiftLeft(result, 1, n );
            for (int l = 0; l < n; l++){
                System.out.print(result[l]+" ");
            }
        }
    }
}
