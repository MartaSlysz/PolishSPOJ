package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class KC004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] numbers = line.split( " " );
            String a = numbers[0];
            int b = Integer.parseInt(numbers[1] );
            int counter = 0;
            for (int i = 2; i<numbers.length; i++){
                if (numbers[i].equals(a)){
                    counter++;
                }
            }
            System.out.println(counter);
        }
    }
}
