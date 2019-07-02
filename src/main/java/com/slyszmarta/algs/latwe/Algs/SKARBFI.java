package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;

public class SKARBFI {
    public static void main(String[] args) {
        //D - number of data sets
        int a = 0;
        int b = 0;
        int xWell = 0;
        int yWell = 0;
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner( System.in );
        int D = scanner.nextInt();
        for (int i = 0; i < D; i++){
            int N = scanner.nextInt();
            x = 0;
            y = 0;
            for (int j =0; j < N; j++){
                a = scanner.nextInt();
                b = scanner.nextInt();
                switch (a){
                    case 1:
                        y-=b;
                        break;
                    case 2:
                        x-=b;
                        break;
                    case 3:
                        x+=b;
                        break;
                    case 0:
                        y+=b;
                        break;
                }
            }

            if (y>0){
                System.out.println("0 "+Math.abs( y ));
            } else if (y <0){
                System.out.println("1 "+Math.abs( y ));
            }
            if (x>0){
                System.out.println("3 "+Math.abs( x ));
            } else if (x<0){
                System.out.println("2 "+Math.abs( x ));
            }
            if (x==xWell && y==yWell){
                System.out.println("studnia");
            }
        }
    }
}
