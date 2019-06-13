package com.slyszmarta.algs.latwe.Algs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FLAMASTE {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );
        // D - number of tests
        int D = Integer.parseInt( reader.readLine());
        for (int i = 0; i<D; i++){
            String line = reader.readLine();
            char[] letters = line.toCharArray();
            char[] letters2 = new char[letters.length];
            for (int j = 0; j < letters.length - 1; j++) {
                letters2[j] = line.charAt(j + 1);
            }
            for (int k = 0; k< letters.length; k++){
                int counter = 1;
                while (letters[k]==letters2[k]){
                    counter++;
                    k++;
                }
                if (counter<2){
                    System.out.print(letters[k]);
                } else if (counter==2){
                    System.out.print(letters[k]);
                    System.out.print(letters[k]);
                } else {
                    System.out.print(letters[k]);
                    System.out.print(counter);
                }
            }
            System.out.println();
        }
    }
}
