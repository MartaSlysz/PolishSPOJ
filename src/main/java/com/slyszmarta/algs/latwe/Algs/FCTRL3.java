package com.slyszmarta.algs.latwe.Algs;

import java.io.IOException;
import java.util.Scanner;

public class FCTRL3 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int x,y;
        long z=1;
        x = in.nextInt();
        for(int i=0; i<x; i++) {
            y = in.nextInt();
            if(y<1) z=1;
            if(y>20) z=0;
            else {
                for(int j=1; j<=y; j++) {
                    z*=j;
                }
            }
            System.out.println((z/10%10) + " " + (z%10) + "\n");
            z=1;
        }
    }

}