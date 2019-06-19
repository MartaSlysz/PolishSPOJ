package com.slyszmarta.algs.latwe.Algs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PP0601A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int elementsCounter = 0;
        int counter = 0;
        List<String> numbers = new ArrayList<>(  );
        while (scanner.hasNextLine() && counter<3){
            numbers.add(scanner.nextLine());
            elementsCounter++;
            if (elementsCounter>=2){
                if (numbers.get( elementsCounter-1 ).equals( "42" ) && !numbers.get( elementsCounter-2).equals( "42" )){
                    counter++;
                }
            }
            System.out.println(numbers.get(elementsCounter-1));
        }
    }
}
