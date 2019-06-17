package com.slyszmarta.algs.latwe.Algs;

import java.util.Locale;
import java.util.Scanner;

public class ROWNANIE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in ).useLocale( Locale.US );
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] numbers = line.split( " " );
            double a = Double.parseDouble( numbers[0] );
            double b = Double.parseDouble( numbers[1] );
            double c = Double.parseDouble( numbers[2] );
            double delta = Math.pow( b, 2 )-4*a*c;
            if (delta>0){
                System.out.println("2");
            } else if (delta ==0){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
