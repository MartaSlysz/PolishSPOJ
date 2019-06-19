package com.slyszmarta.algs.latwe.Algs;

import java.util.Locale;
import java.util.Scanner;

public class KC003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in ).useLocale( Locale.US );
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] numbers = line.split( " " );
            double a = Double.parseDouble( numbers[0] );
            double b = Double.parseDouble( numbers[1] );
            double c = Double.parseDouble( numbers[2] );
            if (a<=(b+c) && b<=(a+c) && c<=(a+b)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }
    }
}
