package com.company;


public class PolaczPosortujTablice {
    private static void polacz(int[] x, int[] y, int a, int b) {
        int c = a + b + 1;
        while (a >= 0 && b >= 0) {
            if (x[a] > y[b]) {
                x[c--] = x[a--];
            } else {
                x[c--] = y[b--];
            }
        }
        while (b >= 0) {
            x[c--] = y[b--];
        }
    }
        public static void uporzadkowanie (int[] x, int[] y){
            int c = 0;
            for (int i = 0; i < x.length; i++) {
                if (x[i] != 0) {
                    x[c++] = x[i];
                }
            }
            polacz(x, y, c - 1, y.length - 1);
        }

    }




