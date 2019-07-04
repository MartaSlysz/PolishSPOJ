package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class JZLICZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int N = scanner.nextInt();
        scanner.nextLine();
        String[] line = new String[N];
        String allLines = "";
        int counter;


        for (int i = 0; i < N; i++){
            line[i] = scanner.nextLine();
            allLines+=line[i];
        }


        for (char l = 'a'; l <= 'z'; l++){
            counter = 0;
            for (int m = 0; m< allLines.length(); m++){
                if (allLines.charAt( m )==l){
                    counter++;
                }
            }
            if (counter>0){
                System.out.println(l+" "+counter);
            }
        }
        for (char j = 'A'; j<='Z'; j++){
            counter = 0;
            for (int k = 0; k<allLines.length(); k++){
                if (allLines.charAt( k )==j){
                    counter++;
                }
            }
            if (counter>0){
                System.out.println(j+" "+counter);
            }
        }
    }
}
