package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

// According to Unicode character table we are interested in capital letters
// https://unicode-table.com/en/#0041

public class JSZYCER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(encrypt( line ));
        }
    }

    public static String encrypt(String message){
        StringBuilder sb = new StringBuilder( message );
        int distance = 3;
        for (int i = 0; i < sb.length(); i++){
            int c = (int)sb.charAt(i);
            if (c+distance >90){
                c = 65+(distance - (90-c))-1;
            } else if (c+distance<= 90 && c+distance>=65) {
                c+= distance;
            }
            sb.setCharAt( i, (char) c );
        }
        return sb.toString();
    }
}
