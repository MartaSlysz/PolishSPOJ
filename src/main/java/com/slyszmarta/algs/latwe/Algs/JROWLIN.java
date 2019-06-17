package com.slyszmarta.algs.latwe.Algs;

import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;

public class JROWLIN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in ).useLocale( Locale.US );
        String line = scanner.nextLine();
        String [] numbers = line.split( " " );
        double a = Double.parseDouble( numbers[0] );
        double b = Double.parseDouble( numbers[1] );
        double c = Double.parseDouble( numbers[2] );
        if (a != 0){
            double result = (c-b)/a;
            System.out.println(new Formatter( Locale.US).format("%.2f", result));
        } else if ((a==0 && b==0) || (a ==0 &&b==c)){
            System.out.println("NWR");
        } else if (a==0 && b!=0){
            System.out.println("BR");
        }
    }
}
