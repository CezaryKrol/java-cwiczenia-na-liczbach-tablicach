package com.company;

public class ZnajdzPare {

        public static void znajdzPare(int[] A, int suma){
            for (int i = 0; i <A.length-1 ; i++) {
                for (int j = i+1; j <A.length ; j++) {
                    if(A[i]+A[j]==suma){
                        System.out.println("\nSumowanie konkretnych par liczb\nSzukamy pary, która po zsumowaniu da liczbę: "+suma);
                        System.out.println("Para dla liczby, to liczba numer: " + i +". i liczba numer: "+j+". "+"Czyli liczba: "
                        +A[i]+" oraz: "+A[j]+"\nDziękuję za uwagę.\n");
                        return;
                    }
                }
            }
            System.out.println("Nie znaleziono pary");
        }

    }

