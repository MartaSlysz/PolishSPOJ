package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class PTEST {

    public static void main(String[] args) {
        
        //do SPOJA należy wklejać bez SOUTów, goły algorytm

//        System.out.println("Podaj liczbę A.");
        Scanner inputScanner = new Scanner( System.in );
        int a = inputScanner.nextInt();
//        System.out.println("Podaj liczbę B.");
        int b = inputScanner.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}
