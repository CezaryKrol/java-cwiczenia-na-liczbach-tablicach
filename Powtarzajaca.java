package com.company;

public class Powtarzajaca {
    public static int znajdzPowtarzajaca(int[] D) {
        int powt = -1;
        for (int i = 0; i < D.length; i++) {
            int wart = (D[i] < 0) ? -D[i] : D[i];
            if (D[wart - 1] >= 0) {
                D[wart - 1] = -D[wart - 1];
            } else {
                powt = wart;
                break;
            }
        }
        for (int i=0;i<D.length;i++){
            if(D[i]<0){
                D[i]=-D[i];
            }
        }
        return powt;
    }
}
