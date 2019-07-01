package com.slyszmarta.algs.latwe.Algs;

import java.util.Scanner;
import java.util.Vector;

public class STOS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        Vector<Integer> stos =new Vector<Integer>();
        int b = 0;
        while (scanner.hasNextLine()){
            String a = scanner.nextLine();
            if (a.equals( "+" )){
                if (scanner.hasNextInt()){
                    b = scanner.nextInt();
                }
                if (stos.size()<10){
                    stos.addElement(b);
                    System.out.println(":)");
                } else {
                    System.out.println(":(");
                }
            } else if (a.equals( "-" )){
                if (stos.size()==0){
                    System.out.println(":(");
                } else {
                System.out.println(stos.elementAt( stos.size()- 1 ));
                stos.removeElementAt(stos.size()-1);
                }

            }

        }
    }
}
