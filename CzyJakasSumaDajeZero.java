package com.company;

import java.util.HashSet;
import java.util.Set;

public class CzyJakasSumaDajeZero {
    public static boolean czyDajeZero(int[] B){
        Set<Integer> set=new HashSet<>();
        set.add(0);
        int suma=0;
        System.out.println("Sprawdzenie czy w tablicy istnieją liczby które po zsumowaniu dają zero.");

        for (int i = 0; i <B.length ; i++) {
            suma+=B[i];
            if(set.contains(suma)){
                return true;
            }
            set.add(suma);
        }

        return false;
    }
}
