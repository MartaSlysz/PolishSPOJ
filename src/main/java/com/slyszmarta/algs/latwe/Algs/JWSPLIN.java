package com.slyszmarta.algs.latwe.Algs;

import java.io.IOException;
import java.util.Scanner;

public class JWSPLIN {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner( System.in );
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int [] x = new int[3];
            int [] y = new int[3];
            x[0] = scanner.nextInt();
            y[0] = scanner.nextInt();
            x[1] = scanner.nextInt();
            y[1] = scanner.nextInt();
            x[2] = scanner.nextInt();
            y[2] = scanner.nextInt();
            boolean detResult = detChecking( x[0], y[0], x[1], y[1], x[2], y[2] );
            if (detResult){
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
    }

    private static boolean detChecking(int x1, int y1, int x2, int y2, int x3, int y3){
        int det = x1*y2+y1*x3+x2*y3-x1*y3-y1*x2-y2*x3;
        return det == 0;
    }

}
