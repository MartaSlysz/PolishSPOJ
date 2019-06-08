package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class CALC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String line = "";
        String[] calculation;
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            calculation = line.split( " " );
            String sign = calculation[0];
            int n1 = Integer.parseInt( calculation[1] );
            int n2 = Integer.parseInt( calculation[2] );
            if (sign.equals( "+" )){
                System.out.println(n1+n2);
            } else if (sign.equals( "-" )){
                System.out.println(n1-n2);
            } else if (sign.equals("*" )){
                System.out.println(n1*n2);
            } else if (sign.equals("/")){
                System.out.println(n1/n2);
            } else if (sign.equals( "%" )){
                System.out.println(n1%n2);
            }
        }
    }
}
