package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class CALC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int[] reg = new int[10];
        for (int i = 0; i< reg.length; i++){
            reg[i] = 0;
        }
        int num1 = 0;
        int num2 = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] calc = line.split( " " );
            String sign = calc[0];
            int n1 = Integer.parseInt(calc[1]);
            int n2 = Integer.parseInt(calc[2]);
            if (sign.equals( "z" )){
                reg[n1]= n2;
            }
            else if (sign.equals( "+" )){
                System.out.println(reg[n1]+reg[n2]);
            }
            else if (sign.equals( "-" )){
                System.out.println(reg[n1]-reg[n2]);
            }
            else if (sign.equals( "*" )){
                System.out.println(reg[n1]*reg[n2]);
            }
            else if (sign.equals( "/" )){
                System.out.println(reg[n1]/reg[n2]);
            }
            else if (sign.equals( "%" )){
                System.out.println(reg[n1]%reg[n2]);
            }

        }
    }
}
