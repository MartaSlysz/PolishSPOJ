package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class KC009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            for (int i = line.length()-1; i >=0; i--){
                System.out.print(line.charAt(i));
            }
            System.out.println();
        }
    }
}
