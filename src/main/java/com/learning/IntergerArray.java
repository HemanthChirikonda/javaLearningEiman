package com.learning;

public class IntergerArray {
    public static void main(String[] args) {

        int[] ary = {9,8,7,6,5,2,1,6};
        int[] out = new int[ary.length];
        for(int i = 0; i<ary.length; i++){
            int temp = 0;
           for (int j = i+1; j<ary.length-1; j++){
               temp= ary[i];
               if(ary[i] > ary[j]){
                  out[i] = ary[j];
                  out[j] = temp;
                  break;
               }
           }
        }

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }

    }
}
