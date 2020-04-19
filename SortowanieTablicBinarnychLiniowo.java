package com.company;

public class SortowanieTablicBinarnychLiniowo {
    public static void sort(int[] C){
        int zero=0;
        for(int i=0;i<C.length;i++){
            if (C[i]==0){
                zero++;
            }
        }
        int p=0;
        while(zero-- !=0){
            C[p++]=0;
        }
        while(p<C.length){
            C[p++]=1;
        }
    }
}
