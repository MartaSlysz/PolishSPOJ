package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PP0602A {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // t - number of tests
        int t = Integer.parseInt( reader.readLine() );
        for (int i = 0; i< t; i++){
            String line = reader.readLine();
            String[] numbers = line.split( " " );
            // n - number of numbers
            int n = Integer.parseInt( numbers[0] );
            int[] array = new int[n];
            int[] result = new int[n];
            for (int j = 0; j< n; j++){
                array[j] = Integer.parseInt(numbers[j+1]);
            }
            if (n%2 == 0){
                for (int k = 0; k<median(n)+1; k++){
                    result[k] = array[2*k+1];
                }
                int o = 0;
                for (int l = median(n)+1; l<n; l++){
                    result[l] = array[o];
                    o+=2;
                }
            } else {
                for (int k = 0; k< median(n); k++){
                    result[k] = array[2*k+1];
                }
                int p = 0;
                for (int l = median(n); l<n; l++){
                    result[l] = array[p];
                    p+=2;
                }
            }
            for (int m = 0; m< result.length; m++){
                System.out.print(result[m]+" ");
            }
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
