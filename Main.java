package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.company.CzyJakasSumaDajeZero.czyDajeZero;
import static com.company.PolaczPosortujTablice.uporzadkowanie;
import static com.company.ZnajdzPare.znajdzPare;
import static com.company.Powtarzajaca.znajdzPowtarzajaca;
import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Sumowanie konkretnych par liczb
        int A[]={1,2,3,4,5};
        int suma=7;
        znajdzPare(A,suma);

    //Czy jakas suma daje zero
        int[] B={-1,-2,4,6,-1,1,2,3};
        if(czyDajeZero(B)) {
            System.out.println("Takie liczby istnieją.");
        }
        else
            System.out.println("Takie liczby nie istnieją.");

        //Sortowanie liczb w tablicy
        int[] C={0,1,0,1,1,0,1,0,0,1,0,1};
        System.out.println("\nLiczby przed posortowaniem:");
        for(int i=0;i<C.length;i++)
        System.out.print(C[i]+", ");
        sort(C);
        System.out.println("\nLiczby po posortowaniu:");
        System.out.println(Arrays.toString(C));

        //powtarzajace sie
        int[] D={1,2,4,3,4};
        System.out.println("\nWyszukiwanie powtarzajacej sie liczby.");
        System.out.println("" + "Powtarzajaca sie liczba to: "+znajdzPowtarzajaca(D));

        //polaczenie i uporzadkowanie tablic
        int[]x={0,2,0,3,0,4,6,0,0};
        int[]y={1,7,9,10,15};
        System.out.println("\nPolaczenie i uporzadkowanie dwoch tablic:");
        uporzadkowanie(x,y);
        System.out.println(Arrays.toString(x));

    }
}


